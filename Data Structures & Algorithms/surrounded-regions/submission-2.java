class Solution {

    public class pair{
        int row;
        int col;

        public pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    int delrow[]={-1,0,1,0};
    int delcol[]={0,1,0,-1};
    public void solve(char[][] board) {
        int n=board.length;
        int m = board[0].length;

        Queue<pair>q1=new LinkedList<>();


        for(int i=0;i<m;i++){
            if(board[0][i]=='O'){
                board[0][i]='R';
                q1.offer(new pair(0,i));
            }
            if(board[n-1][i]=='O'){
                board[n-1][i]='R';
                q1.offer(new pair(n-1,i));
            }
        }
        for(int i=0;i<n;i++){
            if(board[i][0] == 'O' ){
                 board[i][0]='R';
                q1.offer(new pair(i,0));
            }
            if( board[i][m-1]=='O'){
                 board[i][m-1]='R';
                q1.offer(new pair(i,m-1));

            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(board[i][j]);
                

        }
        System.out.println();
        }

        while(!q1.isEmpty()){
            pair p1=q1.poll();

            for(int i=0;i<4;i++){
                int nrow=delrow[i]+p1.row;
                int ncol=delcol[i]+p1.col;
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && board[nrow][ncol]=='O'){
                board[nrow][ncol]='R';
                q1.offer(new pair(nrow,ncol));

            }

            }


        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                if(board[i][j]=='R'){
                    board[i][j]='O';
                }
            }
        }
        
    }
}
