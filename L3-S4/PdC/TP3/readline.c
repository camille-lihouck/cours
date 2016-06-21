#include <stdio.h>
#include <stdlib.h> 

int readl(int line[]){
char c;
int i;
i=0;
c=getchar();
while (c!=EOF && c!='\n') {
 
  line[i]=c;
  i++;
  c=getchar();
  if (i>81)
      exit(1);
 }
 if (c==EOF) {
   return EOF;
 }
