#include <stdio.h>
#include <stdlib.h>
#include "mcu_fatal.h"

void fatal(int assert, const char message[], int status){
  if (assert){
    int i;
    i=0;
    while (message[i]){
      putc(message[i], stderr);
      i++;
    }
    exit(status);
  }
}
