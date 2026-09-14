class Solution {
    public int minCostClimbingStairs(int[] cost){




        int n=cost.length;
        int dp[]=new int[n+1];

        Arrays.fill(dp,-1);
       

       return Math.min(solve(cost,0,dp),solve(cost,1,dp));

    
        
    }

    public int solve(int cost[], int n, int dp[]){

       
        if(n>=cost.length){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }

       return dp[n]= cost[n]+ Math.min(solve(cost,n+1,dp), solve(cost,n+2, dp));
    }
}
