#include<iostream>
#include<vector>
#include<set>
#include<algorithm>
using namespace std;

int binary_search(vector<int>& numbers, int left, int right, int target){

    if(right >=left){
        int mid = (left + right) / 2;

        if(numbers[mid] == target){
            return mid;
        }

        if(numbers[mid] > target){

            return binary_search(numbers, left, mid-1, target);
        }

        return binary_search(numbers, mid+1, right, target);
    }

    return -1;
}

int main(){
    int n;
    int target;
    vector<int> vec;

    while(cin>>n && n!=-1){
        vec.push_back(n);
    }
    cin>>target;

    sort(vec.begin(), vec.end());

    vector<pair<int, int>> ret;

    for(int i = 0;i<vec.size();i++){
        int val = vec[i];

        int num = target - vec[i];

        int ind = binary_search(vec, i+1, vec.size()-1, num);

        if(ind != -1){
            ret.push_back(make_pair(val, vec[ind]));
        }
    }

    if(ret.empty()){
        cout<<"No such pairs found";
        return 0;
    }

    for(auto it = ret.begin(); it!=ret.end();it++){
        cout<<"("<<it->first<<","<<it->second<<"), ";
    }
}
