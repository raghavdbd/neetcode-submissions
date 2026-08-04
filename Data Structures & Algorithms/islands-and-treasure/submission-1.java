class Solution {

    public class pair{

        int row;
        int col;
        int dis;

        public  pair(int row,int col,int dis){
            this.row=row;
            this.col=col;
            this.dis=dis;
        }
    }
    int delrow[]={-1,0,1,0};
    int delcol[]={0,1,0,-1};
    public void islandsAndTreasure(int[][] grid) {

        int n=grid.length;
        int m= grid[0].length;
    
       Queue<pair>q1=new LinkedList<>();
        for(int i=0;i<n;i++){
            for( int j=0;j<m;j++){

            if(grid[i][j]==0){
                q1.offer(new pair(i,j,0));
            }


        }
        }

        while(!q1.isEmpty()){
            pair p1=q1.poll();

            for(int i=0;i<4;i++){
                int n_row= delrow[i]+ p1.row;;
                int n_col= delcol[i]+p1.col;
                int n_dis= p1.dis+1;
                if(n_row>=0 && n_row<n && n_col>=0 && n_col<m && grid[n_row][n_col] !=-1 &&grid[n_row][n_col]>n_dis ){
                      grid[n_row][n_col]=n_dis;
                      q1.offer(new pair(n_row,n_col,n_dis));

                }
            }


        }
        
    }
}
