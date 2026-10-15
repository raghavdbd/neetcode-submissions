class KthLargest {
    int nums[];
    int size;

    PriorityQueue<Integer>pq;



    public KthLargest(int k, int[] nums) {
        this.nums= nums;
        this.size=k;
        pq= new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
        pq.offer(nums[i]);

        if(pq.size()>k){
            pq.remove();
        }
    }
    

        
    }

    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>size){
            pq.remove();
        }

        return pq.peek();


        
    }
}
