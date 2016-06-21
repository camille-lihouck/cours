#include <stdio.h>
#include <stdlib.h>
#include "Nomine.h"
#define MAXTAB 5

Nomine_s listNomine[MAXTAB];

Nomine_s createNomine(int date,Category category, char name[50], Date birth, char nationality[30], Gender gender){
  Nomine_s nomine;
  nomine.date=date;
  nomine.category=category;
  nomine.name=name;
  nomine.birth=birth;
  nomine.nationality=nationality;
  nomine.gender=gender;
  return nomine;
} 

int ConstruireTableau(struct Nomine_s *){

}

int
main
(void){
  int date;
  date = 1921;
  Category category;
  category="Physics";
  char name[50];
  name="Albert Einstein";
  int year;
  year=1879;
  int month;
  month=03;
  int day;
  day=14;
  Date birth;
  birth.year=year;
  birth.month=month;
  birth.day=day;
  char nationality[30];
  nationality="Germany";
  Gender gender;
  gender="male";
  createNomine(date,category,name,birth,nationality,gender);
}
  
