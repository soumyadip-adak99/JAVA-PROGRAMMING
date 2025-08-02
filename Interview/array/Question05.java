// next permutation
package Interview.array;

import java.util.Arrays;

public class Question05 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void nextPermutation(int[] arr) {
        int pivot = -1, n = arr.length;

        // step 1: find pivot element
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        // if no pivot found, reverse the entire array
        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // step 2: find the next largest element after pivot
        for (int i = n - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                swap(arr, i, pivot);
                break;
            }
        }

        // step 3: reverse the suffix
        reverse(arr, pivot + 1, n - 1);
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i++, j--);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
