class Solution {
    
    public List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {


        ArrayList<List<Integer>>adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;i++){
            int u= prerequisites[i][0];
            int v= prerequisites[i][1];

            adj.get(u).add(v);

        }
         List<Boolean>ans=new ArrayList<>();
       for(int i=0;i<queries.length;i++){
        int node1= queries[i][0];
        int dest=queries[i][1];
        boolean vis[]=new boolean[n];
        Queue<Integer>q1=new LinkedList<>();
        q1.offer(node1);
        vis[node1]=true;
        boolean temp_ans=false;

        while(!q1.isEmpty() && !temp_ans){
            
            int t_node=q1.poll();
            
            for(int it: adj.get(t_node)){
                if(it==dest){
                    temp_ans=true;
                    break;
                }
                if(vis[it]==false){
                    vis[it]=true;
                    q1.offer(it);
                }



            }

        }
        ans.add(temp_ans);



       }
       return ans;
        
    }


}