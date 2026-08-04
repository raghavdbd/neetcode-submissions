class Solution {
    public int lengthOfLIS(int[] nums) {

      return  solve(0,nums, -10000);
        
    }

    public int solve(int ind,int nums[],int prev){

        if(ind>=nums.length){
            return  0;
        }
        int take=0;

        if(prev<nums[ind]){
            take=1+ solve(ind+1,nums,nums[ind]);
        }
        int nottake= solve(ind+1,nums,prev);

        return Math.max(take,nottake);
    }
}
