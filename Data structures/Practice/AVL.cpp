#include<iostream>
using namespace std;

class Solution{
  public:
    /*You are required to complete this method */

    Node * left_r(Node * x)
    {
       Node  * y = x->left;
       Node  * b = y->right;
        y->right = x;
        x->left = b;
        return y;
    }

    Node  * right_r(Node * x)
    {
        Node  * y = x->right;
        Node  * b = y->left;
        y->left = x;
        x->right = b;
        return y;
    }


    void height_calc(Node* root, int h, int& ans){


        if(root == NULL){
            ans = max(h, ans);
            return;
        }

        height_calc(root->left, h+1, ans);
        height_calc(root->right, h+1, ans);
    }

    int height_c(Node* root){
        int ans = 0;
        height_calc(root, 0, ans);
        return ans;
    }

    int get_balance_factor(Node* root){
        if(root==NULL) return -1;
        return height_c(root->left)-height_c(root->right);
    }

    Node* insertToAVL(Node* node, int data)
    {
        if(node == NULL){
            return new Node(data);
        }

        if(node->data > data){

            node->left = insertToAVL(node->left, data);
        }
        else if(node->data < data){
            node->right =insertToAVL(node->right, data);
        }else{

            return node;
        }

        int bf=get_balance_factor(node);

        if(bf>1 && get_balance_factor(node->left) >=0)
        {
            return left_r(node);
        }
        if(bf>1 && get_balance_factor(node->left) <0)
        {
            node->left=right_r(node->left);
            return left_r(node);
        }
        if(bf<-1 && get_balance_factor(node->right) <=0)
        {
            return right_r(node);
        }
        if(bf<-1 && get_balance_factor(node->right) >0)
        {
            node->right=left_r(node->right);
            return right_r(node);

        }
        return node;

        //Your code here
    }
};
