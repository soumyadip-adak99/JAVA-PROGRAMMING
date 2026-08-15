package hackerRank;

import java.util.Arrays;

public class BreakingTheRecords {
    public static void main(String[] args) {
        int[] a = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        System.out.println(Arrays.toString(breakingRecords(a)));
    }

    static int[] breakingRecords(int[] scores) {
        int max = scores[0];
        int min = scores[0];

        int maxCount = 0;
        int minCount = 0;

        for (int i = 1; i < scores.length; i++) {
            int score = scores[i];

            if (score > max) {
                max = score;
                maxCount++;
            }

            if (score < min) {
                min = score;
                minCount++;
            }
        }

        return new int[]{maxCount, minCount};
    }
}
