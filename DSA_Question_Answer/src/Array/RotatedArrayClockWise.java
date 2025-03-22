package Array;

/*
Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer.
Do the mentioned change in the array in place.

Note: Consider the array as circular.
*/

public class RotatedArrayClockWise {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 5};
        rotatedArr(arr, 3);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    static void rotatedArr(int[] arr, int d) {
        int size = arr.length;
        d = d % size;

        reverse(arr, 0, d - 1);
        reverse(arr, d, size - 1);
        reverse(arr, 0, size - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
