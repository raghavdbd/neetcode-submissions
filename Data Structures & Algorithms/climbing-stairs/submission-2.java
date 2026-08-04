class Solution {
    public int climbStairs(int n) {
        int arr[]=new int[n+1];
        Arrays.fill(arr,-1);
        dp(n,arr);
        
        return arr[n];
        

    }
    public int dp(int n, int arr[]){

        if(n==0){
            return 1;
        }
        if(arr[n]!=-1){
            return arr[n];
        }
        int a= dp(n-1,arr);
        int b=0;
        if(n-2>=0){
            b=dp(n-2,arr);
        }

        return arr[n]=a+b;
    }
}
