#include<iostream>
#include<queue>
using namespace std;
int main(){
    queue<int> tuntuni;

    int n,k;

    cin>>n>>k;

    for(int i=1;i<=n;i++){
        tuntuni.push(i);
    }

    while(tuntuni.size()!=1){
        for(int i=0;i<k-1;i++){
            int x = tuntuni.front();
            tuntuni.pop();
            tuntuni.push(x);
        }
        tuntuni.pop();
    }

    cout<<tuntuni.front();
}
