public class trieNode{
    boolean is_end;
    trieNode arr[];
    public trieNode(){
        this.is_end=false;
        arr=new trieNode[26];
    }
}


class PrefixTree {
    trieNode root;




    public PrefixTree() {
        root=new trieNode();
         
    }

    public void insert(String word) {

        trieNode crawl= root;

        for(char ch: word.toCharArray()){
            int index= ch-'a';

            if(crawl.arr[index]==null){
                crawl.arr[index]=new trieNode();
            }
            crawl=crawl.arr[index];
        }
        crawl.is_end=true;

    }

    public boolean search(String word) {

       trieNode crawl= root;
       for(char ch: word.toCharArray()){

        int index= ch-'a';
        if(crawl.arr[index]==null){

            return false;
        }
        crawl=crawl.arr[index];


       }

       return crawl.is_end;



    }

    public boolean startsWith(String prefix) {
        trieNode crawl= root;
        for(char ch: prefix.toCharArray()){
            int index= ch-'a';
        if(crawl.arr[index]==null){

            return false;
        }
        crawl=crawl.arr[index];
        
        
        
        }
        return true;


    }
}
