#include<iostream>
using namespace std;

class Node{
public:
    int key;
    Node* next;

};

class stack{
public:
    Node* head;

    stack(){
        head = NULL;
    }

    void push(int key){
        Node* node = new Node();
        node->key = key;

        node->next = head;
        head = node;
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

    int top(){
        return head->key;
    }

    int pop(){
        Node* temp = head;
        head = head->next;

        return temp->key;
    }
};

int main(){
    stack st;
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.displayAll();
    cout<<st.pop()<<endl;
    st.displayAll();
}
