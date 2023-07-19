#include<bits/stdc++.h>
using namespace std;

#define ll long long

const int MAX = 205;

const int maxnodes = 100;
int n,p[110],cap[110][110];


int bfs(int src,int des)
{
    int vis[110]= {0};
    vis[src]=1;
    p[src]=-1;
    queue<int>Q;
    Q.push(src);

    while(!Q.empty())
    {
        int u=Q.front();
        Q.pop();
        for(int i=1; i<=n; i++)
        {
            if(vis[i] or cap[u][i]<=0) continue;
            Q.push(i);
            vis[i]=1;
            p[i]=u;

        }
    }

    return vis[des];
}
int maxFlow(int src,int des)
{
    int f=0;
    while(bfs(src,des))
    {

        int path=1e9;
        for(int i=des; i!=src; i=p[i]) path=min(path,cap[p[i]][i]);

        for(int i=des; i!=src; i=p[i])
        {

            int u=p[i];
            int v=i;

            cap[u][v]-=path;
            //cap[v][u]+=path;

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


        int m,s,t;
        cin>>n>>s>>t>>m;

        for(int i=0;i<m;i++)
        {
            int a,b,c;
            cin >> a >> b >> c;
            cap[a][b]+=c;
            cap[b][a]+=c;
        }
        cout <<"Case "<<++cs<<": "<< maxFlow(s,t) << "\n";

    }


}
