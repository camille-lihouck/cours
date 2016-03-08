# -*- coding: utf-8 -*-

"""
:mod:`test` module : test module for quicksort assignment

:author: `FIL - IEEA - Univ. Lille1.fr <http://portail.fil.univ-lille1.fr>`_

:date: 2016, january
"""

import sorting
import generate
import copy

global cpt


def cmp(a,b):
    """
    A comparison function

    :param a: First element    
    :param b: Second element
    :return: 0 if a == b, 1 if a > b, -1 if a < b
    :rtype: int

    >>> cmp(10,5)
    -1
    >>> cmp(5,5)
    0
    >>> cmp(5,10)
    1
    """
    global cpt
    cpt = cpt + 1
    if a == b:
        return 0
    elif a < b:
        return -1
    else:
        return 1

if __name__ == "__main__":
    for i in range (100):
        moy_first=0
        moy_rand=0
        for j in range (100):
            cpt = 0
            t = generate.random_list(i+1)
            t2 = copy.deepcopy(t)
            sorting.quicksort(t,cmp,'first')
            if generate.is_sorted (t):
                moy_first+=cpt
            else:
                raise Exception("List has not been correctly sorted by quicksort with the first element as pivot")
            cpt=0
            sorting.quicksort(t2,cmp,'random')
            if generate.is_sorted (t2):
                moy_rand+=cpt
            else:
                raise Exception("List has not been correctly sorted by quicksort with a random pivot")
        print("%d %d"%(moy_first/100,moy_rand/100))
        
