class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>>ans= new ArrayList<>();


        int i=0;

        while(i<nums.length-2){

            int first= -nums[i];

            int j=i+1;
            int k= nums.length-1;

            while(j<k){

                if(nums[j]+nums[k]==first){
                    List<Integer> temp = List.of(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                     while(j<nums.length-1 && nums[j]==nums[j+1]){
                j++;
               }
               while(k>0 && nums[k]==nums[k-1]){
                k--;
               }
              

                   }
                    if(nums[j]+nums[k]>first){
                k--;
               }else{
                j++;
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


