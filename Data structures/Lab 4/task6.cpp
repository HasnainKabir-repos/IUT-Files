#include<iostream>
#include<queue>
using namespace std;

int main(){
    queue<int> q1;

    int n,k;

    cin>>n>>k;

    for(int i=1;i<=n;i++){
        q1.push(i);
    }

    while(q1.size()!=1){
        for(int i=0;i<k-1;i++){
            int x = q1.front();
            q1.pop();
            q1.push(x);
        }
        q1.pop();
    }

    cout<<q1.front();
}

