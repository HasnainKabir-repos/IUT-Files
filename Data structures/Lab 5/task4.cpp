#include <bits/stdc++.h>

using namespace std;
typedef pair<int, bool> pb;

int main(){
    int t;
    cin>>t;

    priority_queue<pb, vector<pb>, greater<pb> > pq;

    int a[t],b[t];
    for(int i=0;i<t;i++){
        cin>>a[i]>>b[i];

        pq.push(make_pair(a[i], true));
        pq.push(make_pair(b[i], false));
    }

    int count1=0;
    int count =0;
    while(pq.size()!=0){
        pb a = pq.top();
        pq.pop();

        bool first  = a.second;

        if(first) count1++;
        else count1--;

        count = max(count, count1);

    }

    cout<<count<<endl;

}

