#!/usr/bin/python

import sys
import os
import subprocess

# Some tuneable parameters for simhash
feature_count=1024
shingle_size=4

def get_files(d):
  return filter(lambda f: not f.endswith('.sim'), os.listdir(d))

def gen_hash(path, files):
  args = ['simhash', '-f', str(feature_count), '-s', str(shingle_size), '-w']
  args.extend(map(lambda f: os.path.join(path, f), files))
  subprocess.check_call(args)

def score(group1_file, group2_file):
  p = subprocess.Popen(['simhash', '-c', group1_file + '.sim', group2_file + '.sim'], \
	stdout=subprocess.PIPE, stderr=subprocess.PIPE)
  p.wait()
  score = p.stdout.readline().strip()
  if len(score) is 0:
    return 0
  return float(score)

def main(args=sys.argv):
  (group1_dir, group2_dir) = args[1:3] 

  if not (os.path.exists(group1_dir) or os.path.exists(group2_dir)):
    print "Usage <group1_dir> <group2_dir>"
    return 1

  group1 = get_files(group1_dir)
  gen_hash(group1_dir, group1)

  group2 = get_files(group2_dir)
  gen_hash(group2_dir, group2)

  matches={}

  for group1_file in group1:
    best=""
    best_score = 0
    for group2_file in group2:
      file_score = score(os.path.join(group1_dir, group1_file), \
	os.path.join(group2_dir, group2_file))
      if file_score > best_score:
        best = group2_file
        best_score = file_score

    print "%s %s %2.2f" % (group1_file, best, best_score)
    if matches.has_key(best) and best_score > matches[best]['score']:
      orig = matches[best]['match']
      print "%s: %s replaces %s (%2.3f => %2.3f)" % (group1_file, orig, best, matches[best]['score'], best_score)
      matches[best] = {'match': group1_file, 'score': best_score};
    elif not matches.has_key(best):
      matches[best] = {'match': group1_file, 'score': best_score};
    
  print "------------------"
  print "\n".join(map(lambda k: "%s %s %2.2f" % (matches[k]['match'], k, matches[k]['score']), sorted(matches)))

if __name__=="__main__":
  sys.exit(main())
