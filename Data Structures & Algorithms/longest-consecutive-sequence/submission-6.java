class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer>h1= new HashSet<>();

        for(int i=0;i<nums.length;i++){
            h1.add(nums[i]);
        }
      
        int ans=0;

        for(int i=0;i<nums.length;i++){
           
            if(!h1.contains(nums[i]-1)){
            int num= nums[i];
              int count=0;
            while(h1.contains(num)){
                count++;
                
                num++;


            }
            ans= Math.max(ans,count);
            }

            
            

        }

        return ans;
        
    }
}
