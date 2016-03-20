#include <stdio.h>
#include <stdlib.h>
#include "quicksort.h"
#define TABSIZE 10

int
main
(void)
{
  int tableau[TABSIZE];
  int i;
  for (i=0; i<TABSIZE; i++){
    tableau[i]= (int)(rand()%100);
    printf("%d,", tableau[i]);
  }
  printf("\n");
  printf("sorting\n");
  quicksort_int(tableau,TABSIZE);
  for (i=0; i<TABSIZE; i++){
    printf("%d,", tableau[i]);
  }
  printf("\n");
}
