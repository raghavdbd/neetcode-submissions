class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer>s1=new Stack<>();

        for(int i=0;i<operations.length;i++){
            String s= operations[i];
            if(s.equals("+")){
                int a=s1.pop();
                int b=s1.pop();
                int c= a+b;
               s1.push(b);   
    s1.push(a);
    s1.push(c);
            }else if(s.equals("D")){
                s1.push(s1.peek()*2);
            }else if(s.equals("C")){
                s1.pop();
            }else{
                int temp=Integer.parseInt(s);
                s1.push(temp);
  System.out.println(s1.peek());
            }
        }
        int ans=0;

        while(!s1.isEmpty()){
            ans+=s1.pop();
        }
        return ans;
        
    }
}