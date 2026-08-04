class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer>h1=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            h1.add(nums[i]);
            
        }
        int count=0;
            int max=0;

            for(int i=0;i<nums.length;i++){
                int temp=nums[i];
                while(h1.contains(temp)){
                    count++;
                    temp=temp-1;
                }
                max=Math.max(max,count);
                count=0;
            }
            return max;
        
    }
}
