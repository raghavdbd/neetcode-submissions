class Solution {
    public int coinChange(int[] coins, int amount) {

       int ans=solve(0,coins,amount);
       if(ans==10000000){
        return -1;
       }
       return ans;
        
    }

    public int solve(int ind, int[]coins,int amount){

        
        if(ind==coins.length-1){
            if(amount%coins[ind]==0){
                return amount/coins[ind];
            }
            return 10000000;
        }
       

        int take=10000000;
        if(amount>=coins[ind]){
            take= 1+ solve(ind,coins,amount-coins[ind]);
        }
        int nottake= solve(ind+1,coins, amount);
        return Math.min(take,nottake);
    }
}
