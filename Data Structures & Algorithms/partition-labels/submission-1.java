public class pair{
    int start;
    int end;

    public pair(int start, int end){
        this.start= start;
        this.end=end;
    }
}

class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, pair>h1= new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(!h1.containsKey(ch)){
                h1.put(ch, new pair(i,i));
            }else{
                h1.get(ch).end=i;
            }
        }

         PriorityQueue<pair>pq= new PriorityQueue<>((a,b)->a.start-b.start);

        for(Map.Entry<Character,pair>map:h1.entrySet()){
            pq.add(map.getValue());

        }

        
        List<Integer>ans= new ArrayList<>();
       

        while(!pq.isEmpty()){
             pair p1= pq.poll();
            if( pq.size()>0 && pq.peek().start<p1.end){
                pair p2=pq.poll();
                pq.offer(new pair(Math.min(p1.start, p2.start), Math.max(p1.end, p2.end)));
            }else{
                ans.add(p1.end-p1.start+1);
            }
        }

      

        
        return ans;
    }
}
