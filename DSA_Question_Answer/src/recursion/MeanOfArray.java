package recursion;

import java.util.Arrays;

public class MeanOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println((int) findMean(arr));
    }

    public static double findMean(int[] arr) {
        int n = arr.length;

        if (n == 1) {
            return arr[0];
        }

        /**
         *  formula :
         *  (a, n) = mean(a,n-1) * (n-1) + a[n-1] / n
         */

        return (findMean(Arrays.copyOf(arr, n - 1)) * (n - 1) + arr[n - 1]) / n;
    }
}
