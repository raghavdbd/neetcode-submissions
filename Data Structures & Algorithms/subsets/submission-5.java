class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans= new ArrayList<>();


        solve(nums, ans, 0, new ArrayList<>());

        return ans;


        
    }


    public void solve(int nums[], List<List<Integer>>ans, int idx,List<Integer>temp  ){

        if(idx==nums.length){
            ans.add(new ArrayList<>(temp));
            return ;
        }

        temp.add(nums[idx]);
        solve(nums,ans, idx+1, temp );
        temp.remove(temp.size()-1);
        solve(nums,ans, idx+1, temp );

        return ;
        


    }
}
