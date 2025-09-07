package stack;

import java.util.ArrayList;

public class PerenthisisMaching {
    ArrayList<Character> arr = new ArrayList<>();

    public void push(char val) {
        if (arr.size() == arr.size() - 1) {
            System.out.println("Stack is overflow.");
            return;
        }
        arr.add(val);
    }

    public char pop() {
        if (arr.size() == 0) {
            System.out.println("Stack is underflow.");
            return '\0';
        }
        char val = arr.remove(arr.size() - 1);
        return val;
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
                if (stack.arr.size() == 0) {
                    System.out.println("Stack is underflow.");
                    return false;
                }

                char popedChar = stack.pop();
                if (matching(popedChar, exp.charAt(i)) == false) {
                    return false;
                }
            }
        }

        if (stack.arr.size() == 0) {
            return true;
        } else {
            return false;
        }
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