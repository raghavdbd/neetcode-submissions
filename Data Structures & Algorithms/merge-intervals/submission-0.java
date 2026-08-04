class Solution {
    public class pair{
        int first;
        int second;
        public pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public int[][] merge(int[][] intervals) {


        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->a.first-b.first);

        for(int i=0;i<intervals.length;i++){
            pq.offer(new pair(intervals[i][0],intervals[i][1]));
        }

        ArrayList<pair>temp_ans=new ArrayList<>();

        while(!pq.isEmpty()){
            pair p1=pq.poll();
            if(pq.size()>0 && p1.second>=pq.peek().first){
                pair temp=pq.poll();
                pq.offer(new pair(p1.first,Math.max(p1.second,temp.second)));
            }else{
                temp_ans.add(p1);
            }

        }
        int ans[][]=new int[temp_ans.size()][2];

        for(int i=0;i<temp_ans.size();i++){
            pair p= temp_ans.get(i);
            ans[i][0]=p.first;
            ans[i][1]=p.second;
        }
        
        return ans;
        
    }
}
