#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int main(){
    vector<int> v1;
    v1.push_back(12);
    v1.push_back(9);
    v1.push_back(1);
    v1.push_back(3);
    v1.push_back(10);
    v1.push_back(2);

    make_heap(v1.begin(), v1.end());

    for(int i=0;i<v1.size();i++){
        cout<<v1[i]<< " ";
    }
    cout<<endl;


    pop_heap(v1.begin(), v1.end());
    v1.pop_back();
    for(int i=0;i<v1.size();i++){
        cout<<v1[i]<< " ";
    }
    cout<<endl;

    pop_heap(v1.begin(), v1.end());
    v1.pop_back();
    for(int i=0;i<v1.size();i++){
        cout<<v1[i]<< " ";
    }
    cout<<endl;

    v1.push_back(5);
    push_heap(v1.begin(), v1.end());
    for(int i=0;i<v1.size();i++){
        cout<<v1[i]<< " ";
    }
    cout<<endl;
}
