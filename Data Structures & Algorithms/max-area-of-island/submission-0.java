class Solution {
    public class pair{
        int i;
        int j;
        public pair(int i, int j){
            this.i=i;
            this.j=j;
        }
    }
    int delrow[]={-1,0,1,0};
    int delcol[]={0,1,0,-1};
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        int ans=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && vis[i][j]!=-1){
                    
                ans= Math.max(dfs(grid,vis,i,j),ans);


                }
            }
        }

        return ans;
        
    }
    public int dfs(int[][] grid,int vis[][],int i,int j){

        Queue<pair>q1=new LinkedList<>();
        q1.offer(new pair(i,j));
        vis[i][j]=-1;
        int count=1;

        while(!q1.isEmpty()){

            pair p1=q1.poll();
            for(int k=0;k<4;k++){
                int n_row= p1.i + delrow[k];
                int n_col=p1.j +delcol[k];
                if(n_row>=0 && n_row<grid.length && n_col>=0 && n_col<grid[0].length && vis[n_row][n_col]!=-1 && grid[n_row][n_col]==1 ){
                     count++;
                    vis[n_row][n_col]=-1;
                    q1.offer(new pair(n_row,n_col));

                }
            }
        }
        return count;

        
}
}
