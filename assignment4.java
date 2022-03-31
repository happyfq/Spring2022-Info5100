import java.util.LinkedList;
import java.util.Queue;

public class assignment4 {
    public class currentQueue<T> {
        Queue<T> que;
        public Object objLock = new Object();

        public currentQueue() {
            que = new LinkedList<>();
        }

        public void add(T data) {
            synchronized (objLock) {
                que.add(data);
            }
        }

        public void remove(T data) {
            synchronized (objLock) {
                que.remove(data);
            }
        }

        public void peek() {
            synchronized (objLock) {
                que.peek();
            }
        }

        public boolean isEmpty() {
            synchronized (objLock) {
                return que.isEmpty();
            }
        }
    }
}
