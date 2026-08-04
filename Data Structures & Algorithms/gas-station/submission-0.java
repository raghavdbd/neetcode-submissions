class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int i=0;
        
        int ans=-1;

        while(i<gas.length){
            int gascount=0;
            int j=i;
            int count=0;
            while(j<gas.length){
                
                gascount+=gas[j];
                gascount -= cost[j];
                if(gascount<0){
                    
                    break;
                }
                j=(j+1)%gas.length;
                count++;
                if(count==gas.length){
                    return i;
                }



            }
            i++;
        }

return ans;
        
    }
}
