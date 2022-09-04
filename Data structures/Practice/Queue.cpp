#include<iostream>

using namespace std;

class Queue{
public:
    int front;
    int back;

    int* a;
    int n;

    Queue(int x){
        front = -1;
        back = -1;
        n = x;
        a = new int[n];
    }

    void Enqueue(int x){
        if(back ==n-1){
            cout<<"Queue Overflow"<<endl;
            return;
        }else{
            if(front == -1){
                front = 0;
            }
            back++;
            a[back] = x;
        }
    }

    int size(){
        return n;
    }

    void Dequeue(){
        if(front ==-1 || front>back){
            cout<<"No more elements in queue"<<endl;
            return;
        }
        else{
            if(front == back){
                back = -1;
                front = -1;
            }
            else{
                front++;
            }
        }
    }

    bool isEmpty(){
        if(front==-1 || front>back){

            return 1;
        }else{
            return 0;
        }
    }

    bool isFull(){
        if(front == 0 && back == n-1){
            return 1;
        }else{
            return 0;
        }
    }

    void DisplayAll(){

        for(int i=front;i<=back;i++){
            cout<<a[i]<<" ";
        }
        cout<<endl;
    }
};

int main(){
    Queue queue = Queue(5);
    cout<<queue.isEmpty()<<endl;
    queue.Enqueue(2);
    queue.Enqueue(3);
    queue.Enqueue(4);
    queue.Enqueue(5);
    queue.Enqueue(6);
    cout<<queue.isFull()<<endl;
    queue.Dequeue();
    cout<<queue.isFull()<<endl;

    queue.DisplayAll();

}
