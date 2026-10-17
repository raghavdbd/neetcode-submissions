class Solution {
    public String minWindow(String s, String t) {

        if(t.length()>s.length()){
            return "";
        }


        HashMap<Character,Integer>h1= new HashMap<>();


        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(h1.containsKey(ch)){
                h1.put(ch, h1.get(ch)+1);

           
            }else{
                h1.put(ch,1);
            }
        }


        int count=h1.size();

        int max=Integer.MAX_VALUE;
        String ans="";

        int start=0;
        int end=0;
        while(end<s.length()){
            char ch = s.charAt(end);

            if(h1.containsKey(ch)){
                h1.put(ch, h1.get(ch)-1);
                if(h1.get(ch)==0){
                    count--;
                }
            }

            if(count>0){
                end++;
            }else if(count==0){
                while(count==0){
                    if(count==0 && max>end-start+1){
                        max=end-start+1;
                        ans= s.substring(start,end+1);
                    }
                    char ch2= s.charAt(start);
                    if(h1.containsKey(ch2)){
                        h1.put(ch2, h1.get(ch2)+1);
                        if(h1.get(ch2)==1){
                            count++;
                        }
                    }

                    start++;



                }
             end++;



            }
        }

return ans;




        
    }
}


