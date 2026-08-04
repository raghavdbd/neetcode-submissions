class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=0;
        for(int i=0;i<piles.length;i++){
            min=Math.min(min,piles[i]);
            max=Math.max(max,piles[i]);
        }
int ans=0;
        while(max>=min){
            int mid= (max+min)/2;

            if(func(piles,mid)<=h){
                ans=mid;
                max=mid-1;

            }else{
                min=mid+1;
            }


        }

        return ans;

        
        
    }
    public int func(int[] piles,int num){
        int sum=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]%num==0){
                sum+=piles[i]/num;
            }else{
                sum+=(piles[i]/num) +1;
            }
        }
        return sum;
    }
}
