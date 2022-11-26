#include<iostream>
#include<math.h>
using namespace std;

int main(){

    int n;
    cin>>n;
    int a[n];

    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int k = log(n);
    //cout<<k;

    int dp[n][k];

    for(int i=0;i<n;i++){
        dp[i][0] = a[i];
    }

    for(int j= 1; (1 << j) <=n; j++){
        for(int i=0; (i + (1<<j) - 1) <n ; i++){
            dp[i][j] = min(dp[i][j-1], dp[i + (1 << (j-1))] [j-1]);
        }
    }

    for(int i=0;i<n;i++){
        for(int j =0;j<n;j++){
            cout<<dp[i][j]<<" ";
        }
        cout<<endl;
    }
}
