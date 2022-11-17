#include<iostream>
#include<vector>
#include<unordered_map>
using namespace std;

int main(){
    int n;
    vector<int> vec;
    vector<int> input;

    while(cin>>n && n!=-1){
        vec.push_back(n);
    }

    while(cin>>n && n!=-1){
        input.push_back(n);
    }

    unordered_map<int, int> um;

    for(int i =0;i<vec.size();i++){
        um[vec[i]]++;
    }

    for(int j = 0;j<input.size();j++){
        if(um[input[j]]>0){
            um[input[j]]--;
            input[j] = 0;
        }else{
            cout<<"NO"<<endl;
            return 0;
        }
    }

//    for(int i = 0;i<input.size();i++){
//        if(input[i]){
//            cout<<"NO"<<endl;
//            return 0;
//        }
//    }

    cout<<"YES"<<endl;

}
