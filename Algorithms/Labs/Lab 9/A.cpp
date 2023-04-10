#include <bits/stdc++.h>
using namespace std;

const int N = 10005;
int dist[N], parent[N];

void BFS(vector<pair<int, int>>& adj, int s, int t){
    priority_queue<pair<int, int>> pq;
    memset(dist, -1, sizeof(dist));
    memset(parent, -1, sizeof(parent));

    pq.push({dist[s], s});
    while (!pq.empty()) {
        int u = pq.top().second;
        pq.pop();

        for (auto v : adj[u]) {
            if (dist[v.first] < min(dist[u], v.second)) {
                dist[v.first] = min(dist[u], v.second);
                parent[v.first] = u;
                pq.push({dist[v.first], v.first});
            }
        }
    }
}

int main(){
    int T;
    cin>>T;

    while(T--){
        int n;
        cin>>n;

        int s, t, c;
        cin>>s>>t>>c;

        vector<pair<int, int>> adj;

        while(c--){
            int i, j, k;
            cin>>i>>j>>k;

            pair<int, int> p1(j, k);
            adj[i].push_back(p1);

            pair<int, int> p1(i, k);
            adj[j].push_back(p2);
        }

        BFS(adj, s, t);

        cout<<dist[t]<<endl;
    }
}
