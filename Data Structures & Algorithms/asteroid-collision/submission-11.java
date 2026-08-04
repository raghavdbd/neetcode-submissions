class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>s1=new Stack<>();

        for(int i=0;i<asteroids.length;i++){
            if(s1.size()==0){
                s1.push(asteroids[i]);
                
            }else if(s1.peek()<0 && asteroids[i]>0){
                // if(Math.abs(s1.peek())<asteroids[i]){
                //    s1.pop();
                //    s1.push(asteroids[i]);
                    
                // }else if(Math.abs(s1.peek())==asteroids[i]){
                //     s1.pop();
                s1.push(asteroids[i]);
                
            }else if(s1.peek()>0 && asteroids[i]<0){

                while(s1.size()>0 && s1.peek()>0 && s1.peek()<Math.abs(asteroids[i])){
                    s1.pop();
                }
                if( s1.size() >0 && s1.peek()>0 &&  s1.peek()==Math.abs(asteroids[i])){
                    s1.pop();

                }
                else if(s1.size()==0 || s1.peek()<0 ){
                    s1.push(asteroids[i]);
                }
                
                


                


                
                 

            }else{
                s1.push(asteroids[i]);
            }
        }
        int ans[]=new int[s1.size()];
        int i=s1.size()-1;
        while(!s1.isEmpty()){
            ans[i]=s1.pop();
            i--;

        }
        return ans;
        
    }
}