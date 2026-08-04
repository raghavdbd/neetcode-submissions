class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //hashset and sliding Window

        HashSet<Integer>h1= new HashSet<>();


        int start=0;
        int end= 0;

        while(end<nums.length){
            if(end-start<=k){
                if(h1.contains(nums[end])){
                    return true;
                }
                h1.add(nums[end]);
                end++;
            }else {
                h1.remove(nums[start]);
                start++;
                


            }
        }
        return false;
    }
}