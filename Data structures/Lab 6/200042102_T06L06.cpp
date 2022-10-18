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

        if(root == NULL){

            return new TreeNode(val);

        }

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


    TreeNode* LowestCommonAncestor(TreeNode* root, int a, int b){
        if(root == NULL){
            return NULL;
        }

        if(root->val > a && root->val >b){
            return LowestCommonAncestor(root->left, a, b);
        }

        else if(root->val <a && root->val <b){

            return LowestCommonAncestor(root->right, a, b);
        }

        return root;

    }


    int maxInd(TreeNode* root, int value){
        TreeNode* node = root;

        int mx = 0;

        while (node -> val != value)
        {
            if (node -> val > value)
            {
                mx = mx > node->val ? mx : node->val;
                node = node -> left;
            }
            else
            {
                mx = mx > node->val ? mx : node->val;
                node = node -> right;
            }
        }

        return mx > value ? mx : value;
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

        int a,b;
        cin>>a>>b;
        //cout<<root->left->val;
        TreeNode* lca = bst.LowestCommonAncestor(root, a, b);
        int x = bst.maxInd(lca, a);
        cout<<x;
        //cout<<max(bst.maxInd(lca, a), bst.maxInd(lca, b))<<endl;
    }
}











