class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {

     List<List<Integer>>ans=new ArrayList<>();

        func(0,nums,target,new ArrayList<>(),ans);
        return ans;
        
    }

    public void func(int i, int nums[],int k, List<Integer>temp,List<List<Integer>>ans){

        if(k==0){
            ans.add(new ArrayList<>(temp));
            return;
            
        }
        if(i>nums.length-1 || k<=0){
            return;
        }

        temp.add(nums[i]);
        func(i,nums,k-nums[i],temp,ans);
        temp.remove(temp.size()-1);
        func(i+1,nums,k,temp,ans);

        

    }
}
