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
};

LinkedList takeInput(){
    char c;

    int j=0;
    LinkedList l;
    while((c=getchar())!='\n'){
        if(c!=' '){
            int k = c - '0';
            l.push_back(k);
            j++;
        }
    }
    return l;
}

LinkedList removeLastHalf(LinkedList l){
    Node* first = l.head;
    Node* second = l.head;

    LinkedList x;

    while(first != NULL){
        if(second ==  NULL || second->next == NULL){
            x.push_back(first->key);
        }else{
            second = second->next->next;
        }

        first = first->next;

    }


    return x;
}

int main(){
    LinkedList l;

    l = takeInput();
    //l.displayAll();

//    l.push_back(1);
//    l.push_back(2);
//    l.push_back(3);
//    l.push_back(4);
//    l.push_back(5);
//    l.push_back(6);

    LinkedList x = removeLastHalf(l);
    x.displayAll();
    x.head->key = -100;
    l.displayAll();

}
