class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {

       List<List<Integer>>ans= new ArrayList<>();

       ombinationsum(nums, target, ans, new ArrayList<>(), 0, 0);
       return ans;



        
    }

    public void ombinationsum(int nums[], int target, List<List<Integer>>ans,List<Integer>temp, int ind , int sum){
        

        if(sum==target){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        // Out of bounds or exceeded target
        if (ind >= nums.length || sum > target) {
            return;
        }
        temp.add(nums[ind]);

         ombinationsum(nums, target, ans, temp, ind, sum+ nums[ind]);
         temp.remove(temp.size()-1);
          ombinationsum(nums, target, ans, temp, ind+1, sum);







    }
}
