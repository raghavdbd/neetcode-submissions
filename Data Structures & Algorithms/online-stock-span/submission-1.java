class StockSpanner {
    Stack<Integer>s1;
    Stack<Integer>s2;

    public StockSpanner() {
        s1=new Stack<>();
        s2=new Stack<>();
        
    }
    
    public int next(int price) {
        int count=1;
        if(s1.size()==0){
            s1.push(price);
            return 1;

        }else{
            while( s1.size()>0 && s1.peek()<=price){
                count++;
                s2.push(s1.pop());
            }
            while(s2.size()>0){
                s1.push(s2.pop());

            }
            s1.push(price);
            return count;


        }
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */