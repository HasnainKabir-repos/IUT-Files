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

    char buffer[124];

    int count = 0;
    int i=0;
    while(fgets(buffer, 123, fp)){

        fscanf(fp, "%d;%lf;%d", &students[i].id, &students[i].gpa, &students[i].semester);
        count++;
        i++;
    }
    //printf("%d", count);

    int id,semester;
    float gpa;

    cout<<"Enter your student ID: "<<endl;
    cin>>id;

    cout<<"Enter your gpa: "<<endl;

    while(cin>>gpa){
        if(gpa<=4.0 && gpa >=2.00){
            break;
        }else{
            cout<<"Invalid gpa"<<endl;
            cout<<"Enter your gpa: "<<endl;
        }
    }

    cout<<"Enter your semester: "<<endl;

    while(cin>>semester){
        if(semester<=8){
            break;
        }else{
            cout<<"Invalid semester"<<endl;
            cout<<"Enter your semester: "<<endl;
        }
    }

    students[count-1].id = id;
    students[count-1].gpa = gpa;
    students[count-1].semester = semester;


    fclose(fp);

    fp = fopen("grades.txt", "a");

    fprintf(fp, "\n%d;%.2f;%d", students[count-1].id, students[count-1].gpa, students[count-1].semester);
    fclose(fp);
}

