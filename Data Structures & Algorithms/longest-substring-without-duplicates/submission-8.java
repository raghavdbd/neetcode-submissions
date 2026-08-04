class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character>h1= new HashSet<>();

        int ans=0;

        int i=0;
        int j=0;

        while(j<s.length()){
            char ch = s.charAt(j);

            if(!h1.contains(ch)){

                h1.add(ch);
                ans= Math.max(ans, j-i+1);
                j++;

            }else{
                while(h1.contains(ch)){
                    char ch2= s.charAt(i);

                    h1.remove(ch2);
                    i++;
                }
            }
        }

        return ans;
        
    }
}
