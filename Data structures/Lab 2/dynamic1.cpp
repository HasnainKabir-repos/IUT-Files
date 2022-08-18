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

    void PushBack(int x){

        values++;
        if(values+1>Capacity()){
           Resize();
        }

        arr[values-1] = x;

    }

    void increasesize(){
        capacity = capacity* 2;
    }

    int Capacity(){
        return capacity;
    }

    int &operator[](int k){
        return arr[k];
    }

    int Get_Size(){
        return values;
    }

    int Get(int i)
    {

        if ((i < 0 ) or (i >= values))
        {
            cout << "Index out of Range" << endl;
            return -1;
        }
        return arr[i];

    }

    void Set(int i,int val)
    {
        if ((i < 0 ) or (i >= values))
        {
            cout << " Index out of Range" << endl;
            return;
        }
        arr[i] = val;

    }

    void Resize(){
        increasesize();
        int s = Capacity();
        int* res_arr = new int[s];

        for(int i=0;i<Get_Size();i++){
            res_arr[i] = arr[i];
        }

        arr = res_arr;
        delete[] res_arr;
    }

    void Reverse(){
        int s = Capacity();
        int* rev_arr = new int[s];
        int n = Get_Size();

        for(int i=0;i<n;i++){
            rev_arr[i] = arr[n-i-1];
        }

        arr = rev_arr;
        delete[] rev_arr;
    }

    void leftShift(int val){
        int n = Get_Size();

        int i=0;
        for(i=0;i<n;i++){
            if(arr[i] == val){
                break;
            }
        }

        if(i!=n-1){
            n = n-1;
            for(int j=i;j<n-1;j++){
                arr[j] = arr[j+1];
            }
        }
    }

    void deleteElement(int val){

        int occurrence = 0;
        for(int i=0;i<Get_Size();i++){
            if(arr[i] == val){
                occurrence++;
            }
        }
        for(int i=0;i<occurrence;i++){
            leftShift(val);
        }
    }

};

int main(){

    DynamicArray arr;
    for(int i =0;i<16;i++)
    {
        arr.PushBack(100 + i);
    }

    for(int i = 0; i < arr.Get_Size();i++)
    {
        cout << arr.Get(i)<<endl;
    }

    arr.Reverse();
    for(int i = 0; i < arr.Get_Size();i++)
    {
        cout << arr.Get(i)<<" ";
    }
//    cout<<endl;
    DynamicArray arr2;
    arr2.PushBack(2);
    arr2.PushBack(3);
    arr2.PushBack(3);
    arr2.PushBack(2);

    arr2.deleteElement(2);

    for(int i = 0; i < arr2.Get_Size();i++)
    {
        cout << arr2.Get(i)<<" ";
    }
}

