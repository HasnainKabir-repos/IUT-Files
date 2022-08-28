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

        node->next = head;
        head=node;
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

    void Reverse()
    {

        Node* prev = nullptr;
        Node* curr = head;
        while (curr) {
            Node* nextTemp = curr->next;
            curr->next = prev;
            prev = curr;
            curr = nextTemp;
        }
        tail = head;
        head = prev;

    }

    void popback(){
        Node* temp = head;
        while(temp->next->next!=NULL){
            temp=temp->next;
        }
        temp->next = NULL;
        tail = temp;
        delete(temp);
    }
};

int main()
{

    LinkedList l;
//    l.push_back(12);
//    l.push_back(13);
//    l.push_front(11);
    l.push_front(10);
    l.displayAll();
    //cout << l.tail->key<<endl;
    //l.Reverse();
    cout<<endl;
    l.popback();
    //l.popback();
    l.displayAll();

}

