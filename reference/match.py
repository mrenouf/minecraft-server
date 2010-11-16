#!/usr/bin/python

import sys
import os
import subprocess
import threading,Queue,time,sys,traceback
from timeit import itertools
from operator import itemgetter

# Some tuneable parameters for simhash
feature_count=1024
shingle_size=4

# Number of threads for initial scoring
num_worker_threads=6

scores={}

def get_files(d):
  return filter(lambda f: not os.path.isdir(os.path.join(d, f)) \
      and not f.endswith('.sim') and os.path.getsize(os.path.join(d, f)) > 0, \
      os.listdir(d))

def gen_hash(path, files):
  args = ['simhash', '-f', str(feature_count), '-s', str(shingle_size), '-w']
  args.extend(map(lambda f: os.path.join(path, f), files))
  subprocess.check_call(args)

def score(group1_file, group2_file):
  p = subprocess.Popen(['simhash', '-c', group1_file + '.sim', group2_file + '.sim'], \
  	stdout=subprocess.PIPE)
  p.wait()
  score = p.stdout.readline().strip()
  if len(score) > 0:
    score = float(score)
  return score

def git_rename():
    return

def build_scores():
  global scores
  while True:
    f1 = q.get()
    scores[f1] = max(itertools.imap(lambda f2: \
        (f2, score(os.path.join(g1_dir, f1), os.path.join(g2_dir, f2))), g2), \
        key=lambda i: i[1])
    q.task_done()


def main(args=sys.argv):
  global q, g1_dir, g2_dir, g1, g2, scores
  (g1_dir, g2_dir) = args[1:3] 

  if not (os.path.exists(g1_dir) or os.path.exists(g2_dir)):
    print "Usage <group1_dir> <group2_dir>"
    return 1

  g1 = get_files(g1_dir)
  gen_hash(g1_dir, g1)

  g2 = get_files(g2_dir)
  gen_hash(g2_dir, g2)

  q = Queue.Queue()
  for i in range(num_worker_threads):
    t = threading.Thread(target=build_scores)
    t.daemon = True
    t.start()

  # queue up all files in group1 and wait
  for f1 in g1: 
    q.put(f1)
  q.join()
  
  # build an inverse map
  matches={}
  for f1 in g1:
    (f2, score) = scores[f1]
    matches[f2] = (f1, score)

  # join this with the forward map, taking the best overall match
  for f1 in g1:
    (f2, score) = scores[f1]
    if (score > matches[f2][1]):
      matches[f2] = (f1, score)

  # flatten into list of tuples
  result = [(matches[f2][0], f2, matches[f2][1]) for f2 in matches.keys()]

  # sort, format and output the results
  print "\n".join(map(lambda e: "%s %s %2.2f" % e, sorted(result, key=itemgetter(2), reverse=True)))

if __name__=="__main__":
  sys.exit(main())
