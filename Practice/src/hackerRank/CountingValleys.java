package hackerRank;

public class CountingValleys {
    public static void main(String[] args) {
        int steps = 8;
        String path = "UDDDUDUU";
        int output = countingValleys(steps, path);
        System.out.println(output);
    }

    public static int countingValleys(int steps, String path) {
        int l = 0;
        int v = 0;

        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'U') {
                l++;
                if (l == 0)
                    v++;
            } else {
                l--;
            }
        }

        return v;
    }
}
