class Solution {
    public int rob(int[] nums) {
        int dp[]= new int[nums.length];
        Arrays.fill(dp,-1);

        return solve(nums,0,dp);
        
    }

    public int solve(int nums[], int ind, int dp[]){
        if(ind>nums.length-1){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }

        int take= nums[ind]+ solve(nums, ind+2,dp);
        int nottake= solve(nums, ind+1,dp);

        return dp[ind]=Math.max(take,nottake);
    }
}
