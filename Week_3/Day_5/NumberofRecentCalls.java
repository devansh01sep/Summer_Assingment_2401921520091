package Week_3.Day_5;

import java.util.ArrayDeque;

public class NumberofRecentCalls {

    private ArrayDeque<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        queue.add(t);

        while (t - 3000 > queue.peekFirst()) {
            queue.removeFirst();
        }

        return queue.size();
    }
}
