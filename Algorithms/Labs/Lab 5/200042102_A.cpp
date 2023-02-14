#include<iostream>
using namespace std;

int m;
int a[55];
long long int dp[55][55];

long long int call(int i, int w){
    if(w==0) return 1;
    if(w < 0 || i==m) return 0;

    dp[i][w] = call(i+1, w) + call(i, w-a[i]);

    return dp[i][w];
}

int main(){
    int n;
    cin>>n>>m;
    for(int i=0;i<m;i++){
        cin>>a[i];
    }

    cout<<call(0, n);
}
