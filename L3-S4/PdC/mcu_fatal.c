#include <stdio.h>
#include 'mcu_fatal.h'

void fatal(int assert, const char message[], int status){
  if (assert){
    for ( int c =0; c< strlen(message); c++){
      putc( c, STDERR)
    }
    return status;
  }
  return 0;
}
