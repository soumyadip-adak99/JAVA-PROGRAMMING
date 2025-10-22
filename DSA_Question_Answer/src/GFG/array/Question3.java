package GFG.array;

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};
        reverse(arr);
        System.out.println("Reverse array: " + Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int str = 0;
        int end = arr.length - 1;

        while (str < end) {
            int temp = arr[str];
            arr[str++] = arr[end];
            arr[end--] = temp;
        }
    }
}
