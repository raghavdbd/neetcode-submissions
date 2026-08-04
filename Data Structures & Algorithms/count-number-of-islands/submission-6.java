class Solution {
    public class pair{
        int row;
        int col;
        public pair(int row, int col){
            this.row=row;
            this.col=col;
        }
    }
    int delRow[]= {-1,0,1,0};
    int delCol[]={0,1,0,-1};
    public int numIslands(char[][] grid) {

        // bfs Solution
        int n= grid.length;
        int m= grid[0].length;


        boolean vis[][]= new boolean[n][m];
        int count=0;


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && vis[i][j]==false){
                    count++;
                    bfs(i,j,grid,vis);
                }
            }
        }

        return count;
        
    }

    public void bfs(int i, int j,char[][] grid ,boolean vis[][] ){

        vis[i][j]=true;

        Queue<pair>q1= new LinkedList<>();
        q1.offer(new pair(i,j));

        while(!q1.isEmpty()){
            pair p1= q1.poll();

            for(int k=0;k<4;k++){
                int nRow= p1.row+delRow[k];
                int nCol= p1.col+delCol[k];

                if(nRow>=0 && nRow<grid.length && nCol>=0 && nCol<grid[0].length && grid[nRow][nCol]=='1' && vis[nRow][nCol]==false){
                    vis[nRow][nCol]=true;
                    q1.offer(new pair(nRow, nCol));
                }



            }


        }






    }
}
