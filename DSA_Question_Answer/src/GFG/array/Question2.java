package GFG.array;

import java.util.Arrays;

public class Question2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        pushAllZeroEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void pushAllZeroEnd(int[] arr) {
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[idx] = arr[i];
                idx++;
            }
        }

        while (idx < arr.length) {
            arr[idx++] = 0;
        }
    }
}
