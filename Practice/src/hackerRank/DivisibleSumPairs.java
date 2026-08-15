package hackerRank;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 1, 2};
        int n = arr.length;
        int k = 3;
        System.out.println(divisibleSumPairs(arr, n, k));
    }


    public static int divisibleSumPairs(int[] arr, int n, int k) {
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[i] + arr[j]) % k == 0)
                    count++;
            }
        }

        return count;
    }
}
