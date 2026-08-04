class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int n=nums.length;
        while(start<=end){
            int mid=(end+start)/2;
            
            if(nums[mid]<nums[(mid-1+n)%n] && nums[mid]<nums[(mid+1)%n]){
                return nums[mid];



            }else if(nums[mid]<nums[0]){
                end=mid-1;
            }else if(nums[mid]>=nums[0]){
                start=mid+1;

            }
                   
                   
                   
                   
       }
       return nums[0];
        
     }
 }
