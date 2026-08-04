class Solution {
    public class pair{
        int row;
        int column;
        int time;

        public pair(int row, int column, int time){
            this.row=row;
            this.column=column;
            this.time=time;
        }
    }
    public int orangesRotting(int[][] grid) {

        int n= grid.length;
        int m= grid[0].length;

        int time[][]= new int[n][m];

        for(int row[]:time){
            Arrays.fill(row,100000);
        }
        int count=0;


        Queue<pair>q1= new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q1.offer(new pair(i,j, 0));
                }

                if(grid[i][j]==1){
                    count++;
                }
            }
        }

        int delRow[]={-1,0,1,0};
        int delCol[]= {0,1,0,-1};

        while(!q1.isEmpty()){
            pair p1= q1.poll();
            for(int i=0;i<4;i++){
                int nRow=delRow[i]+ p1.row;
                int nCol= delCol[i]+p1.column;
                int nTime= p1.time+1;

                if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && time[nRow][nCol]>nTime && grid[nRow][nCol]==1 ){
                    count--;
                    time[nRow][nCol]= nTime;
                    q1.offer(new pair(nRow,nCol, nTime));


                }


            }


        }

        if(count!=0){
            return -1;
        }
        int max=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(time[i][j]!=100000){
                    max=Math.max(max, time[i][j]);
                }
            }
        }

        return max;

        
    }

}
