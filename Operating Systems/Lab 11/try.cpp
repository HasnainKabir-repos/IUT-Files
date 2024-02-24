
#include<iostream>
#include<vector>
#include<queue>
using namespace std;

struct Compare
{
    bool operator()(const int p1, const int p2)
    {
        return p1 > p2;
    }
};

int main(){

    priority_queue<int, vector<int>, Compare> q;

    q.push(1);
    q.push(3);
    q.push(2);


    for(int i=0;i<3;i++){
        cout<<q.top()<<endl;
        q.pop();
    }
}
