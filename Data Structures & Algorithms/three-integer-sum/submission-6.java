class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     List<List<Integer>> ans= new ArrayList<>();

     Arrays.sort(nums);
     int i=0;


     while(i<nums.length-2){
        int num= nums[i];

        int start= i+1;
        int end= nums.length-1;


        while(start<end){
            if(nums[start]+nums[end]==-num){
                ans.add(new ArrayList<>(Arrays.asList(num, nums[start], nums[end])));

                while (start < end && nums[start] == nums[start + 1]) {
    start++;
}

while (start < end && nums[end] == nums[end - 1]) {
    end--;
}
                start++;
                end--;
            }else if(nums[start]+nums[end]>-num){
                end--;
            }else{
                start++;
            }
        }
        while(i<nums.length-1 && nums[i]==nums[i+1]){
            i++;
        }
        i++;



     }
     return ans;

        
    }
}
