class MinStack {
    Stack<Integer>s1;
    Stack<Integer>minStack;

    public MinStack() {
        s1=new Stack<>();
        minStack= new Stack<>();
        
    }
    
    public void push(int val) {
        s1.push(val);
        if(minStack.size()==0 || minStack.peek()>=val ){
            minStack.push(val);
        }
        
    }
    
    public void pop() {
        int val= s1.pop();
        if(minStack.peek()==val){
            minStack.pop();
        }
        
    }
    
    public int top() {
        return s1.peek();
        
    }
    
    public int getMin() {
        return minStack.peek();
        
    }
}
