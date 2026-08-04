class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int dp[]= new int[stoneValue.length];
        Arrays.fill(dp,Integer.MIN_VALUE);

        int result= solve(stoneValue, 0,dp);
        if(result>0){
            return "Alice";
        }else if(result==0){
            return "Tie";
        }else{
            return "Bob";
        }
        
    }

    public int solve(int[] stoneValue, int ind, int dp[]){

        if(ind>=stoneValue.length){
            return 0;
        }
        if(dp[ind]!=Integer.MIN_VALUE){
            return dp[ind];
        }
        int ans1 = stoneValue[ind]- solve(stoneValue, ind+1,dp) ;
        int ans2=Integer.MIN_VALUE;
        if(ind+1<stoneValue.length){
        ans2= stoneValue[ind] +stoneValue[ind+1] - solve(stoneValue, ind+2,dp);
        }
        int ans3=Integer.MIN_VALUE;
        if(ind+2<stoneValue.length){
             ans3= stoneValue[ind] +stoneValue[ind+1]+ stoneValue[ind+2] - solve(stoneValue, ind+3,dp);

        }
        return dp[ind]= Math.max(ans1, Math.max(ans2,ans3));
    }
}