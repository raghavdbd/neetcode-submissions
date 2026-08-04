class Solution {

    public class pair{
        int node;
        int dis;
        public  pair(int node, int dis){
            this.node=node;
            this.dis=dis;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {

        int dis[]= new int[n+1];
        Arrays.fill(dis, 10000000);

        ArrayList<List<pair>>adj = new ArrayList<>();

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<times.length;i++){
            adj.get(times[i][0]).add(new pair(times[i][1], times[i][2]));
        }

        PriorityQueue<pair>q1= new PriorityQueue<>((a,b) -> a.dis-b.dis);

        q1.offer(new pair(k,0));
        dis[k]=0;

        while(!q1.isEmpty()){
            pair p1= q1.poll();
            int nd= p1.node;
            int dist= p1.dis;

            for(pair it:adj.get(nd)){
                if(dis[it.node]>dist+it.dis){
                    dis[it.node]=dist+it.dis;
                    q1.offer(new pair(it.node,dist+it.dis ));
                }

            }



        }
        int ans=0;

        for(int i=1;i<=n;i++){
            if(dis[i]==10000000){
                return -1;
            }
            ans= Math.max(ans, dis[i]);

        }

        return ans;




        
    }
}
