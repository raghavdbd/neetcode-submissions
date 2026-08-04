class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();

        func(0,"",new ArrayList<>(),ans,s);
        return ans;
        
    }
    public void func(int ind,String s1, List<String>temp,List<List<String>> ans,String s ){

        if(ind==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=ind;i<s.length();i++){
            s1 =s.substring(ind, i + 1);
            if(palindrome(s1)){
                temp.add(s1);
                func(i+1,s1,temp,ans,s);
                temp.remove(s1);
                
            }
            
            

        }
    }

    public boolean palindrome(String s){
        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
