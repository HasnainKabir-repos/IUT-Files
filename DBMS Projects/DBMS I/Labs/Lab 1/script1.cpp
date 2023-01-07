#include<iostream>
using namespace std;
class Student{
public:
    int id;
    double gpa=0.00;
    int semester;
};

int main(){

    Student students[100];

    FILE *fp;
    fp = fopen("grades.txt", "r");

    char buffer[160];

    int count = 0;
    int i=0;
    while(fgets(buffer, 159, fp)){

        sscanf(buffer, "%d;%lf;%d", &students[i].id, &students[i].gpa, &students[i].semester);
        count++;
        i++;
    }
    //printf("%d", count);

    fclose(fp);

    double total = 0.00f;
    for(int i=0;i<count;i++){
        total+= students[i].gpa;
    }
    double average = total/(count);

    printf("Average gpa is: %lf", average);
}
