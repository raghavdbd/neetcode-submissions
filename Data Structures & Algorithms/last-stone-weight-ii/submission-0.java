class Solution {
    public int lastStoneWeightII(int[] stones) {

        int total_sum=0;
        for(int i=0;i<stones.length;i++){
            total_sum += stones[i];
        }
        int target= total_sum/2;
         int dp[][]=new int[target+1][stones.length];
         for(int row[]:dp){
            Arrays.fill(row,-1);
         }
       int temp= solve(0,stones,target,0,dp);
       return total_sum -(2*temp);
        
    }

    public int solve(int ind, int stones[], int tar, int sum,int dp[][]){

        if(ind==stones.length-1){
            if(sum+stones[ind]<=tar){
                return sum+stones[ind];
            }else{
                return sum;
            }
        }
        if(dp[sum][ind]!=-1){
        return dp[sum][ind];
        }
    
        int take=0;
        if(sum+ stones[ind]<= tar){
            take = solve(ind+1,stones, tar,sum+stones[ind],dp);
        }
        int nottake= solve(ind+1,stones,tar,sum,dp);

        return dp[sum][ind]=Math.max(take,nottake);
    }
}
