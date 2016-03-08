# -*- coding: utf-8 -*-

import listiterator as list

def print_with_iterator (l):
    """
    Print elements of a list using an iterator.
    
    :param l: The list to be printed
    :type l: dict
    """
    pass

def print_with_iterator_reverse (l):
    """
    Print elements of a list using an iterator in reverse order.
    
    :param l: The list to be printed
    :type l: dict
    """
    pass
    
def print_with_iterator_reverse_bis (l):
    """
    Print elements of a list using an iterator in reverse order.
    
    :param l: The list to be printed
    :type l: dict
    """
    pass

def ordering_insert (l, v):
    """
    Add *v* to list *l* such that *l* is kept ordered.
    
    :param l: An ordered list.
    :type l: dict
    :param v: The value to be inserted.
    :type v: same as elements of *l*
    """
    pass

if __name__ == "__main__":
    l = list.empty_list ()
    for i in reversed(range(1,5)):
        list.cons(l,i)
        
    list.print_list(l);

<<<<<<< HEAD
    # test 0 : impression renversee
=======
    #test 0 : impression renversee
>>>>>>> 37051ce07e8770fe2b6f8aeaef1473627dd4f981
    list.print_list(l,reverse=True)

    # test 1 : impression avec iterateurs
    print_with_iterator(l)
    print_with_iterator_reverse(l)

<<<<<<< HEAD
    # test 2 : insertion avant le 2eme element
    it = list.get_listiterator (l)
    print(list.next(it))
    print(list.next(it))
    list.add(it,12)
    assert(list.previous(it) == 12)
    print_with_iterator(l)
    print_with_iterator_reverse(l)

    # test 3 : insertion avant le dernier element
    it = list.get_listiterator (l)
    while (list.hasNext(it)):
        list.next(it)
    list.add(it,34)
    assert(list.previous(it) == 34)
    print_with_iterator(l)
    print_with_iterator_reverse(l)

    # test 4 : insertion avant le premier element
    it = list.get_listiterator (l)
    list.add(it,0)
    assert(list.next(it) == 0)
    print_with_iterator(l)
    print_with_iterator_reverse(l)

    # test 5 : insertion avant le dernier element avec l'iterateur placé en fin
    it = list.get_listiterator (l,True)
    list.previous(it)
    list.add(it,344)
    assert(list.previous(it) == 344)
    print_with_iterator(l)
    print_with_iterator_reverse(l)

    # test 6 : affichage à l'envers avec l'itérateur placé en fin
    print_with_iterator_reverse_bis(l)

    # test 7 : ajout après le dernier élément
    it = list.get_listiterator (l,True)
    list.add(it,44)
    assert(list.previous(it) == 44)
    print_with_iterator(l)
    print_with_iterator_reverse(l)
=======
    # test 2 : insertion avant le 3eme element
    #it = list.get_listiterator (l)
    #print(list.next(it))
    #print(list.next(it))
    #list.add(it,23)
    #assert(list.previous(it) == 23)
    #print_with_iterator(l)
    #print_with_iterator_reverse(l)

    # test 3 : insertion apres le dernier element
    #it = list.get_listiterator (l)
    #while (list.hasNext(it)):
    #    list.next(it)
    #list.add(it,45)
    #assert(list.previous(it) == 45)
    #print_with_iterator(l)
    #print_with_iterator_reverse(l)

    # test 4 : insertion avant le premier element
    #it = list.get_listiterator (l)
    #list.add(it,0)
    #assert(list.previous(it) == 0)
    #print_with_iterator(l)
    #print_with_iterator_reverse(l)

    # test 5 : insertion avant le dernier element avec l'iterateur placé en fin
    #it = list.get_listiterator (l,True)
    #list.previous(it)
    #list.add(it,445)
    #assert(list.previous(it) == 445)
    #print_with_iterator(l)
    #print_with_iterator_reverse(l)

    # test 6 : affichage à l'envers avec l'itérateur placé en fin
    #print_with_iterator_reverse_bis(l)

    # test 7 : ajout après le dernier élément
    #it = list.get_listiterator (l,True)
    #list.add(it,5)
    #assert(list.previous(it) == 5)
    #print_with_iterator(l)
    #print_with_iterator_reverse(l)
>>>>>>> 37051ce07e8770fe2b6f8aeaef1473627dd4f981
        
    # test 8 : inserer trié, à vous d'écrire ce test

    # test 9 : suppression en tete

    # test 10 : suppression en queue
    
    
