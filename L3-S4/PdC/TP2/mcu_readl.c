#include <stdio.h>
#include <stdlib.h>
#include "mcu_readl.h"
#include "mcu_macros.h"

int readl(int line[]){
  int size;
  size=0;
  char c;
  do{
    c=getchar();
    if (line[size]==MAXLINE){
      exit(1);
    }
    else{
       line[size]=c;
    }
    size+=1;
    }while(c!=EOF && c!='\n');
  if (c==EOF){
    return EOF;
  }
  else{
    return size;
  }
}
  
    
 
