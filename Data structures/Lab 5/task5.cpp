#include <iostream>
#include<queue>
using namespace std;

int main ()
{
    priority_queue <int> p;

    int n;
    cin>>n;
    int a,b;
    while(n!=-1)
    {
        p.push(n);
        cin>>n;
    }


    while(p.size()>1)
    {
        a=p.top();
        p.pop();

        if(a==p.top())
        {
            p.pop();
        }
        else{
            b=a-p.top();
            p.pop();
            p.push(b);
        }
    }

    (p.size()==1) ? cout<<p.top()<<endl : cout<<0<<endl;

    return 0;
}
