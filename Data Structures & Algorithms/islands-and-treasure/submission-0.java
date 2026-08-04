class Solution {

    public class pair{
        int row;
        int col;
        int dis;
        public pair(int row,int col,int dis){
            this.row=row;
            this.dis=dis;
            this.col=col;
        }
    }
    int row[]={-1,0,1,0};
    int col[]={0,1,0,-1};
    public void islandsAndTreasure(int[][] grid) {

        Queue<pair>pq=new LinkedList<>();

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    pq.offer(new pair(i,j,0));
                }
            }
        }

        while(!pq.isEmpty()){
            pair p1=pq.poll();
            for(int i=0;i<4;i++){
                int n_row=p1.row+row[i];
                int n_col= p1.col+ col[i];
                int dis=p1.dis;
                if(n_row>=0 && n_col>=0 && n_row<grid.length && n_col<grid[0].length && grid[n_row][n_col]!=-1 && dis+1<=grid[n_row][n_col]){

                     grid[n_row][n_col]= dis+1;
                     pq.offer(new pair(n_row,n_col,dis+1));

                }
                
            }
        }
        
    }
}
