class Solution {
    public int countComponents(int n, int[][] edges) {
        ArrayList<List<Integer>>adj=new ArrayList<>();


        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
       
        for(int i=0;i<edges.length;i++){
            int v=edges[i][0];
            int u=edges[i][1];
            adj.get(u).add(v);
           adj.get(v).add(u);

        }
        boolean vis[]=new boolean[n];
        int count=0;

        for(int i=0;i<n;i++){
            if(vis[i]==false){
                count++;
                bfs(i,adj,vis);
            }

        }
        return count;

    }
    public void bfs(int node, ArrayList<List<Integer>>adj,boolean vis[] ){
        Queue<Integer>q1=new LinkedList<>();
        q1.offer(node);
        vis[node]=true;
        while(!q1.isEmpty()){
            int node1=q1.poll();
            for(int it:adj.get(node1)){
                if(vis[it]==false){
                    vis[it]=true;
                    q1.offer(it);
                }
            }
        }
    }
}
