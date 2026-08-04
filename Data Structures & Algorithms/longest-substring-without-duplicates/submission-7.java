class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>h1= new HashSet<>();

        int start=0;
        int end= 0;
        int max=0;

        while(end<s.length()){
            char ch = s.charAt(end);
            if(!h1.contains(ch)){
                h1.add(ch);
                 max= Math.max(max, end-start+1);
                end++;
               

            }else{
                

                while(h1.contains(ch)){
                    char ch2= s.charAt(start);
                    h1.remove(ch2);
                    start++;
                }

            }
        }
        return max;
        
    }
}
