class Solution {

    public class pair{
        int dis;
        int row;
        int col;
        public pair(int dis, int row, int col){
            this.dis= dis;
            this.col=col;
            this.row=row;
        }
    }
    int delRow[]= {-1,0,1,0};
    int delCol[]={0,1,0,-1};
    public void islandsAndTreasure(int[][] grid) {


        Queue<pair>q1 = new LinkedList<>();

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    q1.offer(new pair(0, i,j));
                }
            }
        }

        while(!q1.isEmpty()){
            pair p= q1.poll();

            for(int i=0;i<4;i++){
                int nRow= p.row + delRow[i];;
                int ncol= p.col + delCol[i];

                if(nRow>=0 && ncol>=0 && nRow<grid.length && ncol<grid[0].length && grid[nRow][ncol]!=-1 &&grid[nRow][ncol]!=0  ){
                     
                     if(grid[nRow][ncol]>p.dis+1){
                        grid[nRow][ncol]= p.dis+1;
                        q1.offer(new pair(p.dis+1, nRow,ncol));
                     }

                }




            }


        }



        
    }
}
