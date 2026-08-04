class Solution {
    public boolean checkValidString(String s) {

        Stack<Integer>s1= new Stack<>();
        Stack<Integer>s2= new Stack<>();


        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='('){
                s1.push(i);
            }else if(s.charAt(i)=='*'){
                s2.push(i);
            }else{
                if(s1.size()!=0){
                    s1.pop();
                }else if(s2.size()!=0){
                    s2.pop();
                    
                }else{
                    return false;
                }


            }


        }
        if(s1.size()==0){
            return true;
        }else{
            while(s1.size()!=0){
                if(s2.size()==0){
                    return false;
                }

                if(s1.peek()>s2.peek()){
                    return false;
                }
                
                s1.pop();
                s2.pop();
            }


        }

        return true;


        
    }
}
