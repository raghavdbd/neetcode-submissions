class Solution {
    public int countSubstrings(String s) {
  int dp[][]=new int[s.length()][s.length()];

        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        int count=0;

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){

                if(solve(s,i,j,dp)==1){
                   count++;

                }
            }
        }
        return count;
        
        
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
