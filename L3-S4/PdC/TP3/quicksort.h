int part_tab(int *tab, int begin, int end);
  /*partionne le tableau selon le premier élement et retourne la place du pivot en fin de partionnement*/

void part_all(int *tab, int begin, int end);
  /*effectue les partions successives pour trier le tableau en utilisant  part_tab*/

void quicksort_int( int *tab, unsigned int nelem);
/*tri un tableau de taille nelem en appelant les fonctions ci dessus*/
  
