class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int start=0;
        int end=0;

        for(int i=0;i<weights.length;i++){
            end+=weights[i];
            start = Math.max(start,weights[i]);


        }
        int ans=end;

        while(start<=end){
            int mid = (start+end)/2;

            if(possible(mid,weights,days )){
                ans=mid;
                end=mid-1;
            }else{
                start= mid+1;
            }
        }
        return ans;

        
    }

    public boolean possible(int mid, int[] weight, int days){
        int sum=0;
        int count=0;

        int i=0;

        while(i<weight.length){
            if(sum + weight[i]>mid){
                count++;
                sum= 0;

            }
                sum += weight[i];
            
            i++;
        }
        count++;

        if(count<= days){
            return true;
        }
        return false;

       
    }
}