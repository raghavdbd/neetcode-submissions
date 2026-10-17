class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        PriorityQueue<Integer>pq= new PriorityQueue<>(Collections.reverseOrder());
        int ans[]= new int[nums.length-k+1];

        int start=0;
        int end=0;
        int ind=0;

        while(end<nums.length){
              pq.offer(nums[end]);
            if(end-start+1<k){
              
                end++;
            }else if(end-start+1==k){
                ans[ind]=pq.peek();
                ind++;
                pq.remove(nums[start]);
                start++;
                end++;


            }
            
        }
        return ans;
        
    }
}
