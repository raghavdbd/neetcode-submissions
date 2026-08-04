class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int max=0;
        HashSet<Character>h1=new HashSet<>();
        while(end<s.length()){
            if(!h1.contains(s.charAt(end))){
                h1.add(s.charAt(end));
                 
                end++;
               
            }else{
                max=Math.max(max,h1.size());
                while(h1.contains(s.charAt(end))){
                    h1.remove(s.charAt(start));
                    start++;

                }
                h1.add(s.charAt(end));
                end++;


            }
        }
        max=Math.max(max,h1.size());
        return max;
        
    }
}
