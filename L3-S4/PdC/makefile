mcu_fatal.o : mcu_fatal.c mcu_fatal.h
	gcc -c mcu_fatal.c

/* pour faire le fichier exectuable */

mcu_wc: mcu_fatal.o mcu_wc.o
	gcc mcu_fatal.o mcu_wc.o -o mcu_wc // regarder s\'il existe des déclarations pour mcu_fatal.o et mcu_wc.o et compile mcu_wc en executable;
