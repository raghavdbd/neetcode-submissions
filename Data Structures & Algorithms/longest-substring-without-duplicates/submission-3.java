class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>h1=new HashSet<>();

        int i=0;
        int j=0;
        int ans=0;
        while(j<s.length()){
            char ch =s.charAt(j);
            if(!h1.contains(ch)){
                h1.add(ch);
                ans= Math.max(ans,j-i+1);
                j++;
            }else{
                while(h1.contains(ch)){
                    char ch1=s.charAt(i);
                    h1.remove(ch1);
                    i++;

                }
                 h1.add(ch);
                 ans= Math.max(ans,j-i+1);
                 j++;



            }
        }
        return ans;
        
    }
}
