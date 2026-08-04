class Solution {
    public int subarraySum(int[] nums, int k) {

        int sum=0;
        int count=0;
        HashMap<Integer,Integer>h1=new HashMap<>();
        h1.put(0,1);

        for(int i=0;i<nums.length;i++){
            sum+= nums[i];
            if(h1.containsKey(sum-k)){
                count+=h1.get(sum-k);
            }
            if(h1.containsKey(sum)){
                h1.put(sum,h1.get(sum)+1);
            }else{
                h1.put(sum,1);
            }

        }
        return count;
        
    }
}