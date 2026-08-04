class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
      return  rob(n-1,nums,dp);
        
    }
    public int rob(int n,int nums[],int[] dp){
        if(n<0){
            return 0;
        }
        if(n==0){
            return nums[0];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        
       
           int take= nums[n]+rob(n-2,nums,dp);
        
        int nottake=rob(n-1,nums,dp);
        return dp[n]= Math.max(take,nottake);
    }
}
