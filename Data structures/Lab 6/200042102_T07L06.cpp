#include<iostream>
#include<queue>
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


    TreeNode* deleteNode(TreeNode* root, int key) {
        if(root == NULL) return NULL;

        if(root->val == key){

            //no child
            if(root->left == NULL && root->right == NULL){
                return NULL;
            }

            //one child
            if(root->left == NULL && root->right!=NULL){
                return root->right;
            }

            if(root->right == NULL && root->left != NULL){
                return root->left;
            }

            //two children

            TreeNode* nd = helper(root->right, root);
            root->val = nd->val;
        }else if(root->val < key){

            root->right = deleteNode(root->right, key);

        }else{

            root->left = deleteNode(root->left, key);
        }

        return root;
    }


    TreeNode* helper(TreeNode* root, TreeNode* parent){

        TreeNode* pre = parent;
        TreeNode* cur = root;

        while(cur->left!=NULL){
            pre = cur;
            cur = cur->left;
        }

        deleteNode(pre, cur->val);
        return cur;

    }

    void printLevelOrder(TreeNode* root){
        if(root == NULL) return;

        queue<TreeNode*> q;

        q.push(root);

        while(!q.empty()){

            TreeNode* node = q.front();

            cout<<node->val<<" ";
            q.pop();

            if(node->left != NULL) q.push(node->left);
            if(node->right != NULL) q.push(node->right);

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

    bst.printLevelOrder(root);

    int t;
    cin>>t;

    while(t--){

        int a;
        cin>>a;

        root = bst.deleteNode(root, a);
        bst.printLevelOrder(root);
        cout<<endl;

    }
}
