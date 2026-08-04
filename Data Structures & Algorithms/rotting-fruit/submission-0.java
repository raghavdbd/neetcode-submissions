class Solution {
    public class pair{
        int row;
        int col;
        int time;
        public pair(int row,int col,int time){
            this.row=row;
            this.col=col;
            this.time=time;
        }


    }
    int delrow[]={-1,0,1,0};
    int delcol[]={0,1,0,-1};
    public int orangesRotting(int[][] grid) {
        int count=0;

        int n_grid[][]=new int[grid.length][grid[0].length];

        for(int row[]:n_grid){
            Arrays.fill(row,100000);
        }

        Queue<pair>q1=new LinkedList<>();


        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){

                if(grid[i][j]==2){
                    q1.offer(new pair(i,j,0));
                }
                if(grid[i][j]==1){
                    count++;
                }

            }
        }

        while(!q1.isEmpty()){
            pair p1=q1.poll();

            for(int i=0;i<4;i++){
                int n_row= delrow[i]+p1.row;
                int n_col= delcol[i]+p1.col;
                int ntime= p1.time+1  ;

                if(n_row>=0 && n_row<grid.length && n_col>=0 && n_col<grid[0].length && grid[n_row][n_col]==1 && n_grid[n_row][n_col]>ntime){
                    n_grid[n_row][n_col]=ntime;
                    count--;
                    q1.offer(new pair(n_row,n_col,ntime));
                }
                
                
                          }
        }
        if(count!=0){
            return -1;
        }
      int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){

                if(n_grid[i][j]!=100000){
                    max  =Math.max(max,n_grid[i][j]);
                }
                

            }
        }
        return max;
        
    }
}
