// Points: 6 pts

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main(){
    char first_name[10];
    char last_name[10];
    char full_name[20];

    fgets(first_name, sizeof(first_name), stdin);
    fflush(stdin);
    fgets(last_name, sizeof(last_name), stdin);

    strncat(full_name, first_name, 10);
    strncat(full_name, last_name, 10);

    return 0;
}