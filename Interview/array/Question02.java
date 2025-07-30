// move all zero at the end

package Interview.array;

import java.util.Arrays;

public class Question02 {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 3, 4, 0, 4, 0, 5 };

        moveZeroAtEnd(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void moveZeroAtEnd(int[] arr) {
        if (arr.length < 1) {
            return;
        }

        int idx = 0;

        for (int n : arr) {
            if (n != 0) {
                arr[idx] = n;
                idx++;
            }
        }

        while (idx < arr.length) {
            arr[idx] = 0;
            idx++;
        }
    }
}
