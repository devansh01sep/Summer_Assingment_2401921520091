package Week_3.Day_4;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperature {

    public int[] dailyTemperatures(int[] temperatures) {
        Deque<int[]> stack = new ArrayDeque<>();
        int n = temperatures.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int temp = temperatures[i];

            while (!stack.isEmpty() && temp > stack.peek()[0]) {
                int[] arr = stack.pop();
                result[arr[1]] = i - arr[1];
            }

            stack.push(new int[]{temp, i});
        }

        return result;
    }
}
