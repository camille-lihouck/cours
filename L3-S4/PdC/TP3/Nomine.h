typedef enum Category Category;
enum Category{
  "Literature","Physics","Chemistry","Peace","Physiology","Medicine"
};

typedef enum Gender Gender;
enum Gender{
  "male","female"
};

typedef struct Date Date;
struct Date{
  int year;
  int month;
  int day;
}

typedef struct Nomine_s Nomine_s
struct Nomine_s{
  int date;
  Category category;
  char name[50];
  Date birth;
  char nationality[30];
  Gender gender;
}
  
