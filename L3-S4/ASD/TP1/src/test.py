# -*- coding: utf-8 -*-

"""
:mod:`test` module : test module for experiences assignment

:author: `FIL - IEEA - Univ. Lille1.fr <http://portail.fil.univ-lille1.fr>`_

:date: 2015, december
"""

import sys
import experience
import sorting


def compare (m1,m2):
    global cpt
    cpt = cpt +1
    return experience.compare(m1,m2)

# STRATEGY 1
def negative_markers1(markers,positive):
    """
    Computes the list of negative markers from the list of markers and
    the list of positive markers.

    :param markers: The list of markers
    :type markers: List of String
    :param positive: The list of positive markers
    :type positive: List of String
    :return: The list of negative markers
    :rtype: List of String
    """
    negative = []
    for element in markers:
        mark_in=False
        i=0
        while not mark_in and i<len(positive):
            if compare(element,positive[i])==0:
                mark_in=True
            i+=1
        if not mark_in:
            negative.append(element)
    return negative

# STRATEGY 2
def negative_markers2(markers,positive):
    """
    Computes the list of negative markers from the list of markers and
    the list of positive markers.

    :param markers: The list of markers
    :type markers: List of String
    :param positive: The list of positive markers
    :type positive: List of String
    :return: The list of negative markers
    :rtype: List of String
    """
    negative = []
    positive=sorting.merge_sort(positive,compare)
    for element in markers:
        if not recherche_dichotomique(element,positive):
            negative.append(element)
    return negative

    
def recherche_dichotomique(element,li):
    """
    Recursive implementation of binary search algorithm

    :param element: the element to search
    :type element: element of li
    :param li: the list to search in
    :type li: list of element
    :return: True if element in li False otherwise
    """
    if len(li)==1:
        if compare(element,li[0])==0:
            return True
        else :
            return False
    else:
        middle=len(li)//2
        if compare(element,li[middle])==-1:
            return recherche_dichotomique(element, li[:middle])
        else:
            return recherche_dichotomique(element, li[middle:])



# STRATEGY 3
def negative_markers3(markers,positive):
    """
    Computes the list of negative markers from the list of markers and
    the list of positive markers.

    :param markers: The list of markers
    :type markers: List of String
    :param positive: The list of positive markers
    :type positive: List of String
    :return: The list of negative markers
    :rtype: List of String
    """
    negative = []
    positive=sorting.merge_sort(positive,compare)
    markers=sorting.merge_sort(markers,compare)
    index=0
    ended=False
    for element in markers:
        if not ended:
            while (not ended) and compare(element,positive[index])==1:
                index+=1
                if index>=len(positive):
                    ended=True
            if ended or compare(element,positive[index])==-1:
                negative.append(element)
        else:
            negative.append(element)
    return negative


# Executable Tests
        
if __name__ == "__main__":
    if len (sys.argv)>2:
        p = int(sys.argv[1])
        m = int(sys.argv[2])
    
        markers = experience.markers(m)
        positive = experience.experience(p,markers)

        print("Markers: %s" % (markers))
        print("Positive markers: %s" % (positive))
    
        # test stategy 1
        cpt = 0
        print("Negative markers: %s" % (negative_markers1(markers,positive)))
        print("Nb. comparisons: %d" % (cpt))
    
        # test stategy 2
        cpt = 0
        print("Negative markers: %s" % (negative_markers2(markers,positive)))
        print("Nb. comparisons: %d" % (cpt))

        # test stategy 3
        cpt = 0
        print("Negative markers: %s" % (negative_markers3(markers,positive)))
        print("Nb. comparisons: %d" % (cpt))

    else:
        # if only one parameter is given, make the experiment for all 1<=p<=m
        m = int(sys.argv[1])
        markers = experience.markers(m)
        for p in range(1,m+1):
            positive = experience.experience(p,markers)
            print("%d %d " % (m ,p),end='')
            cpt=0
            negative_markers1(markers,positive)
            print("%d " % (cpt) ,end='')
            cpt=0
            negative_markers2(markers,positive)
            print("%d " % (cpt) ,end='')
            cpt=0
            negative_markers3(markers,positive)
            print("%d " % (cpt))
