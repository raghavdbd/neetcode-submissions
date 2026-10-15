class Solution {
    public boolean checkValidString(String s) {

        Stack<Integer>open= new Stack<>();
        Stack<Integer>star= new Stack<>();


        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open.push(i);
            }else if(s.charAt(i)=='*'){
                star.push(i);
            }else{
                if(open.size()>0 && open.peek()<i){
                    open.pop();
                }else if(star.size()>0 && star.peek()<i){
                    star.pop();
                }else{
                    return false;
                }
            }
        }

        while(open.size()!=0){
            if(star.size()>0 && open.peek()<star.peek()){
                open.pop();
                star.pop();
            }else{
                return false;
            }
        }

        return true;


        
    }
}
