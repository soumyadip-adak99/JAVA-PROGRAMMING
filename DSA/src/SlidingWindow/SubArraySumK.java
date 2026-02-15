package SlidingWindow;

// https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
public class SubArraySumK {
    public static void main(String[] args) {
        // example - 1
        int[] arr = {100, 200, 300, 400};
        System.out.println(subArraySum(arr, 2));

        // example - 2
        int[] arr2 = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        System.out.println(subArraySum(arr2, 4));

        // example - 2
        int[] arr3 = {100, 200, 300, 400};
        System.out.println(subArraySum(arr3, 1));
    }

    static int subArraySum(int[] arr, int k) {
        int i = 0, j = 0;
        int sum = 0, max = Integer.MIN_VALUE;

        while (j < arr.length) {
            sum += arr[j];

            if ((j - i + 1) < k) {
                j++;
            } else if ((j - i + 1) == k) {
                max = Math.max(max, sum);
                sum -= arr[i];
                i++;
                j++;
            }
        }

        return max;
    }
}
