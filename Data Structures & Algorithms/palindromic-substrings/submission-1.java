class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int sp=-1;
        int max=0;
        int dp[][]= new int[n+1][n+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }


        for(int i=0;i<n;i++){

            for(int j=i;j<n;j++){

                if(solve(i,j,s,dp)==1){

                    max++;


                }

            }
        }

        return max;


        
    }

    public int solve(int i, int j, String s, int dp[][]){

        if(i>=j){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)== s.charAt(j)){
            return dp[i][j]= solve(i+1,j-1,s,dp);
        }else{
            return dp[i][j]= 0;
        }
        
    }
        
    }

