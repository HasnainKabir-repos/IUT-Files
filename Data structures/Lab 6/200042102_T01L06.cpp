#include<bits/stdc++.h>
using namespace std;


class Node
{
public:

    int val;
    Node *right;
    Node *left;
    Node(int key)
    {
        val=key;
        left=NULL;
        right=NULL;
    }
};
class BST
{
public:
    Node *root;

    void Insert(int key)
    {

        Node *node = new Node(key);

        if (root == NULL)
        {
            root = node;
            return;
        }

        int temp1;

        Node *prev = NULL;
        Node *temp = root;

        while (temp != NULL)
        {
            temp1=abs(temp->val - key);

            if(temp1<4)
            {
                return;
            }

            if (temp->val > key)
            {
                prev = temp;
                temp = temp->left;
            }
            else //if (temp->val < key)
            {
                prev = temp;
                temp = temp->right;
            }

        }

        if (prev->val > key)

            prev->left = node;

        else

            prev->right = node;
    }

    void inorder()
    {
        Node* temp = root;
        stack<Node*> st;
        while (temp != NULL || !st.empty())
        {
            if(temp != NULL)
            {
                st.push(temp);
                temp = temp->left;
            }
            else
            {
                temp = st.top();
                st.pop();
                cout << temp->val << " ";
                temp = temp->right;
            }
        }
    }
};

int main()
{

    BST a;
    int n;
    Node* root = NULL;
    a.root=root;
    while(cin>>n && n!=-1)
    {
        a.Insert(n);
        a.inorder();
        cout <<"\n";
    }
    return 0;
}


