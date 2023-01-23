/*
// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
public:
    vector<vector<int>> levelOrder(Node* root) {

        if(root == NULL) return {};

        vector<vector<int>> vec;

        Node* temp = root;

        queue<Node*> q;

        q.push(temp);

        while(!q.empty()){

            vector<int> curr;
            int s = q.size();
            for(int j=0;j<s;j++){
                Node* x = q.front();
                curr.push_back(x->val);

                q.pop();

                for(int i=0;i<x->children.size();i++){
                    if(x->children[i] != NULL){
                        q.push(x->children[i]);
                    }
                }
            }

            vec.push_back(curr);

        }

        return vec;
    }
};
