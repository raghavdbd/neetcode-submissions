class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
               max=Math.max(max, solve(i,j,nums));
            }
        }
        return max;
        
    }

    public int solve(int i, int j,int nums[]){
        int ans=1;
        for(int k=i;k<=j;k++){
          ans=ans*nums[k];
        }
        return ans;
    }
}
