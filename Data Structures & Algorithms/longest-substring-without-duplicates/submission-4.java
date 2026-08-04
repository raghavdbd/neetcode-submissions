class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character>h1=new HashSet<>();

        int i=0;
        int j=0;
        int ans=0;



        while(j<s.length()){
            char ch=s.charAt(j);
            if(!h1.contains(ch)){
                h1.add(ch);
                ans= Math.max(ans,h1.size());
                j++;

            }else{
                while(h1.contains(ch)){
                    char ch2=s.charAt(i);
                    h1.remove(ch2);
                    i++;
                }
                 h1.add(ch);
                  ans= Math.max(ans,h1.size());
                 j++;




            }


        }
        return ans;
        
    }
}
