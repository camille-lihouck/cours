----------
Answers
----------

Etat général:

Tout fonctionne jusqu'au choix d'un pivot optimal, que je n'ai pas réussi à trouver. cf la partie concernée.

Rappels sur le tri rapide
==========================

Il existe d'autres tri sur place par exemple le tri insertion....


Espace mémoire supplémentaire:
-------------------------------

Etant donné que l'on fait un tri sur place, a aucun moment la liste n'est recopié et ne génère d'occupation de mémoire suplémentaire. L'espace mémoire suplémentaire est donc négligeable si on a de grandes listes. 

Ceci étant dit, si l'on souhaite aller plus loin, la structure la plus complexe à stocker en mémoire est donc les dictionnaires slices qui sont fréquement générés. Cet espace étant indépendant de la taille du tableau, nous nous contenterons donc de compter le nombre de fois qu'un slice est créé.


Nous noterons m(n) l'espace mémoire supplémentaire pour un quicksort en fonction de n, la taille du tableau, en regardant ce qui se passe dans chacune des fonctions appelées dans le quicksort.



Quicksort:
^^^^^^^^^^^

Il y a une génération de dictionnaire slice dans quicksort qui est gardé en mémoire du début à la fin:
Donc m_quicksort(n)=1


Quicksort_slice:
^^^^^^^^^^^^^^^^^
Pour quicksort_slice, a chaque appel récurssif, il y a génération de deux dictionnaires slice. Il faut différencier les pires et les meilleurs des cas en fonction de la différence des tailles entre s1 et s2.

Meilleur des cas:
""""""""""""""""""

Dans le meilleur des cas, chaque pivot divise la splice en deux splices de même taille, c'est à dire que le premier élément de chaque splice possède autant d'élément du tableau inférieur à lui que d'élément supérieur à lui.

On a alors:
m_qslice_m(n)=2+m_qslice_m(n/2)
avec m_qslice_m(1)=0
On peut résoudre cette relation de récurrence à l'aide du théorème général et on obtient:
m_qslice_m(n)=Θ(1)

Pire des cas:
"""""""""""""""

Dans le pire des cas, chaque pivot engendre une splice vide, c'est à dire que le pivot est le plus grand ou le plus petit des éléments de la splice.
On a alors:
m_qslice_p(n)=2+m_qslice_p(n-1)
avec m_qslice_m(1)=0
On a ici une suite arithmétique de raison 2 donc:
m_qslice_p(n)=2*(n-1) donc
m_qslice_p(n)=Θ(n)

Espace mémoire global quicksort_slice:
""""""""""""""""""""""""""""""""""""""""

On a donc:
m_qslice(n)=Ω(1) et m_qslice(n)=O(n)


Partition:
^^^^^^^^^^^


Enfin maintenant regardons l'espace mémoire utilisé dans partition.
On a un espace mémoire supplémentaire utilisé uniquement lors du cas de base. Dans tous les appels récursifs, il n'y a aucune mémoire suplémentaire utilisé. On a donc:
m_part(n)=2
m_part(n)=Θ(1)


Espace mémoire final:
^^^^^^^^^^^^^^^^^^^^^^

Au final l'espace mémoire suplémentaire utilisé est donc:
m(n)=m_quicksort(n) + m_qsplice(n) + m_part(m)
Comme m_quicksort(n) et m_part(m) sont en Θ(1) ils sont négligeables devant m_sqplice. On a donc un espace mémoire supplémentaire utilisé de:
m(n)=Ω(1) et m(n)=O(n)


Sélection du pivot:
====================

Pivot aléatoire:
^^^^^^^^^^^^^^^^^

Comparaison avec le premier élément comme pivot
""""""""""""""""""""""""""""""""""""""""""""""""

Le fichier tirage_pivot_alea.py permet de lancer pour des longueurs allant de 1 à 100, 100 tirages de tableaux aléatoire en les triant avec le premier élement comme pivot, ou en tirant aléatoirement le pivot et de faire la moyenne du cout sur ces 100 tirages. 
Il affiche sur la sortie standart pour chaque taille sur une ligne la moyenne pour le premier élément en pivot puis la moyenne pour un pivot aléatoire séparés par un espace.

Une version de ses tests est proposée dans le fichier random_res.txt.

En analysant ses résultats on remarque qu'il n'y a pas de différence siginificative entre les deux méthodes.

