class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer>s1=new Stack<>();

    

        for(int i=0;i<arr.length;i++){
            if(s1.size()==0 ){
                s1.push(arr[i]);
            }else if(s1.peek()>0 && arr[i]>0){
                s1.push(arr[i]);
            }else if(s1.peek()>0 && arr[i]<0){
                
                while(s1.size()>0){
                    if(s1.peek()<0){
                        s1.push(arr[i]);
                        break;
                    }
                    if(s1.peek()<-arr[i]){
                        s1.pop();
                        if(s1.size()==0){
                            s1.push(arr[i]);
                            break;
                        }
                    }else if(s1.peek()==-arr[i]){
                        s1.pop();
                        break;
                    }else if(s1.peek()>-arr[i]){
                        break;
                    }
                }
                 
            }else if(s1.peek()<0){
                    s1.push(arr[i]);
                }
        }
        int ans[]=new int[s1.size()];
        int n=s1.size();
        for(int i=0;i<n;i++){
            ans[n-i-1]=s1.pop();
        }
        return ans;
        
    }
}