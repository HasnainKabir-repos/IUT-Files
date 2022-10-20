#include<iostream>
#include<vector>
#include<stack>
using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;

    TreeNode(int x) {
        this->val = x;
        left = NULL;
        right = NULL;
    }

};
class BST {
public:
    vector<int> vec;

    bool PreOrderTraversal(TreeNode* root, vector<int> v1)
    {

        if (root == NULL)
            return true;

        stack<TreeNode*> st;
        st.push(root);

        int i=0;

        while (!st.empty()) {

            TreeNode* node = st.top();

            if(v1[i] != st.top()->val){
                return false;
            }

            //vec.push_back(st.top()->val);
            st.pop();

            if (node->right!=NULL) st.push(node->right);
            if (node->left!=NULL) st.push(node->left);
            i++;
        }

        return true;
    }

    TreeNode* insertIntoBST(TreeNode* root, int val) {

        if(root == NULL) return new TreeNode(val);

        if(root->val > val){
            if(root->left ==NULL){
                root->left = new TreeNode(val);
            }else{
                root->left = insertIntoBST(root->left, val);
            }

        }else{
            if(root->right == NULL){
                root->right = new TreeNode(val);
            }else{
                root->right = insertIntoBST(root->right, val);
            }
        }

        return root;
    }
};

int main(){

    vector<int> v1;
    int n;
    BST bst;
    TreeNode* root = NULL;
    while(cin>>n && n!=-1){
        v1.push_back(n);
        root = bst.insertIntoBST(root, n);
    }


    if(bst.PreOrderTraversal(root, v1)) cout<<"Valid";
    else cout<<"Invalid";

}
