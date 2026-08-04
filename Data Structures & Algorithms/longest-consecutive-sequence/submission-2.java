class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>h1=new HashSet<>();
        for(int n:nums){
            h1.add(n);
        }

        int ans=0;

        for(int n:nums){
            if(!h1.contains(n-1)){
                int length=1;
                while(h1.contains(n+length)){
                    length++;
                }
                ans=Math.max(ans,length);
            }
        }
        return ans;
        
    }
}
