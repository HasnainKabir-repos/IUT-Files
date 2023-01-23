class Solution {
public:
    vector<int> findOrder(int numCourses, vector<vector<int>>& prerequisites) {
        map<int, vector<int>> adj;

        vector<int> ans;

        int connections[numCourses];

        for(int i=0;i<numCourses;i++){
            connections[i] = 0;
        }

        for(int i=0;i<prerequisites.size();i++){
            adj[prerequisites[i][1]].push_back(prerequisites[i][0]);
            connections[prerequisites[i][0]]++;
        }

        queue<int> q;

        for(int i=0;i<numCourses;i++){
            if(connections[i] == 0){
                q.push(i);
            }
        }

        while(!q.empty()){

            int x = q.front();
            q.pop();

            if(adj[x].size()>0){

                vector<int> temp = adj[x];
                for(int i=0;i<adj[x].size();i++){

                    connections[temp[i]]--;

                    if(connections[temp[i]] == 0){
                        q.push(temp[i]);
                    }
                }
            }

            ans.push_back(x);
        }

        if(ans.size() == numCourses){
            return ans;
        }

        vector<int> vec;

        return vec;

    }



};
