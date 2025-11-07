package GFG.array;

public class Question10 {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(maxSubarraySum(arr));
    }

    static int maxSubarraySum(int[] arr) {
        int maxValue = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxValue = Math.max(arr[i], maxValue + arr[i]);
            result = Math.max(result, maxValue);
        }

        return result;
    }
}

// Question : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/kadanes-algorithm-1587115620