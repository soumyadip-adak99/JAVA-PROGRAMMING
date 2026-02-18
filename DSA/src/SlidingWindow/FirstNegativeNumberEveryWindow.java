package SlidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// question-> https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
public class FirstNegativeNumberEveryWindow {
    public static void main(String[] args) {
        // example 1
        int[] arr = {-8, 2, 3, -6, 10};
        System.out.println(firstNegativeInt(arr, 2));

        // example 2
        int[] arr1 = {12, -1, -7, 8, -15, 30, 16, 28};
        System.out.println(firstNegativeInt(arr1, 3));

        // example 3
        int[] arr2 = {12, 1, 3, 5};
        System.out.println(firstNegativeInt(arr2, 3));

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
