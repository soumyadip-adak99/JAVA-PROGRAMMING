package codeLogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Question1 {
    private static final Map<Character, String> PHONE_MAP = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
    );

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return result;
        }

        backtrack(result, new StringBuilder(), digits, 0);
        return result;
    }

    private static void backtrack(List<String> result, StringBuilder current, String digits, int index) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = PHONE_MAP.get(digits.charAt(index));

        for (char c : letters.toCharArray()) {
            current.append(c);
            backtrack(result, current, digits, index + 1);
            current.deleteCharAt(current.length() - 1);
        }
    }


    public static void main(String[] args) {
        System.out.println(letterCombinations("24"));
    }
}


// Question: - > https://www.masterji.co/problems/phone-letter-combinations?otab=0&mtab=0
