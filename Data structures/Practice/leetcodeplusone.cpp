#include<iostream>
#include<stdlib.h>
using namespace std;

class DynamicArray{

private:
    int* arr ;
    int values;
    int capacity = 2;

public:

    DynamicArray(){
        arr = new int[capacity];
        values = 0;
    }

    void pushBack(int x){

        values++;
        if(values+1>checksize()){
           Resize();
        }

        arr[values-1] = x;

    }


    void increasesize(){
        capacity = capacity* 2;
    }

    int checksize(){
        return capacity;
    }

    int &operator[](int k){
        return arr[k];
    }

    int size(){
        return values;
    }

    void Resize(){
        increasesize();
        int s = checksize();
        int* res_arr = new int[s];

        for(int i=0;i<size();i++){
            res_arr[i] = arr[i];
        }

        arr = res_arr;
        delete[] res_arr;
    }

};

int main(){

    DynamicArray arr;

    string n;
    cin>>n;
    for(int i=0;i<n.size();i++){
        int f=n[i]-'0';
        arr.pushBack(f);
    }

    for(int j=0;j<arr.size();j++){
        cout<<arr[j]<<" ";
    }

}
