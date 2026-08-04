class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }

        Stack<Character>s1= new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='(' || ch== '{' || ch=='['){
                s1.push(ch);
            }else if(ch ==')'){
                if(s1.size()>0 && s1.peek()=='('){
                    s1.pop();
                }else{
                    return false;
                }

            }else if(ch =='}'){
                if(s1.size()>0 && s1.peek()=='{'){
                    s1.pop();
                }else{
                    return false;
                }
            }else if(ch ==']'){
                if(s1.size()>0 && s1.peek()=='['){
                    s1.pop();
                }else{
                    return false;
                }
            }
        }
        return s1.size()==0;
        
    }
}
