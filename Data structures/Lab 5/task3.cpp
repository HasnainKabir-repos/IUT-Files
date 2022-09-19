#include<iostream>
#include<vector>
#include<queue>
using namespace std;

int main(){
    int n,k;
    cin>>n>>k;

    priority_queue <int, vector<int>, greater<int> > pq;
    int h;
    while(n--){
        cin>>h;
        pq.push(h);
    }

    int ct =0;

    while(pq.top()<k){

        if(pq.size()==1){
            ct = -1;
            break;
        }

        int a = pq.top();
        pq.pop();
        int b = pq.top();
        pq.pop();

        pq.push(a+b*2);
        ct++;

    }

    cout<<ct<<endl;
}
