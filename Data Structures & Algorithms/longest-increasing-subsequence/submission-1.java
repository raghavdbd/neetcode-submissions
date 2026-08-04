class Solution {
    public int lengthOfLIS(int[] nums) {

        int dp[][]=new int[nums.length][nums.length+1];

        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
      return  solve(0,nums, -1,dp);
        
    }

    public int solve(int ind,int nums[],int prev,int dp[][]){

        if(ind>=nums.length){
            return  0;
        }
        int take=0;
        if(dp[ind][prev+1]!=-1){
            return dp[ind][prev+1];
        }

        if(prev == -1 || nums[ind] > nums[prev]){
            take = 1 + solve(ind + 1, nums,ind, dp);
        }
        int nottake= solve(ind+1,nums,prev,dp);

        return dp[ind][prev+1] =Math.max(take,nottake);
    }
}
