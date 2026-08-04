class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=nums.length+1;

        int i=0;
        int j=0;
        int sum=0;

        while(j<nums.length){
            sum+=nums[j];
            if(sum<target){
                j++;
            }else{
                ans=Math.min(ans,j-i+1);
                while(sum>=target){
                    sum -=nums[i];
                    ans=Math.min(ans,j-i+1);
                    i++;
                }
                j++;
            }
            
        }
        if(ans==nums.length+1){
            return 0;
        }
        return ans;
        
    }
}