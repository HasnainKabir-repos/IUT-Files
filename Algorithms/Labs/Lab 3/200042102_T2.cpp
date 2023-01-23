/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int sumOfLeftLeaves(TreeNode* root) {
        TreeNode* temp = root;

        queue<pair<TreeNode*, int>> q;
        q.push(pair(temp, 0));


        int sum=0;
        while(!q.empty()){

            TreeNode* x = q.front().first;
            int left = q.front().second;

            if(left==1){
                sum+= x->val;
            }
            q.pop();

            if(x->left != NULL){
                if(x->left->left ==NULL && x->left->right ==NULL){
                    q.push(pair(x->left, 1));
                }else{
                    q.push(pair(x->left, 0));
                }

            }

            if(x->right != NULL){
                q.push(pair(x->right, 0));
            }

        }

        return sum;
    }
};
