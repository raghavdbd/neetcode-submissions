

class Solution {
public class pair {
    int temp;
    int day;

    public pair(int temp, int day) {
        this.temp = temp;
        this.day = day;
    }
}
    
    
    public int[] dailyTemperatures(int[] arr) {
        Stack<pair>s1=new Stack<>();
        int ans[]=new int[arr.length];
        int i=arr.length-1;
        while(i>=0){
            if(s1.isEmpty()){
                s1.push(new pair(arr[i],i));
                ans[i]=0;
                i--;
            }else if(s1.peek().temp>arr[i]){
                ans[i]=s1.peek().day-i;
                 s1.push(new pair(arr[i],i));
                 i--;

            }else {
                while(!s1.isEmpty() && s1.peek().temp<=arr[i]){
                    s1.pop();
                }
                if(s1.isEmpty()){
                    ans[i]=0;
                }else{
                    ans[i]=s1.peek().day-i;

                }
                s1.push(new pair(arr[i],i));

                i--;
            }
        }
        return ans;
        
    }
}
