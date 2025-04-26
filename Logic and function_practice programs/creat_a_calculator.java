import java.util.Scanner;

public class creat_a_calculator {

    private static Scanner scan;

    public creat_a_calculator() {
        Scanner scan = new Scanner(System.in);
    }

    public static void addition(Scanner scan) {

        System.out.print("Enter first numner:- ");
        double num1 = scan.nextDouble();
        System.out.print("Enter second number:- ");
        double num2 = scan.nextDouble();

        double sum = num1 + num2;

        System.out.println("Answer:- " + sum + "\n");
    }

    public static void subtraction(Scanner scan) {

        System.out.print("Enter first number:- ");
        double num1 = scan.nextDouble();
        System.out.print("Enter second number:- ");
        double num2 = scan.nextDouble();

        double total = num1 + num2;

        System.out.println("Answer:- " + total + "\n");
    }

    public static void multiplication(Scanner scan) {

        System.out.print("Enter first number:- ");
        double num1 = scan.nextDouble();
        System.out.print("Enter second number:- ");
        double num2 = scan.nextDouble();

        double total = num1 + num2;

        System.out.println("Answer:- " + total + "\n");
    }

    public static void division(Scanner scan) {

        System.out.print("Enter first number:- ");
        double num1 = scan.nextDouble();
        System.out.print("Ente second number:- ");
        double num2 = scan.nextDouble();

        if (num2 == 0) {
            System.out.println("Erro: 0 can't divided any number.");
        } else {
            System.out.println("Answer:- " + (num1 / num2) + "\n");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\n-:Calculator:-");
        System.out.println("\n1. Addition.");
        System.out.println("2. Subtraction.");
        System.out.println("3. Multiplication.");
        System.out.println("4. Division");
        System.out.print("\nEnter your choice:- ");
        int choice = scan.nextInt();
        System.out.println(" ");

        switch (choice) {
            case 1:
                creat_a_calculator.addition(scan);
                break;
            case 2:
                creat_a_calculator.subtraction(scan);
                break;
            case 3:
                creat_a_calculator.multiplication(scan);
                break;
            case 4:
                creat_a_calculator.division(scan);
                break;
            default:
                System.out.println("Erro! please select appropreate option.\n");
        }
        scan.close();
    }
}
