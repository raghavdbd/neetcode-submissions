class Solution {
    public int maxProfit(int[] nums) {

        int profit=0;
        int buy=nums[0];

        for(int i=1;i<nums.length;i++){

            if(nums[i]<buy){
                buy=nums[i];
            }else{
             profit += nums[i]-buy;
             buy=nums[i];



            }



        }
        return profit;
        
    }
}