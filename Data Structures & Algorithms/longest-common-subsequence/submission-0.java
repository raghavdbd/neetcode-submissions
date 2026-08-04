class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        int len1=text1.length();
        int len2=text2.length();

        int dp[][]=new int[len1][len2];

        for(int row[]:dp){
            Arrays.fill(row,-1);

        }
        return lcs(len1-1,len2-1,dp,text1,text2);



        
    }
    public int lcs(int len1,int len2, int[][]dp,String text1, String text2){
if(len1<0 || len2<0){
    return 0;
}
if(dp[len1][len2]!=-1){
    return dp[len1][len2];
}

if(text1.charAt(len1)== text2.charAt(len2)){
    dp[len1][len2]=1+ lcs(len1-1,len2-1,dp,text1,text2);
}else{
    dp[len1][len2]=Math.max(lcs(len1-1,len2,dp,text1,text2),lcs(len1,len2-1,dp,text1,text2));
}
return dp[len1][len2];




    }
}
