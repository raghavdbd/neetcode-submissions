public class pair{
    int val;
    int ind;
    public pair(int val, int ind){
        this.val=val;
        this.ind= ind;
    }
}

class Solution {
    public int[] dailyTemperatures(int[] temp) {

        int n = temp.length;
        int ans[]= new int[n];

        int j=temp.length-1;

        Stack<pair>st= new Stack<>();


        while(j>=0){

            if(st.isEmpty()){
                ans[j]=0;
                st.push(new pair(temp[j],j));


            }else if(st.peek().val>temp[j]){
                ans[j]= st.peek().ind-j;
                 st.push(new pair(temp[j],j));
            }else{

                while(st.size()>0 && st.peek().val<=temp[j]){
                    st.pop();
                }

                if(st.size()==0){
                    ans[j]=0;
                }else{
                      ans[j]= st.peek().ind-j;
                }

                st.push(new pair(temp[j],j));



            }
            j--;

        }

        return ans;
        
    }
}
