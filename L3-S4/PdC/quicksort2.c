#include <stdio.h>
#include <stdlib.h>
#define TABSIZE 10

int part_tab(int *tab,unsigned int nelem){
  if (nelem>1){
    if (*tab>*(tab+1)){
      int aux = *tab;
      *tab=*(tab+1);
      *(tab+1)=aux;
      return part_tab((tab+1),nelem-1)+1;
    }
    else {
      int aux = *(tab+1);
      *(tab+1)=*(tab+nelem-1);
      *(tab+nelem-1)= aux;
      return part_tab(tab, nelem-1);
    }
  }
  return 0;
}

void part_all(int *tab, int nelem){
  if (nelem>1){
    int pivot_position;
    pivot_position=part_tab(tab,nelem);
    part_all(tab,pivot_position);
    part_all((tab+pivot_position+1),(nelem-pivot_position));
  }
}

void quicksort_int( int *tab, unsigned int nelem){
  part_all(tab,nelem);
}

void main(){
  int tableau[TABSIZE];
  int i;
  for (i=0; i<TABSIZE; i++){
    tableau[i]= (int)(rand()%100);
    printf("%d\n", tableau[i]);
  }
  printf("sorting\n");
  quicksort_int(tableau,TABSIZE);
  for (i=0; i<TABSIZE; i++){
    printf("%d\n", tableau[i]);
  }
}
