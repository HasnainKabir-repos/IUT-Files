#include<bits/stdc++.h>
using namespace std;

#define ll long long

const int MAX = 205;

const int maxnodes = 100;
int N,p[110],cap[110][110];
int reg[110];

int bfs(int src,int des, set<int>& visited)
{
    int vis[110]= {0};
    visited.insert(src);
    p[src]=-1;
    queue<int>Q;
    Q.push(src);

    while(!Q.empty())
    {
        int u=Q.front();
        Q.pop();
        for(int i=1; i<=N; i++)
        {
            if(reg[i] <= 0 or cap[u][i] <= 0) continue;
            Q.push(i);
            visited.insert(i);
            p[i]=u;

        }
    }

    return visited.count(des);
}
int maxFlow(int src,int des)
{
    int f=0;
    set<int> visited;
    while(bfs(src,des, visited))
    {

        int path=1e9;
        for(int i=des; i!=src; i=p[i]) path=min(path, min(cap[p[i]][i], reg[i]));

        for(int i=des; i!=src; i=p[i])
        {

            int u=p[i];
            int v=i;

            cap[u][v]-=path;
            //cap[v][u]+=path;
            reg[i]-=path;
        }

        f+=path;

    }
    return f;
}



int main()
{
    int test,cs=0;
    cin>>test;
    while(test--)
    {
        memset(cap,0,sizeof(cap));
        cin>>N;

        for(int i=1;i<=N;i++){
            int a;
            cin>>a;
            reg[i] = a;
        }

        int M;
        cin>>M;

        for(int i=0;i<M;i++){
            int x, y, z;

            cin>>x>>y>>z;
            cap[x][y] = z;
            cap[y][x] = z;
        }

        int B;
        cin>>B;

        int D;
        cin>>D;

        int starts[B];
        int ends[D];

        for(int i=0;i<B;i++){
            int f;
            cin>>f;
            starts[i] = f;
        }

        for(int i=0;i<D;i++){
            int g;
            cin>>g;
            ends[i] = g;
        }

        int f = 0;
        for(int i=0;i<B;i++){
            for(int j=0;j<D;j++){
                f+= maxFlow(starts[i], ends[j]);
            }
        }
        cout <<"Case "<<++cs<<": "<< f << "\n";

    }


}
