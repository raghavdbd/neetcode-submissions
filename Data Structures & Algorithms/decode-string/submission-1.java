class Solution {
    public String decodeString(String s) {

        Stack<Character>s1= new Stack<>();


        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=']'){

                s1.push(s.charAt(i));
            }else{

                String temp="";

                while(s1.peek()!='['){
                    temp +=s1.pop();
                }
              temp=  new StringBuilder(temp)
                .reverse()
                .toString();
                s1.pop();
                char ch= s1.peek();
                if(Character.isDigit(ch)){
                    StringBuilder numStr = new StringBuilder();

                while (!s1.isEmpty() && Character.isDigit(s1.peek())) {
                    numStr.append(s1.pop());
                }

                numStr.reverse();

                int num = Integer.parseInt(numStr.toString());
                    
                
                    String newString="";
                    for(int j=0;j<num;j++){
                       newString+=temp;
                    }
                    for(int j=0;j<newString.length();j++){
                        s1.push(newString.charAt(j));
                    }




                }




            }
        }
        String ans="";
        while(s1.size()>0){
            ans+=s1.pop();
        }
        
        return  new StringBuilder(ans)
                .reverse()
                .toString();
        
    }

}