package hackerRank;

public class SalesByMatch {
    public static void main(String[] args) {
        System.out.println(sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
    }

    public static int sockMerchant(int n, int[] ar) {
        int pairs = 0;

        for (int i = 0; i < n - 1; i++) {
            int count = 0;

            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    count++;
                }
            }

            pairs += count / 2;
        }
        return pairs;
    }
}
