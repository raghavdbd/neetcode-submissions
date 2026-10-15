class MedianFinder {

    PriorityQueue<Integer>minheap;
    PriorityQueue<Integer>maxheap;


    public MedianFinder() {
        minheap= new PriorityQueue<>();
        maxheap= new PriorityQueue<>(Collections.reverseOrder());

        
    }
    
    public void addNum(int num) {


        if(maxheap.size()==0 || maxheap.peek()>num){
            maxheap.add(num);
            if(Math.abs(maxheap.size()-minheap.size())>1 ){
                minheap.add(maxheap.poll());
            }



        }else{
            minheap.add(num);
            if(minheap.size()>maxheap.size()){
                maxheap.add(minheap.poll());
            }
        }

        




        
    }
    
    public double findMedian() {

        if((minheap.size()+ maxheap.size())%2!=0){
            return maxheap.peek();
        }
        return (double)(minheap.peek()+maxheap.peek())/2;
        
    }
}
