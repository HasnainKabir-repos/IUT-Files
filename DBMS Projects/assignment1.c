#include<stdio.h>
#include<string.h>

typedef struct{
    char name[20];
    char address[20];
    char blood[5];
    int salary;
} index;


int main(){

    index indexes[10];

    FILE *flpt;

    char line[124];

    flpt = fopen("file1.txt", "r");

    int row =0;
    int i = 0;


    char *item;

    while(fgets(line,123,flpt)){
        if(row ==0){
            row++;
            continue;
        }
        //printf("%s", line);

        item = strtok(line,",");
        strcpy(indexes[i].name, item);

        item = strtok(NULL,",");
        strcpy(indexes[i].address, item);

        item = strtok(NULL,"\n");
        strcpy(indexes[i].blood, item);
        i++;
    }

    fclose(flpt);

    flpt = fopen("file2.txt", "r");

    row = 0;
    i =0;

    while(fgets(line, 123, flpt)){

        if(row==0){
            row++;
            continue;
        }

        item = strtok(line, ",");
        item = strtok(NULL, ",");
        item = strtok(NULL, "\n");
        indexes[i].salary = atoi(item);
        i++;
    }

    for(int i=0;i<3;i++){
        printf("%s ", indexes[i].name);
        printf("%s ", indexes[i].address);
        printf("%s ", indexes[i].blood);
        printf("%d\n", indexes[i].salary);
    }
    fclose(flpt);
}
