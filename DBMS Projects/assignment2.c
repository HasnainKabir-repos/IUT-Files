#include<stdio.h>
#include<string.h>
#include<stdlib.h>

typedef struct{
    char name[20];
    char address[20];
    char blood[5];
    int salary;
} index;

void outputf(index indexes[], int len){
    FILE *outfile;

    outfile = fopen("output2.txt", "w");

    fprintf(outfile, "Name\t\tAddress\t\tBlood Group\t\tSalary\n");

    for(int i=0;i<len;i++){

        if(strcmp(indexes[i].blood,"O+ve")==0){
            fprintf(outfile, "%s\t\t%s\t\t%s\t\t%d\n", indexes[i].name, indexes[i].address, indexes[i].blood, indexes[i].salary);
        }
    }
    fclose(outfile);
}

int main(){

    index indexes[10];

    FILE *flpt;

    char line[124];

    flpt = fopen("file1.txt", "r");

    int row =0;
    int i = 0;

    int len=0;

    char *item;

    while(fgets(line,123,flpt)){
        if(row ==0){
            row++;
            continue;
        }

        item = strtok(line,",");
        strcpy(indexes[i].name, item);

        item = strtok(NULL,",");
        strcpy(indexes[i].address, item);

        item = strtok(NULL,"\n");
        strcpy(indexes[i].blood, item);
        i++;
        len++;
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

    outputf(indexes, len);
}
