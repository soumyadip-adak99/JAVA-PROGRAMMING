package stack;

import java.util.Scanner;


public class reverseStringStack {

    static class Stack {
        char[] arr;
        int top;

        public Stack(int size) {
            this.arr = new char[size];
            this.top = -1;
        }

        public void push(char ch) {
            if (top == arr.length - 1) {
                System.out.println("Stack overflow " + ch + " can't push.");
            } else {
                arr[++top] = ch;
            }
        }

        public char pop() {
            if (top == -1) {
                System.out.println("\nStack underflow");
                return '\0';
            } else {
                return arr[top--];
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        Stack stack = new Stack(20);

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        System.out.print("Reverse string: ");
        while (stack.top != -1) {
            char ch = stack.pop();
            System.out.print(ch);
        }

        scan.close();
    }
}