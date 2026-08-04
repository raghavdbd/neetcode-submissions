class Solution {
    public String longestPalindrome(String s) {

        int dp[][]=new int[s.length()][s.length()];

        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        int max=0;
        int sp=-1;

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){

                if(solve(s,i,j,dp)==1){
                    if(j-i+1>max){
                        max=j-i+1;
                        sp=i;
                    }

                }
            }
        }
        return s.substring(sp,sp+max);
        
        
    }

    public int solve(String s, int i,int j, int dp[][]){

    if(i>j){
        return 1;
    }
    if(dp[i][j]!=-1){
        return dp[i][j];
    }
    if(s.charAt(i)==s.charAt(j)){
        return solve(s,i+1,j-1,dp);
    }else{
        return 0;
    }
    }
}
