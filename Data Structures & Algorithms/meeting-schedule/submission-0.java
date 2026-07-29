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
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
        for(int i=1;i<intervals.size();i++){
            Interval temp=intervals.get(i-1);
            int start=temp.start;
            int end=temp.end;
            Interval temp2=intervals.get(i);
             int start2=temp2.start;
            int end2=temp2.end;
            if(end>start2) return false;
            
        }
        return true;

    }
}
