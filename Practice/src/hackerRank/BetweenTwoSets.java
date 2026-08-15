package hackerRank;

public class BetweenTwoSets {
    public static void main(String[] args) {
        int[] a = {2, 4};
        int[] b = {16, 32, 96};

        System.out.println(getTotalX(a, b));
    }

    public static int getTotalX(int[] a, int[] b) {

        int lcm = a[0];

        for (int i = 1; i < a.length; i++) {
            lcm = lcm(lcm, a[i]);
        }

        int gcd = b[0];

        for (int i = 1; i < b.length; i++) {
            gcd = gcd(gcd, b[i]);
        }

        int count = 0;

        for (int x = lcm; x <= gcd; x += lcm) {
            if (gcd % x == 0) {
                count++;
            }
        }

        return count;
    }

    static int gcd(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}
