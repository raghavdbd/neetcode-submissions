class Solution {
    public int numDecodings(String s) {

        int dp[]=new int [s.length()];
        Arrays.fill(dp,-1);
        if(s.charAt(0)=='0'){
            return 0;
        }

   return solve(s,0,dp);
        
    }

    public int solve(String s,int ind,int dp[]){
       
        if(ind>=s.length()){
            return 1;
        }
         if(s.charAt(ind)=='0'){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int one= solve(s,ind+1,dp);
        int two=0;
        if (ind + 1 < s.length()) {
            if (s.charAt(ind) == '1' ||
               (s.charAt(ind) == '2' && s.charAt(ind + 1) <= '6')) {

                two = solve(s, ind + 2,dp);
            }
        }


        return dp[ind]=one+two;
    }
}
