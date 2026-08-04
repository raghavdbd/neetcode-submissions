class Solution {
    public int firstMissingPositive(int[] nums) {

        // smallest +ve integer


       int i=0;
       while(i<nums.length){
        if(nums[i] > 0 &&
       nums[i] <= nums.length &&
       nums[i] != nums[nums[i] - 1]) {

        int correctIdx = nums[i] - 1;

        int temp = nums[i];
        nums[i] = nums[correctIdx];
        nums[correctIdx] = temp;
    }
    else {
        i++;
    }
       }
        int ans=-1;

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans= j+1;
                break;
            }
        }
        if(ans==-1){
            return nums.length+1;

        }
        return ans;
        
    }
}