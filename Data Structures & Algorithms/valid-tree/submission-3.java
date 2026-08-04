class Solution {

    public class pair{
        int node;
        int parent;
        public pair(int node,int parent){
            this.node=node;
            this.parent=parent;
        }

    }
    public boolean validTree(int n, int[][] edges) {

        ArrayList<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        // create a adjancy List
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v= edges[i][1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        Queue<pair>q1=new LinkedList<>();
        q1.offer(new pair(0,-1));
        boolean vis[]=new boolean[n];
        vis[0]=true;

        while(!q1.isEmpty()){
            pair p1=q1.poll();
            int t_node=p1.node;
            int t_parent=p1.parent;
            
            for(int it:adj.get(t_node)){
                if(vis[it]==false){
                    vis[it]=true;
                    q1.offer(new pair(it,t_node));
                }else{
                    if(it!=t_parent){
                        return false;
                    }
                }

            }
        }
         for(boolean v : vis) {
            if(!v) return false;
        }
        return true;

    }
}
