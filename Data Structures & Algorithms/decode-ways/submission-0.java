class Solution {
    public int numDecodings(String s) {
        if(s.charAt(0)=='0'){
            return 0;
        }

   return solve(s,0);
        
    }

    public int solve(String s,int ind){
       
        if(ind>=s.length()){
            return 1;
        }
         if(s.charAt(ind)=='0'){
            return 0;
        }
        int one= solve(s,ind+1);
        int two=0;
        if (ind + 1 < s.length()) {
            if (s.charAt(ind) == '1' ||
               (s.charAt(ind) == '2' && s.charAt(ind + 1) <= '6')) {

                two = solve(s, ind + 2);
            }
        }


        return one+two;
    }
}
