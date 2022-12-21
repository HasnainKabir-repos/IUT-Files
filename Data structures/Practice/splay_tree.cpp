#include<iostream>
using namespace std;

class node{
public:
    int key;
    node *left, *right;
};

node *TreeNode(int key)
{
    node *Node = new node();
    Node->key = key;
    Node->left = Node->right = NULL;
    return (Node);
}

node *right_rotate(node *x)
{
    node *y = x->left;
    x->left = y->right;
    y->right = x;
    return y;
}

node *left_rotate(node *x)
{
    node *y = x->right;
    x->right = y->left;
    y->left = x;
    return y;
}

node *splay(node *root, int key)
{

    if (root == NULL || root->key == key)
        return root;

    if (root->key > key)
    {

        if (root->left == NULL)
            return root;

        if (root->left->key > key)
        {

            root->left->left = splay(root->left->left, key);

            root = right_rotate(root);
        }
        else if (root->left->key < key)
        {
            root->left->right = splay(root->left->right, key);

            if (root->left->right != NULL)
                root->left = left_rotate(root->left);
        }

        return (root->left == NULL) ? root : right_rotate(root);
    }

    else
    {
        if (root->right == NULL)
            return root;

        if (root->right->key > key)
        {

            root->right->left = splay(root->right->left, key);

            if (root->right->left != NULL)
                root->right = right_rotate(root->right);
        }

        else if (root->right->key < key)
        {

            root->right->right = splay(root->right->right, key);
            root = left_rotate(root);
        }

        return (root->right == NULL) ? root : left_rotate(root);
    }
}

node *bstSearch(node *root, int key)
{
    return splay(root, key);
}


