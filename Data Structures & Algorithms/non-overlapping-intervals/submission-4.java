class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

       Arrays.sort(intervals, (a, b) -> {
    if (a[0] != b[0]) {
        return a[0] - b[0];
    } else {
        return a[1] - b[1];
    }
});


        int start=intervals[0][0];
        int end=intervals[0][1];
        int ans=0;

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<end){
                ans++;
              end= Math.min(intervals[i][1],end);

            }else{
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }

        return ans;

        
    }
}
