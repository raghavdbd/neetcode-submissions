class Solution {
    public class interval{
        int start;
        int end;
        public interval(int start, int end){
            this.start=start;
            this.end=end;
        }
    }
    public int eraseOverlapIntervals(int[][] intervals) {

        interval arr[]=new interval[intervals.length];
        for(int i=0;i<intervals.length;i++){
            arr[i]=new interval(intervals[i][0],intervals[i][1]);
        }
       Arrays.sort(arr, (s1, s2) ->  Integer.compare(s1.end, s2.end));
    
    
        int count=1;
        int last=arr[0].end;

        for(int i=1;i<intervals.length;i++){
            if(arr[i].start>=last){
                count++;
                last=arr[i].end;
            }
        }
       return intervals.length-count;
        
    }
}
