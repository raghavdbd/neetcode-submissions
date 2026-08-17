class Solution {
    public class pair{
        int node;
        int time;
        public pair(int node, int time){
            this.node= node;
            this.time=time;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {

        int min[]= new int[n+1];
        min[k]=0;

        List<List<int[]>>adj= new ArrayList<>();


        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
           
        }

        for(int i=0;i<times.length;i++){
           int u= times[i][0];
           int v= times[i][1];
           int time= times[i][2];

           adj.get(u).add(new int[]{v,time});
        }
        for(int i=0;i<=n;i++){
            min[i]=Integer.MAX_VALUE;
        }
        min[k]=0;

       

        Queue<pair>q1= new LinkedList<>();
        q1.offer(new pair(k,0));

        while(!q1.isEmpty()){
            pair p1= q1.poll();
            int num= p1.node;
            int tim= p1.time;
            for(int[] it: adj.get(num)){
                int new_time= tim+ it[1];
                if(min[it[0]]>new_time){
                    min[it[0]]= new_time;
                    q1.offer(new pair(it[0],new_time));
                }



            }
        }

        int ans=0;

        for(int i=1;i<=n;i++){
            if(min[i]==Integer.MAX_VALUE){
                return -1;
            }
            ans= Math.max(ans,min[i]);
        }
        return ans;



        
    }
}
