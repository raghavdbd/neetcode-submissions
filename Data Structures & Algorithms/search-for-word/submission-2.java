class Solution {
    public boolean exist(char[][] board, String word) {
boolean ans =false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
            ans=   dfs(board,word,0,i,j);
            if(ans==true){
                return true;
            }
                }
            }

            

        }
        return false;
    }

        public boolean dfs(char[][] board, String word,int ind ,int i,int j){
            char ch= board[i][j];
            if(ind==word.length()-1 &&ch==word.charAt(ind) ){
                return true;
            }

            if(ind>word.length()-1 || word.charAt(ind)!=ch){
                return false;
            }
      board[i][j] ='#';
      int delrow[]={-1,0,1,0};
      int delcol[]={0,1,0,-1};

      for(int k=0;k<4;k++){
        int n_row=i+delrow[k];
        int n_col=j+delcol[k];
        if(n_row>=0 && n_row<board.length && n_col>=0 && n_col<board[0].length ){

            if(dfs(board,word,ind+1,n_row,n_col)){
                return true;
            }
        }
      }
      board[i][j]= ch;

      return false;
      
            
        
    }
}
