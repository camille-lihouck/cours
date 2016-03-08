mcu_fatal.o : mcu_fatal.c mcu_fatal.h
	gcc -c mcu_fatal.c

mcu_readl.o : mcu_readl.c mcu_readl.h
	gcc -c mcu_real.c

mcu_affiche_entier.o : mcu_affiche_entier.c mcu_affiche_entier.h
	gcc -c mcu_affiche_entier.c

mcu_test : mcu_fatal.o mcu_readl.o mcu_affiche_entier.o mcu_test.o
	gcc mcu_affiche_entier.o mcu_readl.o mcu_fatal.o test.o -o mcu_test

/* pour faire le fichier exectuable */

//mcu_wc: mcu_fatal.o mcu_wc.o
//	gcc mcu_fatal.o mcu_wc.o -o mcu_wc // regarder s\'il existe des déclarations pour mcu_fatal.o et mcu_wc.o et compile mcu_wc en executable;
