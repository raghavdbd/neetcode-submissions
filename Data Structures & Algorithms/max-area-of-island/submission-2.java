class Solution {

    public class node{
        int row;
        int column;

        public node(int row,int column){
            this.row=row;
            this.column=column;
        }
    }
    int delRow[]={-1,0,1,0};
    int delcol[]={0,1,0,-1};
    public int maxAreaOfIsland(int[][] grid) {


        int m= grid.length;
        int n= grid[0].length;

    boolean vis[][]= new boolean[m][n];
    int max=0;


    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){

            if(grid[i][j]==1 && !vis[i][j]){
             int ans=   bfs(i,j,grid,vis,1);
             max=Math.max(ans,max);
            }
        }
    }
    return max;
        
    }

    public int bfs(int i, int j,int[][] grid,boolean vis[][], int count ){

        vis[i][j]=true;
        Queue<node>q1 = new LinkedList<>();
        q1.offer(new node(i,j));

        while(!q1.isEmpty()){

            node p1= q1.poll();

            for(int k=0;k<4;k++){
                int nrow = p1.row+ delRow[k];
                int ncol= p1.column +delcol[k];

                if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && vis[nrow][ncol]==false && grid[nrow][ncol]==1){
                    count++;
                    q1.offer(new node(nrow,ncol));
                    vis[nrow][ncol]=true;
                }

            }









        }

        return count;





    }
}
