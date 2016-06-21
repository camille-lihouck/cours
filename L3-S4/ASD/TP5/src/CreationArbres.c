#include "Arbrebinaire.h"
#include <stdio.h>
#include <stdlib.h>

Noeud_t
arbre1
()
{
	Noeud_t a1,fg,fd;
	fg= CreerNoeud(9);
	fd= CreerNoeud(8);
	a1= CreerNoeud(12);
	AjouterFilsGauche(a1,fg);
	AjouterFilsDroit(a1,fd);
	return a1;
}

Noeud_t
arbre2
()
{
	Noeud_t f0,f1,f2,f3;
	f0= CreerNoeud(12);
	f1= CreerNoeud(9);
	f2= CreerNoeud(5);
	f3= CreerNoeud(7);
	AjouterFilsGauche(f0,f1);
	AjouterFilsDroit(f1,f2);
	AjouterFilsGauche(f2,f3);
	return f0;
}

Noeud_t
arbre3
()
{
	Noeud_t f0,f10,f11,f20,f21,f22,f30,f31;
	f0= CreerNoeud(12);
	f10= CreerNoeud(9);
	f11= CreerNoeud(8);
	f20= CreerNoeud(1);
	f21= CreerNoeud(5);
	f22= CreerNoeud(4);
	f30= CreerNoeud(7);
	f31= CreerNoeud(6);
	AjouterFilsGauche(f22,f30);
	AjouterFilsDroit(f22,f31);
	AjouterFilsDroit(f11,f22);
	AjouterFilsGauche(f10,f20);
	AjouterFilsDroit(f10,f21);
	AjouterFilsGauche(f0,f10);
	AjouterFilsDroit(f0,f11);
	return f0;
}


