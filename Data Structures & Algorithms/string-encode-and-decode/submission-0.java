class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb= new StringBuilder();

        for(int i=0;i<strs.size();i++){
            String temp=strs.get(i);
            sb.append(temp.length()).append('#').append(temp);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {

        List<String>ans=new ArrayList<>();

        int i=0;

        while(i<str.length()){
           int j=i;
           while(str.charAt(j)!='#'){
            j++;
           }
           int length=Integer.parseInt(str.substring(i,j));
           j++;
           i=j+length;
           String temp= str.substring(j,i);
           ans.add(temp);

        }
        return ans;

    }
}
