class Solution {
    public class pair{
        int first;
        int second;
        public pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public int[][] insert(int[][] intervals, int[] newInterval) {


        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->Integer.compare(a.first,b.first));
         
        for(int i =0;i<intervals.length;i++){
            pq.offer(new pair(intervals[i][0],intervals[i][1]));
        }
        pq.offer(new pair(newInterval[0],newInterval[1]));
        ArrayList<pair>ans=new ArrayList<>();
        while(!pq.isEmpty()){
            pair p1=pq.poll();
            if(!pq.isEmpty()){
                if(pq.peek().first<=p1.second){
                    pair p2=pq.poll();
                    pq.offer(new pair(Math.min(p1.first,p2.first),Math.max(p1.second,p2.second)));
                }else{
                    ans.add(p1);
                }
            }else{
                ans.add(p1);
                
            }
        }
       
        int ans1[][]=new int[ans.size()][2];
        for(int i=0;i<ans1.length;i++){
            ans1[i][0]=ans.get(i).first;
            ans1[i][1]=ans.get(i).second;
        } 

        return ans1;


        
    }
}
