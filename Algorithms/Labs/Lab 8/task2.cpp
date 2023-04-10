#include<iostream>
#include<vector>
#include<math.h>
using namespace std;

int mask = 0;

bool isOn(int N, int pos){
    return (bool) (N & (1<<pos));
}

int turnOn(int N, int pos){
    return (N | (1<<pos));
}

int DP(vector<int>& dp, vector<vector<int>>& comp, int mask, int i, int n){

    if(mask == pow(2, n) - 1) return 0;
    if(dp[mask] != -1) return dp[mask];

    int ans = 0;

    for(int j=0;j<comp[i].size();j++){

        if(!isOn(mask, j)){

            ans = max(ans, comp[i][j] + DP(dp, comp, turnOn(mask, j), i+1, n));
        }
    }

    return dp[mask] = ans;
}

int main(){
    int n;
    cin>>n;

    vector<vector<int>> comp(n, vector<int> (n, 0));

    vector<int> dp(1<<16, -1);

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            cin>>comp[i][j];
        }
    }

    cout<< DP(dp, comp, mask, 0, n);
}
