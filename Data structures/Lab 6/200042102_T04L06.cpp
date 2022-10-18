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

    int count = 0;
    int inorder(TreeNode* root, value){
        if(root == NULL) return 0;

        inorder(root->left);

        if(root->val == value){
            return count;
        }

        else{

            count++;
        }

        inorder(root->right);

        if(root->val == value){
            return count;
        }

        else{

            count++;
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

    int t;
    cin>>t;

    while(t--){

        int a;
        cin>>a;

        cout<<bst.inorder(root, a);
        cout<<endl;

    }
}
