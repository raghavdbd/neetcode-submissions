class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>>ans= new ArrayList<>();
        int i=0;

        while(i<nums.length-1){
            int tar= -nums[i];

            int start=i+1;
            int end=nums.length-1;

            while(end>start){

                if(nums[start]+nums[end]==tar){
                    ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[start], nums[end])));

                    start++;
                    end--;

                    while( start<nums.length && nums[start]==nums[start-1]){
                        start++;
                    }
                    while( end>=0 &&nums[end]==nums[end+1]){
                        end--;
                    }

                }else if(nums[start]+nums[end]>tar){
                    end--;
                }else{
                    start++;
                }



            }
            i++;

            while(i<nums.length && nums[i]==nums[i-1]){
                i++;
            }

        }
        return ans;
        
    }
}
