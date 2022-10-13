#include<iostream>

using namespace std;

class TreeNode
{
public:

    int val;
    TreeNode *right;
    TreeNode *left;
    TreeNode(int key)
    {
        val=key;
        left=NULL;
        right=NULL;
    }
};

class BST{

public:
    TreeNode* insert(TreeNode* root, int val){

        if(root == NULL) return new TreeNode(val);

        if(root->val > val){

            if(root->left != NULL){

                root->left = insert(root->left, val);
            }else{

                root->left = new TreeNode(val);
            }
        }else{
            if(root->right != NULL){

                root->right = insert(root->right, val);
            }else{
                root->right = new TreeNode(val);
            }

        }

        return root;
    }


    TreeNode* inorder(TreeNode* root){
        if(root == NULL) return root;

        inorder(root->left);
        cout<<root->val<<" ";
        inorder(root->right);
    }

    int height(TreeNode* root){
        if(root == NULL) return 0;
        else{
            int lheight = height(root->left);
            int rheight = height(root->right);


            if(lheight > rheight){

                return (lheight +1);
            }else{
                return (rheight +1);
            }
        }
    }
};


int main(){
    BST bst;

    int a;
    cin>>a;

    TreeNode* root = new TreeNode(a);

    while(cin>>a && a!=-1){

        bst.insert(root, a);
    }

    cout<<bst.height(root)-1<<" ";

}
