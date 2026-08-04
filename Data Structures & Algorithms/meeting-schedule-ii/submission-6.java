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
         if (intervals.size() == 0) {
            return 0;
        }

        // Sort by start time
        Collections.sort(intervals,
                (a, b) -> Integer.compare(a.start, b.start));

        // Min-heap of end times
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add first meeting
        pq.offer(intervals.get(0).end);

        // Process remaining meetings
        for (int i = 1; i < intervals.size(); i++) {
            // If a room is free, reuse it
            if (intervals.get(i).start >= pq.peek()) {
                pq.poll();
            }
            // Allocate room for current meeting
            pq.offer(intervals.get(i).end);
        }

        return pq.size();





    }
}
