class Solution {
    public class pair{
        int row;
        int col;
        int dis;

        public pair(int row,int col, int dis){
            this.row=row;
            this.col=col;
            this.dis=dis;
        }
    }
    int delrow[]={-1,0,1,0};
    int delcol[]={0,1,0,-1};
    public void islandsAndTreasure(int[][] grid) {

        // this Quesation is of multiSource bfs and DFs

        Queue<pair>q1=new LinkedList<>();

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    q1.offer(new pair(i,j,0));
                }
            }
        }

        while(!q1.isEmpty()){
            pair p1=q1.poll();

            for(int i=0;i<4;i++){
                int n_row=p1.row + delrow[i];
                int n_col=p1.col+delcol[i];
                int ndis=p1.dis+1;

                if(n_row>=0 && n_col>=0 && n_row<grid.length && n_col<grid[0].length &&grid[n_row][n_col]!=-1 && grid[n_row][n_col]>ndis){
                    grid[n_row][n_col]=ndis;
                    q1.offer(new pair(n_row,n_col,ndis));
                }
            }
        }

        
    }
}
