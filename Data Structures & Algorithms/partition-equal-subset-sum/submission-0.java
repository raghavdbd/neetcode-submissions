class Solution {
    public boolean canPartition(int[] nums) {
        
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }

      return  solve(0,nums,sum/2);
    }

    public boolean solve(int ind,int nums[],int target){

        if(ind==nums.length-1){
            if(target-nums[ind]==0){
                return true;
            }
            return false;
        }
        if(target==0){
            return true;
        }
        boolean take=false;
        if(nums[ind]<=target){
take= solve(ind+1,nums,target-nums[ind]);

        }
        boolean nottake= solve(ind+1,nums,target);

        return take|| nottake;
    }
}
