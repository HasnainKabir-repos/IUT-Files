#include<iostream>
#include<vector>
#include<Math.h>
using namespace std;

bool isOn(int N, int pos){
    return (bool)(N & (1<<pos));
}

int turnOn(int N, int pos){
    return (N | (1 << pos));
}

//int turnOff(int N, int pos){
//    return (N &! (1 << pos));
//}
int DP(vector<vector<int>>& vec, int mask, int i, int sum, int N){

    if(mask == (1 << N) - 1) return 0;

    for(int j=0; j<N; j++){
        if(!isOn(mask, j)){
            sum = max(sum,  vec[i][j] + DP(vec, turnOn(mask, j), j, sum, N));

        }
    }
    return sum;
}

int main(){

    int mask = 0;
    int sum = 0;
    int N;
    cin>>N;

    vector<vector<int>> a(N, vector<int>(N));

    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            cin>>a[i][j];
        }
    }

    cout<<DP(a, mask, 0, sum, N);


}
