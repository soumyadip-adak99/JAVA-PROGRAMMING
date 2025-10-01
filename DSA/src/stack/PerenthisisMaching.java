package stack;

import java.util.ArrayList;

public class PerenthisisMaching {
    ArrayList<Character> arr = new ArrayList<>();

    public void push(char val) {
        arr.add(val);
    }

    public char pop() {
        if (arr.isEmpty()) {
            System.out.println("Stack is underflow.");
            return '\0';
        }
        return arr.removeLast();
    }

    public static boolean matching(char open, char close) {
        if ((open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']')) {
            return true;
        }
        return false;
    }

    public static boolean PerenthisisMaching_fun(String exp) {
        PerenthisisMaching stack = new PerenthisisMaching();

        for (int i = 0; i < exp.length(); i++) {
            if ((exp.charAt(i) == '(') || (exp.charAt(i) == '{') || (exp.charAt(i) == '[')) {
                stack.push(exp.charAt(i));
            } else if ((exp.charAt(i) == ')') || (exp.charAt(i) == '}') || (exp.charAt(i) == ']')) {
                if (stack.arr.isEmpty()) {
                    System.out.println("Stack is underflow.");
                    return false;
                }

                char popedChar = stack.pop();
                if (!matching(popedChar, exp.charAt(i))) {
                    return false;
                }
            }
        }

        return stack.arr.isEmpty();
    }

    public static void main(String[] args) {

        String exp = "{a+b}*[(8-1)+(8-1)]";

        if (PerenthisisMaching_fun(exp)) {
            System.out.println("Perenthisis is maching.");
        } else {
            System.out.println("Perenthisis is not maching.");
        }
    }
}