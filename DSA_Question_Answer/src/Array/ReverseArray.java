package Array;


/*
You are given an array of integers arr[]. Your task is to reverse the given array.
Note: Modify the array in place.
Examples:
Input: arr = [1, 4, 3, 2, 6, 5]
Output: [5, 6, 2, 3, 4, 1]
Explanation: The elements of the array are 1 4 3 2 6 5. After reversing the array,
the first element goes to the last position, the second element goes to the second last position and so on. Hence,
the answer is 5 6 2 3 4 1.
*/


public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1, 5};
        reverse(arr);

        for (int key : arr) {
            System.out.print(key + " ");
        }
    }

    static void reverse(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;

        for (int i = arr.length - 1; i >= 0; i--) {  // true -> i >= 0 and i != 0
            temp[index++] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}
