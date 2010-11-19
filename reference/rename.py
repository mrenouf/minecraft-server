#!/usr/bin/python

import sys
import string
import os
import subprocess

def main(args=sys.argv):
    target = args[1]
    target = os.path.abspath(target)
    for line in sys.stdin:
        (a, b, score) =  string.split(line.strip(), ' ')
        if a.startswith('#'):
            continue
        a = string.replace(a, '.class', '.java')
        b = string.replace(b, '.class', '.java')
        if not os.path.exists(os.path.join(target, a)):
            if os.path.exists(os.path.join(target, a + '_')):
                a = a + '_'
            else:
                print 'WARNING: source file is missing: ' + a
                continue

        if os.path.exists(os.path.join(target, b)):
            p = subprocess.Popen(['git', 'mv', b,  b + '_'], cwd=target)
            p.wait()
            
        p = subprocess.Popen(['git', 'mv', a,  b], cwd=target)
        p.wait()
        
if __name__=="__main__":
    main()
