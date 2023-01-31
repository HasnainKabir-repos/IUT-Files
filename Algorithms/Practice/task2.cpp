#include<iostream>
#include<map>
#include<queue>
#include<set>
#include<vector>
using namespace std;

bool res = 1;

void BFS(map<int, vector<int>>& adj, queue<int>& q,
         map<int, int>& colored, set<int>& visited, int source){

    if(!visited.count(source)){

        visited.insert(source);
        for(int i=0;i<adj[source].size();i++){
            if (colored[source] == 0 ){
                colored[adj[source][i]] = 1;
            }else if(colored[source] == 1){
                colored[adj[source][i]] = 0;
            }

            q.push(adj[source][i]);
        }

        q.pop();

        if(!q.empty())BFS(adj, q, colored, visited, q.front());
    }

    for(int i=0;i<adj[source].size();i++){
        if(colored[source] == colored[adj[source][i]]){
            res = 0;
        }
    }


}

int main(){
    int n,m;
    cin>>n>>m;

    map<int, vector<int>> adj;

    map<int, int> colored;

    for(int i=0;i<m;i++){
        int a,b;
        cin>>a>>b;

        adj[a].push_back(b);
    }

    colored[0] = 0;

    queue<int> q;
    q.push(0);
    set<int> visited;
    BFS(adj, q, colored, visited, 0);

    cout<<res<<endl;
}
