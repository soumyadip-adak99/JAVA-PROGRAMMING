package stack.questions;

import stack.implementation.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        String str = "hello";

        for(char ch : str.toCharArray()) {
            stack.push(ch);
        }

        stack.display();
    }
}