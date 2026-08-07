class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
         List<List<Integer>>adj= new ArrayList<>();


        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int indegree[]=new int[numCourses];

        for(int i=0;i<prerequisites.length;i++){
            int u= prerequisites[i][0];
            int v= prerequisites[i][1];
            adj.get(v).add(u);
            indegree[u]++;
        }

        Queue<Integer>q1= new LinkedList<>();
        //List<Integer>ans= new ArrayList<>();
        int ans[]= new int[numCourses];
        int count=0;

        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q1.offer(i);
                ans[count]=i;
                count++;            }
        }

        while(!q1.isEmpty()){

            for(int it: adj.get(q1.poll())){
                indegree[it]--;
                if(indegree[it]==0){
                   ans[count]=it;
                count++;
                    q1.offer(it);

                }



            }

        }
        if(count!=numCourses){
            return new int[0];
        }
    return ans;

        
    }
}
