int readl(int line[]){
/* Lit une ligne sur l'entree standard grace a getchar (cf. man).   
   Cette ligne doit comporter moins de MAXLINE caracteres.

   Le resultat est retourne dans line (passage de parametre
   par reference). 
   Un \0 est ecrit en fin de la chaine.
   
   Ainsi, le tableau line doit etre de taille au moins MAXLINE+1.

   Retourne le nombre de caracteres lu, non compris le \0 final.
   Retourne EOF si la fin de fichier est atteinte.

   Termine le programme sur une erreur si rencontre une ligne de plus
   de MAXLINE caracteres et retourne 1 grace a la fonction exit
   (cf. man). */
