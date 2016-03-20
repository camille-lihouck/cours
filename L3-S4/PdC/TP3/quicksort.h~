#include <stdio.h>
#include <stdlib.h>
#include "quicksort.h"

int part_tab(int *tab, int begin, int end){
  int *pivot =tab+begin;
  if (begin<end){
    if (*pivot>*(pivot+1)){
      int aux = *pivot;
      *pivot=*(pivot+1);
      *(pivot+1)=aux;
      return part_tab(tab, begin+1,end);
    }
    else {
      int aux = *(pivot+1);
      *(pivot+1)=*(tab+end);
      *(tab+end)= aux;
      return part_tab(tab, begin, end-1);
    }
  }
  return begin;
}

void part_all(int *tab, int begin, int end){
  if (begin<end){
    int pivot_position;
    pivot_position=part_tab(tab,begin,end);
    part_all(tab,begin,pivot_position-1);
    part_all(tab, pivot_position+1,end);
  }
}

void quicksort_int( int *tab, unsigned int nelem){
  part_all(tab,0,nelem-1);
}
