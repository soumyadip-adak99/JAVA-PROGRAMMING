import java.util.Scanner;

public class fibonacciSerese {
    private static void calculateFinboSerise(int number) {

        int a = 0, b = 1, c;

        System.out.print("Fibonacci serise: ");

        for (int i = 1; i <= number; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String args[]) {
    }
}
