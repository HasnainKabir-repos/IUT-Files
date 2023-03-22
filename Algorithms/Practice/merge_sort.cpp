#include<iostream>
#include<vector>
using namespace std;

void merge(vector<int>& nums, int l, int mid, int h){
    vector<int> Arr(h-l+1);

    int i = l, j = mid+1, k = 0;

    while(i <= mid && j<=h){

        if(nums[i] < nums[j]){
            Arr[k++] = nums[i++];
        }
        else{
            Arr[k++] = nums[j++];
        }
    }

    for(; i<=mid; i++){
        Arr[k++] = nums[i];
    }

    for(; j<=h; j++){
        Arr[k++] = nums[j];
    }

    for(int m = 0; m<k; m++){
        nums[l+m] = Arr[m];
    }

    Arr.clear();
}

void mergeSort(vector<int>& nums, int low, int high){
    if(low<high){
        int mid = (low+high) / 2;

        mergeSort(nums, low, mid);
        mergeSort(nums, mid+1, high);

        merge(nums, low, mid, high);
    }
}

int main(){
    vector<int> nums = {9,3,7,5,6,4,8,2};

    mergeSort(nums, 0, 7 );

    for(int i=0;i<nums.size();i++){
        cout<<nums[i]<<" ";
    }
}
