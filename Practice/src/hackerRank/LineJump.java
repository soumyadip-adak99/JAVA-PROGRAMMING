// https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=true

package hackerRank;

public class LineJump {
    public static void main(String[] args) {
        int x1 = 0, x2 = 3, v1 = 4, v2 = 2;
        System.out.println(kangaroo(x1, x2, v1, v2));
    }


    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 > v2 && (x2 - x1) % (v1 - v2) == 0) {
            return "YES";
        }

        return "NO";
    }
}
