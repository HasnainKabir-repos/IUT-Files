#include<iostream>
#include<map>
#include<stack>
using namespace std;

int main(){

    int n;
    cin>>n;

    int adj[n][n];

    for(int i=0;i<n;i++){
        for(int j = 0;j<n;j++){

            cin>>adj[i][j];
        }
    }

    map<int, bool> m1;
    stack<int> st;

    for(int i = 0;i<n;i++){

        stack<int> st;

        if(!m1[i]){
            m1[i] = true;
            for(int j = 0;j <n;j++){
                if(!m1[j] && adj[i][j] == 1){
                    st.push(j);
                    m1[j] = true;
                }
            }
        }

        n-=st.size();
    }

    cout<<n<<endl;
}
