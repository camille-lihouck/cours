===========
Answers
===========

--------------
Etat du TP
--------------

Les différents algorithmes ont tous étés implantés et sont fonctionnels. On peut réaliser les experiences en fixant p et m en arguments du test, mais aussi pour toutes les valeurs de p pour un m fixé en ne précissant que m en paramètre.

Il semblerait sur l'analyse des résultats des courbes qu'il y ait une légère erreur sur la complexité de la stratégie 2 mais la forme générale trouvée est correcte.


-------------
Strategie 1:
-------------

Afin d'étudier la complexité de cet algorithme on se propose de compter le nombre de comparaisons entre les éléments de la liste des marqueurs(listeM) et la liste des marqueurs positifs(listeM+):

Si l'on part du principe que tous les élements de la listeM+ est extraite de la listeM, et que tous les marqueurs sont différents, il n'existe pas de meilleur ni de pire des cas. En effet, parmi tous les élements de listeM, il y en a un qui correpondera au premier élément de listeM+ dont le coup en comparaison sera de 1. De même pour tous les élements de listeM+, il y aura un élement de listeM correspondant.
Pour tous les autres élements de listeM qui ne sont pas dans listeM+, il y aura le même nombre de comparaison équivalent à la longueur de la listeM+.

On note m la longueur de la listeM et p la longueur de la listeM+.
On a donc finalement une complexité c1:

	::

	c1(m,p)= 1+2+3+4+...+p + p*(m-p)

	avec 1+2+3+4+...+p correspondant aux couts pour les marqueurs positifs 

	et p*(m-p) les m-p couts de recherche pour les marqueurs négatifs
	
	donc:

	c1(m,p)= p*(p+1)/2 + p*(m-p)

	c1(m,p)= p*(m+(1-p)/2)


--------------
Stratégie 2 :
--------------

Afin d'avoir des résultats comparable pour les différentes stratégies, on comptera également le nombre de comparaisons.

Cette fois encore il n'y a pas de meilleur ni de pire des cas dans la comparaison des listeM et listeM+. L'algorithme de recherche dichotomique dépend uniquement de la taille de la liste au sein de laquelle s'effectue la recherche et pour une taille donnée s'effectue toujours en le même nombre d'étape.

La complexité de la recherche par dichotomie pour une liste de taille n est de:

	::

	Cd(n)=Cd(n/2)

	C'est à dire :

	Cd(n)=log2(n)

	Cette recherche par dichotomie est faite une fois par élement de la listeM. Il faut donc faire m*Cd(n).

Il faut ensuite compter le coût du tri fusion.
Pour le tri fusion, il n'y a pas non plus de pire ni de meilleur des cas. On utilisera la complexité donnée dans la documentation, à savoir Cmerge(n1,n2)=O(n1+n2). Il faut cependant compter les appels de merge dans merge_sort. Si l'on regarde l'algorithme on constate que la complexité (Cmerge_sort(n)) est de la forme:

	::

	Cmerge_sort(n) = Cmerge_sort(n/2) + Cmerge_sort(n/2) + Cmerge(n/2,n/2)

	C'est à dire:

	Cmerge_sort(n) = 2*Cmerge_sort(n/2) + O(n)

	On a donc une complexité pour le tri fusion de:

	Cmerge_sort(n)=O(n*log2(n))



