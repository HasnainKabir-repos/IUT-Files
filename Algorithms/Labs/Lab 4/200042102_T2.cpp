#include<iostream>
#include<map>
#include<vector>
#include<set>
#include<queue>
using namespace std;
typedef pair<int, int> pd;

struct myComp {
    constexpr bool operator()(
        pair<int, int> const& a,
        pair<int, int> const& b)
        const noexcept
    {
        return a.second > b.second;
    }
};


void BFS(map<int, vector<pair<int, int>>>& adj, priority_queue<pd, vector<pd>, myComp>& pq,
         set<int>& visited, int source, int dist[]){

    if(!visited.count(source)){
        visited.insert(source);

        for(int i=0;i<adj[source].size();i++){

            pair<int, int> p1 (adj[source][i].first, adj[source][i].second + pq.top().second);
            pq.push(p1);

            if(!pq.empty()){
                dist[adj[source][i].first - 1] = min(dist[adj[source][i].first - 1], adj[source][i].second + pq.top().second);
            }
        }
    }

    pq.pop();
    if(!pq.empty()) BFS(adj, pq, visited, pq.top().first, dist);
}

int main(){
    int n, m;
    cin>>n>>m;

    int arr[n][m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            cin>>arr[i][j];
        }
    }

    map<int, vector<pair<int, int>>> adj;

    int x = 1;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            //left check
            if(j!=0){
                pd p1(x-1, arr[i][j-1]);
                adj[x].push_back(p1);
            }

            //right check
            if(j!=m-1){
                pd p1(x+1, arr[i][j+1]);
                adj[x].push_back(p1);
            }

            //up check
            if(i!=0){
                pd p1(x-m, arr[i-1][j]);
                adj[x].push_back(p1);
            }

            //down check
            if(i!= n-1){
                pd p1(x+m, arr[i+1][j]);
                adj[x].push_back(p1);
            }

            x++;
        }
    }

    x--;
//    for(int i=1;i<=x;i++){
//        for(int j=0;j<adj[i].size();j++){
//            cout<<"("<<adj[i][j].first<<","<<adj[i][j].second<<"); ";
//        }
//        cout<<endl;
//    }

    int source = 1;
    int finish = n*m;

    int dist[n*m];

    for(int i=0;i<n*m;i++){
        dist[i] = INT_MAX;
    }

    dist[source-1] = 0;

    priority_queue<pd, vector<pd>, myComp> pq;
    pair<int, int> p1(1, 0);
    pq.push(p1);
    set<int> visited;

    BFS(adj, pq, visited, source, dist);
    cout<<dist[finish-1];

}
