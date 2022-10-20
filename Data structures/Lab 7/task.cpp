#include<iostream>
#include<vector>
#include<stack>
using namespace std;

bool isValid(vector<int> v1){

    int m = -10000;

    stack<int> st;

    for(int i=0;i<v1.size();i++){

        if(m > v1[i]){
            return false;
        }

        while(!st.empty() && st.top() < v1[i]){
            m = st.top();
            st.pop();
        }

        st.push(v1[i]);
    }

    return true;
}

int main(){

    vector<int> v1;

    int n;
    while(cin>>n && n!=-1){
        v1.push_back(n);
    }

    if(isValid(v1)) cout<<"Valid";
    else cout<<"Invalid";
}
