class Node{
    Node next;
    int val;
    public Node(int val){
        this.val=val;
        this.next=null;
    }
}


class MinStack {
    Node head=null;
    Node min=null;
    

    public MinStack() {
        this.head=null;
        this.min=null;
        
    }
    
    public void push(int val) {
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
            min=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
        if(min==null ||  min.val>=val){
            Node newmin=new Node(val);
            newmin.next=min;
            min=newmin;
        
            
        
    }
    }
    
    public void pop() {
        int valu= head.val;
        head=head.next;
        if(min!=null && min.val==valu){
            min=min.next;

        }

        
    }
    
    public int top() {
        return head.val;

        
    }
    
    public int getMin() {
        return min.val;
        
    }
}
