package GFG.array;

import java.util.Arrays;

public class Question9 {
    public static void main(String[] args) {
        System.out.println(getMinDiff(new int[]{1, 5, 8, 10}, 2));
    }


    public static int getMinDiff(int[] arr, int k) {
        int n = arr.length;

        if (n == 1) return 0;

        Arrays.sort(arr);

        int answer = arr[n - 1] - arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0) continue;

            int min = Math.min(arr[0] + k, arr[i] - k);
            int max = Math.max(arr[n - 1] - k, arr[i - 1] + k);

            answer = Math.min(answer, max - min);
        }

        return answer;
    }
}

// question-> https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/minimize-the-heights3351