class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();

        func(0,nums,ans,new ArrayList<>());
        return ans;
        
    }

    public void func(int i,int[] nums,List<List<Integer>>ans,List<Integer>l1  ){

        if(i==nums.length){
            ans.add(new ArrayList<>(l1));
            return;
        }
        l1.add(nums[i]);
        func(i+1,nums,ans,l1);
        l1.remove(l1.size()-1);
        func(i+1,nums,ans,l1);
        return;

    }
}
