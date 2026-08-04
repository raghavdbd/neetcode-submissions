public class TrieNode{
    TrieNode arr[];
    String word;

    public TrieNode(){
        arr=new TrieNode[26];
        word=null;
    }
}


class Solution {
    ArrayList<String>ans=new ArrayList<>();
    public List<String> findWords(char[][] board, String[] words) {
        

        TrieNode root= new TrieNode();


        for(int i=0;i<words.length;i++){
            insert(words[i], root);
        }

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++ ){
                dfs(root, i,j, board);

            }
        }

   return ans;
        


        
    }

    public void dfs(TrieNode root,int i,int j, char[][] board){

        char ch =board[i][j];
        if(board[i][j]=='#' || root.arr[ch-'a']==null){
            return;
        }
        
        board[i][j]='#';
        root=root.arr[ch-'a'];
        if(root.word!=null){
            ans.add(root.word);
            root.word=null;
        }
        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
        for(int k=0;k<4;k++){
            int n_row= i+delrow[k];
            int n_col= j+delcol[k];
            if(n_row>=0 && n_row<board.length && n_col>=0 && n_col<board[0].length){
                dfs(root,n_row,n_col,board);
            }
        }

      board[i][j]= ch;
    }
    public void insert(String words , TrieNode root){
     TrieNode temp=root;
            

            for(char ch : words.toCharArray()){
                int ind= ch-'a';

                if(temp.arr[ind]==null){
                    temp.arr[ind]=new TrieNode();
                }
                temp=temp.arr[ind];
            }

            temp.word=words;



            
        }

}




