extern void fatal(int assert, const char message[], int status);
/* Termine l'execution du programme sur une erreur fatale.

   Le param\'etre assert est le résultat de l'\'evaluation d'une expression~C.
   
   Si assert est vrai, affiche le message sur la sortie d'erreur 
   gr\^ace \'a putc(int c ,STDERR) et termine en retournant la 
   valeur status \'a l'environement gr\^ace \'a la fonction exit */
  

