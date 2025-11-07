package GFG.array;

public class Question7 {
    public static void main(String[] args) {
        int[] prices = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(maximumProfit(prices));
    }

    public static int maximumProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 0; i < prices.length - 1; i++)
            if (prices[i + 1] > prices[i])
                maxProfit += prices[i + 1] - prices[i];

        return maxProfit;
    }
}

// question -> https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/stock-buy-and-sell2615