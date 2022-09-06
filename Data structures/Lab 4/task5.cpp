#include<iostream>
#include<stack>
#include<queue>
using namespace std;

int main(){
    queue<int> q1;

    stack<int> s1;

    int n;
    cin>>n;
    int x;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>x;
        q1.push(x);
    }

    for(int i=0;i<n;i++){
        cin>>a[i];

    }

    for(int i=n-1;i>=0;i--){
        s1.push(a[i]);

    }

    int j =0;
    while(q1.size()>j){

        if(q1.front() == s1.top()){
            q1.pop();
            s1.pop();
            j = 0;
        }else{
            int h = q1.front();

            q1.pop();
            q1.push(h);
            j++;
        }
    }

    cout<<q1.size()<<endl;
}
