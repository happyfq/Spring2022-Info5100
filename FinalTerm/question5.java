package FinalTerm;
import java.util.PriorityQueue;

public class question5 {
    public int findKthLargest(int[] nums, int k) {
        if (nums.length == 0) return 0;
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            que.add(nums[i]);
            if (que.size() > k) {
                que.poll();
            }
        }
        return que.poll();
    }
}
