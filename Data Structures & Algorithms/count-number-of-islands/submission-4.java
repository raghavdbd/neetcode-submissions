class Solution {

    public class pair{
        int x;
        int y;
        public pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    int delrow[]={-1,0,1,0};
    int delcol[]={0,1,0,-1};
      public int numIslands(char[][] grid) {


        int m= grid.length;
        int n=grid[0].length;
       
       // it help me to mark all the vis land
        boolean vis[][]=new boolean[m][n];


        int count=0;
    // now i will travese over a island
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){

                if(grid[i][j]=='1' && vis[i][j]==false){
                    // i will do a bfs and will traverse over a island
                    dfs(i,j,grid,vis);
                    count++;
                }

            }
        }
        return count;



        
    }

    public void dfs(int i, int j,char[][] grid, boolean vis[][] ){
       

        vis[i][j]=true;


       
           
            for(int k=0;k<4;k++){
                int n_row= i+delrow[k];
                int n_col= j + delcol[k];
                if(n_row>=0 && n_row<grid.length && n_col>=0 && n_col<grid[0].length &&grid[n_row][n_col]=='1' && vis[n_row][n_col]==false ){
                    
                    dfs(n_row,n_col,grid,vis);
                }
            }
        





    }
}
