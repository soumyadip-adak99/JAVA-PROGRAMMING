package GFG.array;

public class Question8 {
    public static void main(String[] args) {
        System.out.println(maximumProfit(new int[]{7, 10, 1, 3, 6, 9, 2}));
    }

    public static int maximumProfit(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int minPrice = arr[0];
        int maxProfit = 0;

        for (int price : arr) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                if (price > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}
