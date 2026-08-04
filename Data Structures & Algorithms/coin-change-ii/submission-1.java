class Solution {
    public int change(int amount, int[] coins) {
        int dp[][]=new int[amount+1][coins.length];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }

        return solve(amount,coins,0,dp);
        
    }

    public int solve(int tar,int arr[], int ind, int dp[][]){

        if(ind==arr.length-1){
            if(tar%arr[arr.length-1]==0){
                return 1;
            }else{
                return 0;
            }
        }
        if(tar==0){
            return 1;
        }
        if(dp[tar][ind]!=-1){
            return dp[tar][ind];
        }
        int take =0;

        if(tar-arr[ind]>=0){
            take= solve(tar-arr[ind], arr, ind,dp);
        }
        int nottake= solve(tar,arr,ind+1,dp);

        return dp[tar][ind]=take+nottake;
    }
}
