class Solution {
public:

    int mergeSort(int start, int end, vector<int>& nums){
        if(start>=end) return 0;
        int mid = (start + end) / 2;
        int res = mergeSort(start, mid, nums) + mergeSort(mid + 1, end, nums);

        for(int i = start, j = mid+1; i<=mid; i++){
            while(j<=end && nums[i]/2.0 > nums[j]) j++;
            res += j-(mid+1);
        }

        sort(nums.begin() + start, nums.begin() + end+ 1 );

        return res;
    }




    int reversePairs(vector<int>& nums) {
        return mergeSort(0, nums.size() - 1, nums);
    }
};
