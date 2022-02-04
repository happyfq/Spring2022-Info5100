import java.util.Arrays;
import java.util.PriorityQueue;
public class leetCode253 {
}
class Solution253 {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (int[] a, int[] b)->(a[0] - b[0]));
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b)-> a-b);
        heap.add(intervals[0][1]);
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] >= heap.peek()){
                heap.poll();
            }
            heap.add(intervals[i][1]);
        }
        return heap.size();
    }
}