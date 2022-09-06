
#include<iostream>
#include<queue>
using namespace std;

int main()
{
    queue<int> q;

    int n=0;

    while(n!=-1)
    {
        cin>>n;
        q.push(n);
    }

    int k;
    cin>>k;

    int ct = 0;
    int y = k;
    while(!q.empty())
    {

        if(y==0)
        {
            if(q.front()==1)
            {
                ct++;
                break;
            }
            else
            {
                y = q.size()-1;

            }
        }
        else
        {

            y--;
        }

        int x = q.front();
        q.pop();
        if(x-1 >0)
        {
            q.push(x-1);
        }
        ct++;
    }

    cout<<ct-1<<endl;
}
