package codeLogic;

public class Question3 {
    public static void main(String[] args) {
        int x = 121;
        String original = String.valueOf(x);
        StringBuilder rev = new StringBuilder(original).reverse();
        System.out.println(original.contentEquals(rev) ? "Number is palindrome" : "Number is not palindrome");
    }
}

// Question-> https://www.masterji.co/problems/checking-for-palindrome-numbers?otab=1&mtab=0
