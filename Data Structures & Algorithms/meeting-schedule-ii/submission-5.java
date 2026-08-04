/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals.size()==0){
            return 0;
        }

        Collections.sort(intervals,(a,b)->{
            
                return a.end-b.end;
            

        });


        int startm=intervals.get(0).start;
        int endm=intervals.get(0).end;
        int count=1;
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.offer(endm);


        for(int i=1;i<intervals.size();i++){
            if(pq.size()>0 && pq.peek()<=intervals.get(i).start){
                    pq.poll();
                }
            if(intervals.get(i).start<endm){
                
                
                endm=Math.min(endm,intervals.get(i).end);
               

            }else{
          
                startm=intervals.get(i).start;
                endm=intervals.get(i).end;

            }
            pq.offer(endm);
            count= Math.max(count,pq.size());
        }

        return  count;





    }
}
