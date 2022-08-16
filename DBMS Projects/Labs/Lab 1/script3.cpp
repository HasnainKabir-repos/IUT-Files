#include<iostream>
#include<new>
using namespace std;

class Studentgrade{
public:
    int id;
    double gpa=0.00;
    int semester;

};

class Student{
public:
    int id;
    char* name;
    int age;
    char* blood_group;
    char* dept;
};

int main(){

    Studentgrade studentgrade[100];

    FILE *fp;
    fp = fopen("grades.txt", "r");

    char buffer[161];

    int count = 0;
    int i=0;
    while(fgets(buffer, 160, fp)){

        sscanf(buffer,"%d;%lf;%d", &studentgrade[i].id, &studentgrade[i].gpa, &studentgrade[i].semester);
        count++;
        i++;
    }
    //printf("%d", count);

    fclose(fp);

    fp = fopen("studentInfo.txt", "r");

    int cnt = 0;

    Student students[100];

    int j=0;
    while(fgets(buffer, 160, fp)){
        sscanf(buffer, "%d;%s;%d;%s;%s", &students[j].id, students[j].name, &students[j].age, students[j].blood_group, students[j].dept);
        j++;
    }

    fclose(fp);

    int stdId=0;
//
//    cout<<"Enter your student ID: "<<endl;
//    cin>>stdId;


    for(int x=0;x<j;x++){
        printf("%s\n", students[x].name);
    }
}

