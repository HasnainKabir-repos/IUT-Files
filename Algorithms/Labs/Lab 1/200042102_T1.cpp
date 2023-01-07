
#include<iostream>
#include<queue>
#include<map>
using namespace std;

int main(){
    int n;
    cin>>n;

    int adj[n][n];

    map<int, bool> is_celebrity;

    for(int i=0;i<n;i++){

        int count = 0;

        for(int j=0;j<n;j++){
            cin>>adj[i][j];
            if(adj[i][j] == 1) count++;
        }

        if(count == 1){
            is_celebrity[i] = true;
        }
    }

    for(int i=0;i<n;i++){
        if(is_celebrity[i]){
            for(int j=0;j<n;j++){
                if(adj[j][i] != 1){
                    is_celebrity[i] = false;
                }
                if(j == n-1){
                    cout<<"Person "<<i<<" is the celebrity"<<endl;
                    return 0;
                }

            }
        }
    }

    cout<<"There is no celebrity"<<endl;
}