Au final, il ne reste qu'à additionner les deux et on a:

	::

	c2(n,p)=m*log2(p)+O(p*log2(p))
	
	On peut donc dire que

	c2(n,p)=O((m+p)*(log2(p))

--------------
Strategie 3 :
--------------

On compte cette fois encore le nombre de comparaisons.

On effectue un tri sur les deux listes cette fois-ci et on a une complexité de tri 

	::

	Cmerge_sort_total(n,p) = Cmerge_sort(n) + Cmerge_sort(p)
	
	C'est à dire:
	
	Cmerge_sort_total(n,p)=O(m*log(m))+O(p*log(p))

Pour la recherche cette fois on différencie un pire et un meilleur des cas:

 * Le pire des cas est atteint lorsque le dernier élement de la liste des marqueurs est positif car il faut parcourir l'intégralité de la liste des marqueurs pour trouver le dernier marqueur positif. La complexité est alors de 
	
	::

	Cp_search(m,p)=2m

 * Le meilleur des cas est atteint lorsque les marqueurs positifs sont tous les premiers marqueurs de la listeM. Une fois la listeM+ arrivée au bout, il n'y a plus de marqueurs positifs. Ainsi la complexité est de 
	
	::

	Cm_search(m,p)=2p


Au final la complexité de cet algorithme est:

	
* Dans le pire des cas:

	::

	Cp=2m+O(m*log2(m) + p*log2(p))

* Dans le meilleur des cas:
	
	::

	Cm=2p + O(m*log2(m) + p*log2(p))



---------------------
Courbes et analyses
---------------------

Performance des algorithmes:
-----------------------------

Si l'on prend un echantillon dans lequel tous les marqueurs sont positifs, la stratégie 1 sera plus efficace que les stratégies 2 et 3 car le tri des listes occasionnera des comparaisons supplémentaires. On peut d'ailleurs affirmer que dans cette même situation la stratégie 2 sera plus efficace que la stratégie 3 car la strategie 3 necessite de trier les deux listes, là où la stratégie 2 n'en demande qu'un.
On retrouve une situation similaire pour les échantillons de petite taille.

Ensuite dès lors qu'il y a une différence de taille significative entre m et p et que la taille de m devient grande la strategie 2 devient plus efficace que la stratégie 1. Par exemple pour m=15 et p=5 on a la stratégie 2 qui est plus efficace que la stratégie 1.

Si on augmente encore la taille des échantillons, la stratégie 3 devient elle aussi plus efficace que la stratégie 1. Par exemple pour m=40 et p=20.

Quoi qu'il arrive, au vu de l'implémentation effectuée, la stratégie 3 sera toujours plus couteuse que la stratégie 2 au vu des équations de complexités trouvées précédemment. Cette situation n'est pas du au cout du tri des listes mais à l'algorithme de recherche.



Courbe pour 10 marqueurs
-------------------------

  .. image:: ../fichiers/tp1-10.png
     :width: 500px
     :alt: courbe 10 marqueurs

On constate que comme précedement supposé lorsque les échantillons sont de petites tailles le tri à un cout non négligeable sur le nombre de comparaisons.
Pour m=10 la stratégie 1 reste globalement plus efficace.

Courbe pour 20 marqueurs
-------------------------

  .. image:: ../fichiers/tp1-20.png
     :width: 500px
     :alt: courbe 20 marqueurs

Pour 20 marqueurs, lorsqu'il y a peu de marqueurs positifs, la stratégie 1 reste plus efficace, par contre lorsque l'on augmente le nombre de marqueurs positifs, la stratégie 2 devient très vite plus efficace.
La stratégie 3 devient aussi à son tour plus avantageuse que la stratégie 1 si on augmente le nombre de marqueurs positifs.

Courbe pour 30 marqueurs
-------------------------

  .. image:: ../fichiers/tp1-30.png
     :width: 500px
     :alt: courbe 30 marqueurs
     
On retrouve la situation décrite pour m=20, et il en va de même pour les autres tailles à venir. On constate néanmoins que le cout entre la stratégie 2 et la stratégie 3 tend à se rapprocher lorsque la taille de l'échantillon augmente. Néanmoins lorsqu'il y a peu de marqueurs positifs, la stratégie 1 reste plus efficace que la stratégie 3.

Courbe pour 40 marqueurs
-------------------------

  .. image:: ../fichiers/tp1-40.png
     :width: 500px
     :alt: courbe 40 marqueurs

Courbe pour 50 marqueurs
-------------------------

  .. image:: ../fichiers/tp1-50.png
     :width: 500px
     :alt: courbe 50 marqueurs
    
Courbe pour 60 marqueurs
-------------------------

  .. image:: ../fichiers/tp1-60.png
     :width: 500px
     :alt: courbe 60 marqueurs
    
Courbe pour 70 marqueurs
-------------------------

  .. image:: ../fichiers/tp1-70.png
     :width: 500px
     :alt: courbe 70 marqueurs

Courbe pour 80 marqueurs
-------------------------

  .. image:: ../fichiers/tp1-80.png
     :width: 500px
     :alt: courbe 80 marqueurs

Courbe pour 90 marqueurs
-------------------------

  .. image:: ../fichiers/tp1-90.png
     :width: 500px
     :alt: courbe 90 marqueurs
    
Courbe pour 100 marqueurs
-------------------------

  .. image:: ../fichiers/tp1-100.png
     :width: 500px
     :alt: courbe 100 marqueurs
     


On partage les analyses posées pour m=30 pour tous les cas qui suivent.


------------
Conclusion
------------

Il semblerai que lorsque l'on a un échantillon de faible taille le cout du tri est non négligeable et la stratégie 1 est la moins couteuse, par contre dès que l'on a des échantillons de taille plus importante (plus de 20) la stratégie devient la plus efficace.
Dans tous les cas, la stratégie 3 et plus couteuse que la stratégie 2.
