class Solution {
    int delRow[]= {-1,0,1,0};
    int delCol[]={0,1,0,-1};
    int count=0;
    public int maxAreaOfIsland(int[][] grid) {
         // bfs Solution
        int n= grid.length;
        int m= grid[0].length;


        boolean vis[][]= new boolean[n][m];
        int max=0;


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && vis[i][j]==false){
                    
                 int ans=   dfs(i,j,grid,vis);
                 max= Math.max(max,ans);
                 count=0;
                }
            }
        }

        return max;


        
    }
    public int dfs(int row, int col ,int[][] grid, boolean vis[][] ){

        vis[row][col]=true;
        count++;
       

        for(int k=0;k<4;k++){
            int nRow= row+delRow[k];
            int nCol= col+ delCol[k];
            if(nRow>=0 && nRow<grid.length && nCol>=0 && nCol<grid[0].length && grid[nRow][nCol]==1 && vis[nRow][nCol]==false){
                dfs(nRow, nCol,grid,vis);

            }
        }
        return count;
    }
}
