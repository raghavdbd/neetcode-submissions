class Solution {
    public int[] maxSlidingWindow(int[] nums, int l) {

        ArrayList<Integer>ans=new ArrayList<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);

        int i=0;
        int j=0;
        while(j<nums.length){
             pq.offer(nums[j]);
            if(j-i+1<l){
               
                j++;
            }else if(j-i+1==l){
                ans.add(pq.peek());
                pq.remove(nums[i]);
                i++;
                j++;

            }

        }
 int[] arr = new int[ans.size()];
for (int k = 0; k < ans.size(); k++) {
    arr[k] = ans.get(k);
}
return arr;
        
    }
}
