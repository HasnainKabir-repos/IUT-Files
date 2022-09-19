#include<iostream>
using namespace std;

class Heap{
public:
    void Heapify(int arr[], int N, int i){
        int smallest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left < N && arr[left] < arr[smallest]){
            smallest = left;
        }

        if(right < N && arr[right] < arr[smallest]){
            smallest = right;
        }

        if(smallest != i){
            swap(arr[i], arr[smallest]);
            Heapify(arr, N, smallest);
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

    int heap_extract_min(int heap[], int N){
        int min = heap[0];
        heap[0] = heap[N-1];
        BuildHeap(heap, N-1);
        return min;
    }

    int heap_minimum(int heap[]){
        return heap[0];
    }

    void Min_heap_insert(int value, int heap[], int N){
        N++;
        heap[N-1] = value;
        BuildHeap(heap, N);

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
    cout<<heap.heap_minimum(arr)<<endl;

    cout<<heap.heap_extract_min(arr, i)<<endl;
    i--;
    heap.display(arr, i);
    heap.Min_heap_insert(45, arr, i);
    i++;
    heap.display(arr, i);

    heap.Min_heap_insert(47, arr, i);
    i++;
    heap.display(arr, i);

}
