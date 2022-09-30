#include<iostream>
using namespace std;

struct Node{
    int val;
    Node* left;
    Node* right;
    Node* parent;
};

struct Node* newNode(int data)
{
    struct Node* Node = (struct Node*)
    malloc(sizeof(struct Node));
    Node->val = data;
    Node->left = NULL;
    Node->right = NULL;
    Node->parent = NULL;

    return (Node);
}

Node* insert(Node* root, int key){
    if(root == NULL) return newNode(key);

    if(root->val == key) return root;

    if(root -> val > key){
        if(root->left == NULL){
            root->left =  newNode(key);
        }else{
            root->left = insert(root->left, key);
        }
    }else if(root->val <key){

        if(root->right ==NULL){
            root->right =  newNode(key);
        }else{
            root->right = insert(root->right, key);
        }
    }

    return root;
}

void inorderTraversal(Node* root){
    if(root == NULL) return;

    inorderTraversal(root->left);
    cout<<root->val<<" ";
    inorderTraversal(root->right);
}

void preorderTraversal(Node* root){

    if(root == NULL) return;
    cout<<root->val<<" ";
    preorderTraversal(root->left);
    preorderTraversal(root->right);
}

void postorderTraversal(Node* root){
    if(root== NULL) return;

    postorderTraversal(root->left);
    postorderTraversal(root->right);

    cout<<root->val<< " ";
}

int main(){


    struct Node* root = NULL;

    root=insert(root, 50);
    root=insert(root, 40);
    root=insert(root, 60);
    root=insert(root, 45);
    root=insert(root, 55);
    root=insert(root, 70);
    root=insert(root, 30);

    inorderTraversal(root);

    cout<<endl;

    preorderTraversal(root);

    cout<<endl;

    postorderTraversal(root);



}
