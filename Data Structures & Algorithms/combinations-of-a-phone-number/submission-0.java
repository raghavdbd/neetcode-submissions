class Solution {
   
    public List<String> letterCombinations(String digits) {
         HashMap<Character,String>h1=new HashMap<>();
    h1.put('2',"abc");
    h1.put('3',"def");
    h1.put('4',"ghi");
    h1.put('5',"jkl");
    h1.put('6',"mno");
    h1.put('7',"pqrs");
    h1.put('8',"tuv");
    h1.put('9',"wxyz");
       List<String>ans=new ArrayList<>(); 
       if(digits.length()==0){
        return ans;
       }

        solve(0,digits,"",ans,h1);
        return ans;
        
    }

    public void solve(int idx,String digits,String temp,List<String>ans, HashMap<Character,String>h1){
        if(temp.length()==digits.length()){
            ans.add(temp);
            return ;
        }
        String str= h1.get(digits.charAt(idx));

        for(int i=0;i<str.length();i++){
            temp +=str.charAt(i);
            solve(idx+1,digits,temp,ans,h1);
            temp = temp.substring(0, temp.length() - 1);
        }
        return ;
    }
}
