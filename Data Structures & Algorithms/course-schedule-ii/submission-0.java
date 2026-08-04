class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        ArrayList<List<Integer>>adj=new ArrayList<>();


        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int indegree[]=new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            int v=prerequisites[i][0];
            int u=prerequisites[i][1];
            adj.get(u).add(v);
            indegree[v]++;

        }
        int ans[]=new int[numCourses];
        
        Queue<Integer>q1=new LinkedList<>();

        for(int i=0;i<adj.size();i++){
            if(indegree[i]==0){
                q1.offer(i);
            }
           
        }

        if(q1.isEmpty() && numCourses >0){
            return new int[0];
        }
 int count=0;
        while(!q1.isEmpty()){
            int node= q1.poll();
            ans[count]=node;
            count++;
            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q1.offer(it);
                }

                
            }
            
        }

      if(count ==numCourses){
        return ans;
      }else{
        return new int[0];
      }
        
    }
}
