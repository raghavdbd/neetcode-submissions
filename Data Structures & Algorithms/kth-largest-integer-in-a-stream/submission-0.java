class KthLargest {

    int k;
    PriorityQueue<Integer>minheap;

    

    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.minheap=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
        
            minheap.add(nums[i]);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        
        
    }
    
    public int add(int val) {
        minheap.add(val);
        if(minheap.size()>k){
            minheap.poll();
        }
        return minheap.peek();
        
    }
}
