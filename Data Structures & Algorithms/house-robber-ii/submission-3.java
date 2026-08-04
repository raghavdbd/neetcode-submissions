class Solution {
    public int rob(int[] nums) {

        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int dp[]=new int [n];
        
        Arrays.fill(dp,-1);
        
        int a= func(0,n-2,nums,dp);
        Arrays.fill(dp,-1);
        int b= func(1,n-1,nums,dp);
        return Math.max(a,b);
        
    }
    public int func(int start,int end,int nums[],int dp[]){
        if(start>end){
            return 0;
        }
        if(dp[start]!=-1){
            return dp[start];
        }
        int take= nums[start]+ func(start+2,end,nums,dp);
        int nottake= func(start+1,end,nums,dp);
        return dp[start]=Math.max(take,nottake);
    }
}
