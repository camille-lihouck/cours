OPTIONS = -Wall -ansi -pedantic -std=c99
OBJETS = test.o quicksort.o 

all : quicksort test

Programme: $(OBJETS)
	gcc $(OPTIONS) -o Programme $(OBJETS)

test.o : test.c 
	gcc $(OPTIONS) -c test.c

quicksort.o: quicksort.c quicksort.h 
	gcc $(OPTIONS) -c quicksort.c

quicksort : quicksort.o
	gcc $(OPTIONS) -o quicksort quicksort.o
