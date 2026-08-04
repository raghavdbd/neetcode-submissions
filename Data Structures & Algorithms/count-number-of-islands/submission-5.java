class Solution {
    int delRow[]={-1,0,1,0};
    int delcol[]={0,1,0,-1};
    public int numIslands(char[][] grid) {

        int n= grid.length;
        int m = grid[0].length;
        boolean vis[][]= new boolean[n][m];
        int count=0;


        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){ 

            if(grid[i][j]=='1' &&  vis[i][j]==false){
                
                dfs(i,j,grid,vis);
                count++;
            }

           }

        }

        return count;


      
        
    }
      public void dfs(int i, int j, char[][] grid,boolean vis[][] ){

            vis[i][j]=true;

            for(int k=0;k<4;k++){
                int nrow= i+ delRow[k];
                int ncol= j+delcol[k];

                if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && grid[nrow][ncol]=='1' && vis[nrow][ncol]==false){
dfs(nrow,ncol,grid,vis);



                }
            }


        }
}
