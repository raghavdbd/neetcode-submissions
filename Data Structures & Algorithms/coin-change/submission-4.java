class Solution {
    public int coinChange(int[] coins, int amount) {
int dp[][]=new int[amount+1][coins.length];
       for(int row[]:dp){
        Arrays.fill(row,-1);
       }
       int ans=solve(0,coins,amount,dp);
       
       if(ans==10000000){
        return -1;
       }
       return ans;
        
    }

    public int solve(int ind, int[]coins,int amount,int dp[][]){

        
        if(ind==coins.length-1){
            if(amount%coins[ind]==0){
                return amount/coins[ind];
            }
            return 10000000;
        }
        if(dp[amount][ind]!=-1){
            return dp[amount][ind];
        }
       

        int take=10000000;
        if(amount>=coins[ind]){
            take= 1+ solve(ind,coins,amount-coins[ind],dp);
        }
        int nottake= solve(ind+1,coins, amount,dp);
        return dp[amount][ind]=Math.min(take,nottake);
    }
}
