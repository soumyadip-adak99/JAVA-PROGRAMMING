package SlidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeNumberEveryWindow {
    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;
        System.out.println(firstNegativeInt(arr, k));
    }

    public static List<Integer> firstNegativeInt(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int i = 0, j = 0;

        while (j < arr.length) {
            if (arr[j] < 0) {
                queue.add(arr[j]);
            }

            if ((j - i + 1) < k) {
                j++;
            } else if ((j - i + 1) == k) {
                if (queue.isEmpty()) {
                    result.add(0);
                } else {
                    result.add(queue.peek());
                }

                if (!queue.isEmpty() && arr[i] == queue.peek()) {
                    queue.poll();
                }
                i++;
                j++;
            }
        }
        return result;
    }
}
