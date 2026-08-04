class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        HashSet<Character>uniq =new HashSet<>();
        int max=0;

        while(end<s.length()){
            if(!uniq.contains(s.charAt(end))){
                uniq.add(s.charAt(end));
                end++;
                max=Math.max(max,uniq.size());
            }else{
                while(uniq.contains(s.charAt(end))){
                    uniq.remove(s.charAt(start));
                    start++;

                }





            }


        }
        return max;
    }
}
