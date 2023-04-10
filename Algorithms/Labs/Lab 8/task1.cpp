#include<iostream>
#include<vector>
#include<math.h>
using namespace std;

int DP(vector<int>& vec, vector<int>& pre, int l, int r){

    if(l==r) return 0;
    int ans = INT_MAX;

    for(int i=l;i<r;i++){
        ans = min(ans, DP(vec, pre, l, i) + DP(vec, pre, i+1, r) + ((pre[i]-pre[l-1])%100) * ((pre[r]-pre[i])%100));

    }

    return ans;
}
int main(){
    int n;
    cin>>n;

    vector<int> vec;
    for(int i=0;i<n;i++){
        int a;
        cin>>a;
        vec.push_back(a);
    }

    vector<int> pre(n+1);
    pre[0] = 0;

    for(int i=1;i<=n;i++){
        pre[i] = pre[i-1] + vec[i-1];
    }

    cout<<DP(vec, pre, 1, n);
}
