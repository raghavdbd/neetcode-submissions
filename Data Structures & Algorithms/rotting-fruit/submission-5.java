class Solution {

    public class pair{
        int row;
        int col;
        int time;
        
        public pair(int row, int col, int time){
            this.row=row;
            this.col=col;
            this.time= time;
        }
    }
    int delRow[]={-1,0,1,0};
    int delcol[]={0,1,0,-1};
    public int orangesRotting(int[][] grid) {

        Queue<pair>q1= new LinkedList<>();
        int ans=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q1.offer(new pair(i,j,0));
                }
            }
        }
     
        while(!q1.isEmpty()){
            pair p1= q1.poll();
            ans= Math.max(ans, p1.time);

            for(int k=0;k<4;k++){
                int nrow= delRow[k]+p1.row;
                int ncol = delcol[k]+ p1.col;

                if(nrow>=0 &&ncol>=0 && nrow<grid.length && ncol<grid[0].length && grid[nrow][ncol]==1){
                    grid[nrow][ncol]=2;
                    q1.offer(new pair(nrow,ncol, p1.time+1));


                }


                
                
                            }



        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return ans;
    }
}
