class Solution {
    public class pair{
        int node ;
        int parent;
        public pair(int node, int parent){
            this.node=node;
            this.parent=parent;
        }
    }
    public boolean validTree(int n, int[][] edges) {

        // if we are able  to find cycle in undirected Graph than there no

ArrayList<List<Integer>>adj=new ArrayList<>();

for(int i=0;i<n;i++){
    adj.add(new ArrayList<>());
}
for(int i=0;i<edges.length;i++){
    int v=edges[i][0];
    int u= edges[i][1];

    if(v==u){
        return false;
    }
    adj.get(u).add(v);
    adj.get(v).add(u);
}

boolean vis[]=new boolean[n];

boolean ans=true;;

int  components=0;

for(int i=0;i<n;i++){
    if(vis[i]==false){
        components++;
      ans=  bfs(adj,n,i,vis);

      if(ans==false){
        return false;
      }
    }
}

return components==1;




    }

    public boolean bfs(ArrayList<List<Integer>>adj, int n, int node, boolean vis[]){
        Queue<pair>q1=new LinkedList<>();
        q1.offer(new pair(node,node));

        vis[node]=true;

        while(!q1.isEmpty()){
            pair p1=q1.poll();
            int tm_node=p1.node;
            for(int it:adj.get(tm_node)){
                if(vis[it]==false){
                    vis[it]=true;
                    q1.offer(new pair(it,p1.node));
                }else{
                    if(it!=p1.parent){
                        return false;
                    }
                }
            }



        }

        return true;



    }
}