Pire des cas avec un pivot aléatoire
"""""""""""""""""""""""""""""""""""""""

Il n'y a pas de différence entre le fait de prendre le premier élément comme pivot ou d'en choisir un au hasard. Le pire des cas est quand le pivot choisi est soit le plus grand élément de la liste, soit le plus petit élément de la liste. Dans ce cas on retrouve une complexité semblable à celle vu précédement. 

Mais plus précisement, on notera c(n) le nombre de comparasion en fonction de la longueur du tableau (notée n). On analysera uniquement le nombre de comparaison dans quicksort_slice et dans partition. En effet aucune comparaison n'est effectuée dans quicksort(t)

Comparaisons dans quicksort_slice:
""""""""""""""""""""""""""""""""""""""

On la notera c_qslice(n). On notera également c_part(n) le cout de partition pour un tableau de taille n. On a:

c_qslice(n)= c_part(n)+ c_qslice(n-1)
avec c_qslice(1)=0

Car dans le pire des cas, il n'y a que le pivot d'enlevé et un seul sous tableau à retrier, l'autre étant vide.

Comparaisons dans partition:
"""""""""""""""""""""""""""""

Il n'y a qu'une seule comparaison par appel à parition, on a donc:

c_part(n)= 1 + c_part(n-1)
avec c_part(0)=0

On a donc, comme il s'agit d'une suite arithmétique:

c_part(n)=n

Comparaisons totales:
""""""""""""""""""""""

On peut revenir sur c_qslice(n) ayant maintenant la valeur de c_part(n):

c_qslice(n)= n + c_qslice(n-1)

C'est le seul appel ou l'on fait des comparaisons depuis l'appel principal, on a donc c(n)=c_qslice(n)

On résoud cette relation de récurence qui a une solution particulière de la forme k et une solution générale de la forme a*n²+b*n.

Solution générale: on a a*n²+b*n=a*(n²-2n+1)+b*(n-1)+n,
c'est à dire n=2a*n-a-b:
On obtient a=1/2 et b=-1/2

Solution particulière: on a donc c(n)=(1/2)(n²-n)+k
or c(0)=0 donc k=0

Au final on a c(n)=(1/2)(n²-n)
On en déduit donc que dans le pire des cas:
c(n)=O(n²)

On ne s'est pas intéréssé au meilleur des cas donc impossible de conclure sur Ω ni sur Θ.

Pivot optimal :
^^^^^^^^^^^^^^^

Théoriquement la meilleur valeur à choisir et la valeur médiane des différents éléments du tableaux car on est sur de diviser le tableau en deux parties égales. Cependant pour calculer la médiane, la méthode la plus simple consiste a avoir tous les éléments triés et prendre l'élément central. Or, l'objectif étant ici de trier le tableau cette proposition ne résoud rien.

L'idée consiste donc à chercher à approximer une valeur médiane sans avoir à trier la liste. Après plusieurs recherches sur la question, il a été difficile de trouver une solution a cette question. Plusieurs approche théorique ont été faites:

*solution du calcul de la médiane des médianes, algorithme de BFPRT, mais cette solution n'as pas été retenue car le fait de devoir malgrès tout trier un cinquième de la liste parait toujours un cout énorme pour déterminer un pivot.

*dans des cas spécifiques, par exemple si s'agit d'un tableau de nombres de 1 à 100 comme dans le fichier test proposé, on peut prendre la moyenne qui est identique à la médiane dans ce cas précis, mais ce n'est pas généralisable.

L'approche retenue aprés de longues recherches et réflexions était de calculer l'index central de la liste ou on doit trouver la médiane,
choisir aléatoirement un pivot puis partitionner selon ce pivot,
si le pivot est à la position de l'index, ou que l'une des bornes des slices est égale à l'index garder ce pivot,
sinon éliminer la moitié ou la médiane n'est pas.

Malheureusement le code ne fonctionne pas (faute de temps). La complexité dans le meilleur des cas aurait été la médiane est trouvé du premier cout dans ce cas le cout est le cout en comparaison est le cout d'une partition c'est à dire n
Sinon le pire des cas est quand on essaye des pivots qui sont à chaque mois majorant ou minorant de la liste dans ce cas on aurait eu une complexité en Θ(n)*n= Θ(n²) 


