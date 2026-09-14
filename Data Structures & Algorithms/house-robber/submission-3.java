class Solution {
    public int rob(int[] nums) {

        int n= nums.length-1;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);

       return solve(nums,n,dp);
        
    }

    public int solve(int nums[], int n,int dp[]){

        if(n<0){
            return 0;
        }
        if(dp[n]!= -1){
            return dp[n];
        }

        int take= nums[n]+ solve(nums, n-2,dp);

        int nottake= solve(nums, n-1,dp);

        return dp[n]=  Math.max(take,nottake);
    }
}
