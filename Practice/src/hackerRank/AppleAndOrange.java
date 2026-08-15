// https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true
package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {
    public static void main(String[] args) {
        // is the starting point
        int s = 7;

        // is the ending point
        int t = 11;

        // apple tree point
        int a = 5;

        // orange tree point
        int b = 15;

        // apples
        List<Integer> apples = new ArrayList<>();
        apples.add(-2);
        apples.add(2);
        apples.add(1);

        // oranges
        List<Integer> oranges = new ArrayList<>();
        oranges.add(5);
        oranges.add(-6);

        countOfApplesAndOranges(s, t, a, b, apples, oranges);
    }

    static void countOfApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        long countOfApple = 0;
        long countOfOrange = 0;

        for (int apple : apples) {
            int pos = a + apple;

            if (pos >= s && pos <= t) {
                countOfApple++;
            }
        }

        for (int orange : oranges) {
            int pos = b + orange;

            if (pos >= s && pos <= t) {
                countOfOrange++;
            }
        }

        System.out.println(countOfApple);
        System.out.println(countOfOrange);
    }
}
