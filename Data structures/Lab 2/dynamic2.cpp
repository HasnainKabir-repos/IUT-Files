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

};

int main(){
    DynamicArray arr;
    for(int i =0;i<16;i++)
    {
        arr.PushBack(100 + i);
    }

    for(int i = 0; i < arr.Get_Size();i++)
    {
        cout << arr.Get(i)<<" ";
    }cout<<endl;
    arr.Reverse();
    for(int i = 0; i < arr.Get_Size();i++)
    {
        cout << arr.Get(i)<<" ";
    }

}
