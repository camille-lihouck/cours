#include <stdio.h>
#include "mcu_affiche_entier.h"

void affiche_entier(int i){
  if (i/10)
    affiche_entier(i/10);
  putchar(i%10 +'0');
}
