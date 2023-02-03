#include<iostream>
#include<map>
#include<vector>
#include<set>
using namespace std;

void DFS(map<int, vector<int>>& adj, set<int>& visited, int node){
    for(int i=0;i<adj[node].size();i++){
        if(!visited.count(adj[node][i])){
            visited.insert(adj[node][i]);
            DFS(adj, visited, adj[node][i]);
        }
    }
}

int main(){

    int n,m;
    cin>>n>>m;

    map<int, vector<int>> adj;

    int nodes[n];

    for(int i=0;i<m;i++){
        int a,b;
        cin>>a>>b;

        adj[a].push_back(b);
    }

    int t;
    cin>>t;

    int start[t];
    for(int i=0;i<t;i++){
        cin>>start[i];
    }

    for(int j=0;j<t;j++){

        for(int i=0;i<n;i++){
            nodes[i] = 0;
        }
        set<int> visited;

        DFS(adj, visited, start[j]);

        int count = n;
        for(int i=0;i<n;i++){
            if(visited.count(i+1)){
                nodes[i] = 1;
                count--;
            }
        }

        cout<<count<<" ";
        for(int i=0;i<n;i++){
            if(nodes[i] == 0) cout<<i+1<<" ";
        }
        cout<<endl;
    }



}
