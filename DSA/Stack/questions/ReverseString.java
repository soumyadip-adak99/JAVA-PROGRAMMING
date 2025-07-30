package questions;

import implementation.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        String str = "hello";

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        stack.display();
    }
}