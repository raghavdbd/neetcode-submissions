class Solution {
    public List<List<Integer>> subsets(int[] nums) {
List<List<Integer>>ans= new ArrayList<>();

subset(nums,ans,0, new ArrayList<>());
return ans;

        
    }

    public void subset(int[] nums,List<List<Integer>>ans, int ind, List<Integer>temp ){

        if(ind==nums.length){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        temp.add(nums[ind]);
        subset(nums,ans,ind+1,temp);
        temp.remove(temp.size()-1);
        subset(nums,ans,ind+1,temp);
        return ;





    }


}
