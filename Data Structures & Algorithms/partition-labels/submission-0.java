class Solution {
    public List<Integer> partitionLabels(String s) {

        List<Integer> ans= new ArrayList<>();

        HashMap<Character,Integer>h1= new HashMap<>();


        for(int i=0;i<s.length();i++){
            h1.put(s.charAt(i),i);
        }
        int start=0;
        int i=0;

        while(i<s.length()){
            char ch =s.charAt(i);

            int last= h1.get(ch);

            for(int j=start;j<=last;j++){
                int nlast= h1.get(s.charAt(j));
                if(nlast>last){
                    last=nlast;
                }



            }
            ans.add(last-start+1);
            i=last+1;
            start=last+1;


        }
        return ans;
        
    }
}
