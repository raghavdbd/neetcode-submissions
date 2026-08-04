class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        sub(ans,nums,0,new ArrayList<>());
        return ans;
        
    }
    public void sub(List<List<Integer>>ans, int[] nums, int i, List<Integer>l1){
        if(i==nums.length){
            ans.add(new ArrayList<>(l1));
            return;
        }
        l1.add(nums[i]);
        sub(ans,nums,i+1,l1);
        l1.remove(l1.size()-1);
        sub(ans,nums,i+1,l1);
        return ;

    }
}
