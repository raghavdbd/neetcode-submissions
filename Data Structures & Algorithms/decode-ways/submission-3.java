class Solution {
    public int numDecodings(String s) {

        int dp[]= new int[s.length()];
        Arrays.fill(dp,-1);

       return solve(s,0,dp);
        
    }

    public int solve(String s, int i, int dp[]){
        if(i>=s.length()){
            return 1;
        }

        if(s.charAt(i)=='0'){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }

        int one= solve(s, i+1,dp);
        int two=0;

        if(i+1<s.length()){

            if(s.charAt(i)=='1'){
                two= solve(s,i+2,dp);
            }else if(s.charAt(i)=='2' && s.charAt(i+1)<='6'){
                 two= solve(s,i+2,dp);
            }
        }
        return dp[i]=one+two;
    }
}
