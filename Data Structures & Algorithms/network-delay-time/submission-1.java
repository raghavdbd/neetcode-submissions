class Solution {

    public class pair{
        int node;
        int time;
        public pair(int node,int time){
            this.time=time;
            this.node=node;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {

        int vis[]=new int [n+1];
        Arrays.fill(vis,1000000);
        ArrayList<List<int[]>>adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<times.length;i++){
            int v=times[i][0];
            int u=times[i][1];
            int timess=times[i][2];
            adj.get(v).add(new int[]{u,timess});
        }

        Queue<pair>pq=new LinkedList<>();
    //     PriorityQueue<pair> pq =
    // new PriorityQueue<>((a, b) -> a.time - b.time);

        pq.offer(new pair(k,0));
        vis[k]=0;

        while(!pq.isEmpty()){
            pair p1=pq.poll();
            for(int it[]:adj.get(p1.node)){
                int node_tmp=it[0];
                int time_tmp=it[1];
                if(vis[node_tmp]>p1.time+time_tmp){
                    vis[node_tmp]=p1.time+time_tmp;
                    pq.offer(new pair(node_tmp,p1.time+time_tmp ));

                }
            }
        }

        int max=0;
        for(int i=1;i<vis.length;i++){
            if(vis[i]==1000000){
                return -1;
            }
            max=Math.max(max,vis[i]);
        }

        return max;

        
    }
}
