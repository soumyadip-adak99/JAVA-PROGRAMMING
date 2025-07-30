// reverse a array

package Interview.array;

import java.util.Arrays;

public class Question03 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7, 6 };

        reverse(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
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
