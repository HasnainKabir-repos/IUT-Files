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

        Node *prev = NULL;
        Node *temp = root;

        while (temp != NULL)
        {

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

    void printLevelOrder(Node* root){
        if(root == NULL) return;

        queue<Node*> q;

        q.push(root);

        while(!q.empty()){

            Node* node = q.front();

            cout<<node->val<<" ";
            q.pop();

            if(node->left != NULL) q.push(node->left);
            if(node->right != NULL) q.push(node->right);

        }
    }
};

int main(){

    BST a;
    int n;
    cin>>n;
    Node* root = new Node(n);
    a.root = root;
    while(cin>>n && n!=-1)
    {
        a.Insert(n);
    }
    a.printLevelOrder(root);
    return 0;
}
