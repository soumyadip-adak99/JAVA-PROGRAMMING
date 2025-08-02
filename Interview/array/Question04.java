// roted array
package Interview.array;

import java.util.Arrays;

public class Question04 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7, 6 };
        int d = 3;

        rotatedArr(arr, d);

        System.out.println(Arrays.toString(arr));
    }

    static void rotatedArr(int[] arr, int d) {
        int n = arr.length;

        d = d % n;

        // step 1: full array reverse
        reverse(arr, 0, n - 1);

        // step 2: reverse 0 -> d-1
        reverse(arr, 0, d - 1);

        // step 3: reverse d -> array size
        reverse(arr, d, n - 1);
    }

    static void reverse(int[] arr, int strIdx, int endIdx) {
        while (strIdx < endIdx) {
            int temp = arr[strIdx];
            arr[strIdx] = arr[endIdx];
            arr[endIdx] = temp;
            strIdx++;
            endIdx--;
        }
    }
}
