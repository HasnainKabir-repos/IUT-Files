
#include<iostream>
#include<algorithm>
using namespace std;

class Heap{
public:
    void Heapify(int arr[], int N, int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left < N && arr[left] > arr[largest]){
            largest = left;
        }

        if(right < N && arr[right] > arr[largest]){
            largest = right;
        }

        if(largest != i){

            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            Heapify(arr, N, largest);
        }

    }


    void BuildHeap(int arr[], int N){
        int s = (N/2) - 1;

        for(int i=s; i>=0;i--){
            Heapify(arr, N, i);
        }
    }

    void display(int arr[], int N){
        for(int i=0;i<N;i++){
            cout<<arr[i]<<" ";
        }

        cout<<endl;
    }

    void HeapSort(int arr[], int N){

        for(int i=N-1; i>0;i--){

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            Heapify(arr, i, 0);
        }
        reverse(arr, arr+N);
    }

};


int main(){
    int arr[100];

    int n;
    int i=0;
    cin>>n;
    while(n!=-1){
        arr[i] = n;
        i++;
        cin>>n;
    }


    Heap heap;
    heap.BuildHeap(arr, i);
    heap.display(arr, i);
    heap.HeapSort(arr, i);
    heap.display(arr, i);

}





