#include<iostream>
#include<stdlib.h>
using namespace std;

class DynamicArray{

private:
    int* arr;
    int values;
    int capacity = 2;

public:

    DynamicArray(){
        arr = new int[capacity];
        values = 0;
    }


    void pushBack(int x){
        values++;

        if(values>checksize()){
           Resize();
        }

        arr[values-1] = x;
    }


    void increasesize(){
        capacity *= 2;
    }

    int checksize(){
        return capacity;
    }

    int &operator[](int j){
        return arr[j];
    }

    void Resize(){
        increasesize();
        int s = checksize();
        int* res_arr = new int[s];

        for(int i=0;i<checksize();i++){
            res_arr[i] = arr[i];
        }

        arr = res_arr;
        delete[] res_arr;
    }

};

int main(){

    DynamicArray arr;
    for(int j=0;j<10;j++){
        arr.pushBack(j);
    }
    printf("%d ", arr[0]);

}
