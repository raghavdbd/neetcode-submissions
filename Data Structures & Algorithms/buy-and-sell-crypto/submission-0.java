class Solution {
    public int maxProfit(int[] prices) {
    int Sell=0;
    int maxp=0;
    int buy=prices[0];
    for(int i=0;i<prices.length;i++){

        if(prices[i]>buy){
            maxp=Math.max(maxp,prices[i]-buy);
        }else if(prices[i]<buy){
            buy=prices[i];
        }
    }
    return maxp;
        
    }
}
