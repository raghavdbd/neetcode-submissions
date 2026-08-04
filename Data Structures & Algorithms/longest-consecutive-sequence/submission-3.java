class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>h1=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            h1.add(nums[i]);
        }
        int ans=0;

        for(int i=0;i<nums.length;i++){
            if(!h1.contains(nums[i]-1)){
               int length=1;
               int var=nums[i]+1;
                while(h1.contains(var)){
                    var++;
                    
                    length++;
                }
                ans=Math.max(ans,length);
            }
        }

        return ans;
        
    }
}
