#include <stdio.h>
#include "mcu_macros.h"
#include "mcu_fatal.h"
#include "mcu_readl.h"
#include "mcu_affiche_entier.h"

int
main (void)
{
  int line[MAXLINE];
  int i,j;
  /* on affiche un ligne de l'entr\'ee standart*/
     	i = readl(line);
	j=0;
	while (line[j]) putchar(line[j++]);
  putchat('\n');
  /* on fait un affichage */
  affiche_entier(i) ;
  putchar('\n');
  fatal(l==1, "l==1 is true\n",2);
  return 0;
}
