class Solution {
    public String sort(String str){
        char[] charArray = str.toCharArray();
        
        // Sort the character array
        Arrays.sort(charArray);
        
        // Convert the sorted character array back to a string
        String sortedStr = new String(charArray);
        return sortedStr;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>h1=new HashMap<>();
        List<List<String>>ans=new ArrayList<>();


        for(int i=0;i<strs.length;i++){
            String temp=sort(strs[i]);
            if(h1.containsKey(temp)){
                h1.get(temp).add(strs[i]);
            }else{
                List<String>temp1=new ArrayList<>();
                temp1.add(strs[i]);
                h1.put(temp,temp1);
            }




        }


 for (Map.Entry<String, List<String>> entry : h1.entrySet()) {
            ans.add(entry.getValue());
        }
return ans;




        
    }
}
