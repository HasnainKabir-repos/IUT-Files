
#include<iostream>
#define base 10
#define mod 13
using namespace std;

int main(){
    string pattern, text;
    cin>> text>>pattern;

    int m = pattern.length();
    int n = text.length();

    int h = 1;
    for(int i=0;i<m-1;i++){
        h = ( h * base ) % mod;
    }

    int p=0;
    int t=0;
    for(int i=0;i<m;i++){
        p = (base *p + pattern[i])%mod;
        t = (base *t + text[i] )%mod;
    }

    int j = 0;
    for(int i=0;i<=n-m;i++){
        if(p == t){
            for(j= 0;j<m;j++){
                if(text[i+j] != pattern[j]){
                    cout<<"-1"<<endl;
                    break;
                }
            }
        }

        if(j == m){
            cout<<i;
            return 0;
        }

        if(i<n-m){
            t = (base* (t - text[i] * h) + text[i+m])%mod;

            if(t < 0){
                t = (t+ mod);
            }
        }

    }

    cout<<"NO"<<endl;
}
