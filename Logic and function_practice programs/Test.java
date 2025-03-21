public class Test {
    public static void main(String[] args) {
        int n = 121;
        int original = n;
        int palindrome = 0;

        while (n > 0) {
            int r = n % 10;
            palindrome = palindrome * 10 + r;
            n /= 10;
        }

        if (original == palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not");
        }
    }
}
