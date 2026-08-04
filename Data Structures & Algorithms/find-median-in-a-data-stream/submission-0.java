class MedianFinder {
    PriorityQueue<Integer>pq;

    public MedianFinder() {
        pq=new PriorityQueue<>();
        
    }
    
    public void addNum(int num) {
        pq.offer(num);
        
    }
    
    public double findMedian() {
        ArrayList<Integer>temp=new ArrayList<>();

        int n=pq.size();
        if(pq.size()==1){
            return (double)pq.peek();
        }
        if(pq.size()%2!=0){
            int count=pq.size()/2;;
            while(count!=0){
                temp.add(pq.poll());
                count--;
            }
            int ans=pq.peek();
            for(int i=0;i<temp.size();i++){
                pq.offer(temp.get(i));

            }
            return (double)ans;
        }else{

            int count=pq.size()/2-1;
            while(count!=0){
                temp.add(pq.poll());
                count--;
            }
        }
        int temp1= pq.peek();
        System.out.println(temp1);
        temp.add(pq.poll());
        int temp2= pq.peek();
        System.out.println(temp2);
        temp.add(pq.poll());
        for(int i=0;i<temp.size();i++){
                pq.offer(temp.get(i));

            }
           return (double)(temp1 + temp2) / 2;
           

        
    }
}
