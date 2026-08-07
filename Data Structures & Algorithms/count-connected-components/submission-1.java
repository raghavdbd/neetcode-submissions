class Solution {
    public int countComponents(int n, int[][] edges) {

        List<List<Integer>>adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            int u= edges[i][0];
            int v=edges[i][1];
            adj.get(v).add(u);
            adj.get(u).add(v);

        }
        boolean vis[]= new boolean[n];
        int count=0;

        for(int i=0;i<n;i++){
            if(vis[i]==false){
                count++;
                dfs(i, vis, adj);

            }

        }
        return count;

    



    }

    public void dfs(int node,boolean vis[],List<List<Integer>>adj  ){
        vis[node]=true;

        for(int it: adj.get(node)){
            if(vis[it]==false){
            dfs(it,vis,adj);
            }
        }
    }
}
