class Solution {
    public class pair{
        String s;
        int dis;
        public pair(String s , int dis){
            this.s=s;
            this.dis=dis;
        }
    }
    public int openLock(String[] deadends, String target) {


        HashSet<String>h1=new HashSet<>();

      for(int i=0;i<deadends.length;i++){
        h1.add(deadends[i]);
      }
      Queue<pair>q1=new LinkedList<>();
      q1.offer(new pair("0000",0));
      if(h1.contains("0000")){
        return -1;
      }
      h1.add("0000");

      while(!q1.isEmpty()){
        pair p1=q1.poll();
        String temp=p1.s;
        int t_dis=p1.dis;
        if(temp.equals(target)){
            return t_dis;
        }
        
        String temp1="";
        String temp2="";

        for(int i=0;i<temp.length();i++){
            
            char[] arr = temp.toCharArray();
            int digit = arr[i] - '0';
            if(digit==9){
                digit=0;
            }else{
                digit=digit+1;
            }
            arr[i] = (char)(digit + '0');
            temp1 = new String(arr);
        
        char[] arr2 = temp.toCharArray();
        int digit2 = arr2[i] - '0';
        if(digit2== 0){
            digit2=9;
        }else{
            digit2=digit2-1;
        }
        arr2[i] = (char)(digit2 + '0');
        temp2=new String(arr2);

        if(target.equals(temp1) || target.equals(temp2)){
            return t_dis+1;
        }
        if(!h1.contains(temp1)){
            q1.offer(new pair(temp1,t_dis+1));
            h1.add(temp1);
        }
        if(!h1.contains(temp2)){
            q1.offer(new pair(temp2,t_dis+1));
            h1.add(temp2);
        }



        }
      }
      return -1;
           
        
    }
}