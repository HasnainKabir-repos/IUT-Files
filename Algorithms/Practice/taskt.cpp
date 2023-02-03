#include<iostream>
#include<map>
#include<vector>
#include<queue>
#include<set>
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

int lowest_min_dist;

void BFS(map<int, vector<pair<int, int>>>& adj, priority_queue<pd, vector<pd>, myComp>& pq,
         set<int>& colored, int source, int dist[]){

    if(!colored.count(source)){

        colored.insert(source);
        for(int i=0;i<adj[source].size();i++){

            pair<int, int> p1 (adj[source][i].first, adj[source][i].second + pq.top().second);
            pq.push(p1);

            if(!pq.empty()){
                dist[adj[source][i].first - 1] = min(dist[adj[source][i].first - 1], adj[source][i].second + pq.top().second);
            }
        }
    }

    pq.pop();
    if(!pq.empty()) BFS(adj, pq, colored, pq.top().first, dist);

}


int main(){
    int n,m;
    cin>>n>>m;

    map<int, vector< pair<int, int> > > adj;

    vector<vector<int>> vec;

    for(int i=0;i<m;i++){
        vector<int> v;
        for(int j=0;j<3;j++){
            int a;
            cin>>a;
            v.push_back(a);
        }
        vec.push_back(v);
    }

    for(int i=0;i<vec.size();i++){
        pair<int, int> p1(vec[i][1], vec[i][2]);
        adj[vec[i][0]].push_back(p1);
        pair<int, int> p2(vec[i][0], vec[i][2]);
        adj[vec[i][1]].push_back(p2);
    }

    priority_queue<pd, vector<pd>, myComp> pq2;

    vector<pair<int, int>> lowest_dist;

    for(int j=1;j<=n;j++){
        int source = j;

        int dist[n];
        for(int i=0;i<n;i++){
            dist[i] = INT_MAX;
        }
        dist[source-1] = 0;

        priority_queue<pd, vector<pd>, myComp> pq;
        pair<int, int> p(source, 0);
        pq.push(p);
        set<int> colored;

        BFS(adj, pq, colored, source, dist);

        int res = 0;
        for(int i=0;i<n;i++){
            res+=dist[i];
        }

        pair<int, int> p1(source, res);
        pq2.push(p1);
    }


    while(!pq2.empty()){
        cout<<pq2.top().first<<" " ;
        pair<int, int> p1 (pq2.top());
        pq2.pop();

        if(pq2.top().second != p1.second) break;
    }
}
