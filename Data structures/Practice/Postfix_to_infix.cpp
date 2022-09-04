#include<iostream>
#include<stack>
using namespace std;
int main(){

    string s;

    cin>>s;

    stack<int> st;

    for(int i=0;i<s.length();i++){
        char c = s[i];
        if(c=='+' || c=='-' || c=='*' || c=='/'){
            int x = st.top();
            st.pop();
            int y = st.top();
            st.pop();

            if(c=='+'){
                st.push(x+y);
            }
            else if(c=='-'){
                st.push(y-x);
            }
            else if(c=='*'){
                st.push(x*y);
            }
            else if(c=='/'){
                st.push(y/x);
            }
        }else{
            st.push(c-'0');
        }
    }

    cout<<st.top()<<endl;
}
