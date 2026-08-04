class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>>ans= new ArrayList<>();
        HashSet<Integer>vis= new HashSet<>();

        solve(nums,ans,0, new ArrayList<>(),vis);

        return ans;
        
    }

    public void solve(int[] nums, List<List<Integer>>ans, int ind,List<Integer>temp, HashSet<Integer>vis ){



        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));

            return;


        }

        for(int i=0;i<nums.length;i++){
            if(vis.contains(nums[i])){
                continue;
            }
            vis.add(nums[i]);
            temp.add(nums[i]);
            solve(nums,ans,i+1,temp,vis);
            vis.remove(nums[i]);
           temp.remove(temp.size()-1);
        }

        return;



    }
}
