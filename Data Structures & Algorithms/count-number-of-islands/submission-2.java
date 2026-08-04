class Solution {
    public class pair{
        int x;
        int y;
        public pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public int numIslands(char[][] grid) {

        int n=grid.length;
        int m=grid[0].length;
        boolean vis[][]=new boolean[n][m];
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

    public void bfs(int i,int j,char[][] grid,boolean vis[][]){
        // Queue<pair>q1=new LinkedList<>();

        // q1.offer(new pair(i,j));
        vis[i][j]=true;
        int row[]={-1,0,1,0};
        int col[]={0,1,0,-1};
        // while(!q1.isEmpty()){
            // pair p1=q1.poll();

            for(int k=0;k<4;k++){
                int nrow= i+row[k];
                int ncol=j+col[k];
                if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && grid[nrow][ncol]=='1' && !vis[nrow][ncol]){
                    
                    bfs(nrow,ncol,grid,vis);
                }
            }
        // }

  return;


    }
}
