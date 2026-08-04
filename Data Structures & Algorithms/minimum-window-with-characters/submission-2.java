class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character,Integer>h1=new HashMap<>();
        for(int i=0; i< t.length();i++){
            if(h1.containsKey(t.charAt(i))){

                h1.put(t.charAt(i), h1.get(t.charAt(i))+1);
            }else{
                h1.put(t.charAt(i),1);
            }
        }
        int count= h1.size();

        int i=0;
        int j=0;
        int ans = 10000;
        String ans1="";

        while(j<s.length()){
            char ch = s.charAt(j);
            if(h1.containsKey(ch)){

                h1.put(ch, h1.get(ch)-1);
                if(h1.get(ch)==0){
                    count--;
                }
            }
            if(count>0){
                j++;
            }else if(count==0){
                if(j-i+1<ans){
                    ans1=s.substring(i,j+1);
                    ans=j-i+1;

                }
            while(count==0){
                char ch2=s.charAt(i);
                if(h1.containsKey(ch2)){
                h1.put(ch2,h1.get(ch2)+1);
                if(h1.get(ch2)>0){
                    count++;
                }
                if(j-i+1<ans){
                ans1=s.substring(i,j+1);
                ans=j-i+1;
                }
                }
                

                i++;
            }
            

j++;

            }
        }
        return ans1;
        
    }
}
