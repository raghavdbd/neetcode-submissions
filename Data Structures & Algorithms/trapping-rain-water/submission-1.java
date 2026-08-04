class Solution {
    public int trap(int[] height) {

        int left[]= new int[height.length];
        int right[]= new int[height.length];
        left[0]= height[0];
        right[height.length-1]=height[height.length-1];


        for(int i=1;i<height.length;i++){

            left[i]= Math.max(left[i-1], height[i]);
            right[height.length-i-1]= Math.max(right[height.length-i], height[height.length-i-1]);

        }

        int ans=0;

        for(int i=0;i<height.length;i++){
            ans+= Math.min(left[i],right[i])- height[i];
        }
        return ans;
        
    }
}
