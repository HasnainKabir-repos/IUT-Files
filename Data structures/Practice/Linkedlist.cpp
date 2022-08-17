#include<iostream>

using namespace std;

class Node{
public:
    int key;
    Node* next;

};

class LinkedList{
public:
    Node* head;

    LinkedList(){
        head = NULL;
    }

    void push_front(int x){
        Node* node = new Node();
        node->key = x;

        if(head==NULL){
            head=node;
        }else{
            node->next = head;
            head = node;
        }
    }

    void push_back(int x){
        Node* node = new Node();
        node->key = x;
        node->next = NULL;

        Node* temp = head;
        while(temp->next!=NULL){
            temp = temp->next;
        }

        temp->next = node;
    }
};

int main(){

    LinkedList l;
    l.push_front(11);
    l.push_front(10);
    l.push_back(12);

    while(l.head!=NULL){
        cout<<l.head->key<<" ";
        l.head = l.head->next;
    }

//    Node* head;
//    Node* one;
//    Node* two;
//
//    one = new Node();
//    two = new Node();
//
//    one->key = 1;
//    two->key = 2;
//
//    one->next = two;
//    two->next = NULL;
//    head = one;
//
//    while (head != NULL) {
//        cout << head->key<<" ";
//        head = head->next;
//  }
}
