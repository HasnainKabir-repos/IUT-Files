#include<iostream>

using namespace std;

class Node
{
public:
    int key;
    Node* next;

};

class LinkedList
{
public:
    Node* head, *tail;

    LinkedList()
    {
        head = NULL;
        tail = NULL;
    }

    void push_front(int x)
    {
        Node* node = new Node();
        node->key = x;

        if(head==NULL)
        {
            head=node;
            tail = node;
        }
        else
        {
            node->next = head;
            head = node;
        }
    }

    void push_back(int x)
    {
        Node* node = new Node();
        node->key = x;
        if(head==NULL)
        {
            head=node;
            tail = node;
        }
        else
        {
            tail->next = node;
            tail = node;

        }
//        tail->next = node;
//        tail = node;
        // node->next = NULL;

//        Node* temp = head;
//        while(temp->next!=NULL)
//        {
//            temp = temp->next;
//        }
//
//        temp->next = node;
    }

    void displayAll()
    {
        Node* temp = head;
        while(temp!=NULL)
        {
            cout<<temp->key<<" ";
            temp = temp->next;
        }
        cout << endl;
    }
};

int main()
{

    LinkedList l;
    l.push_back(12);
    l.push_back(13);
    l.push_front(11);
    l.displayAll();
    cout << l.tail->key;
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
