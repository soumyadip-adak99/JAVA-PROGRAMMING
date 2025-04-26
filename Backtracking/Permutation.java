import java.util.List;
import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(permutation(str));
    }

    public static List<String> permutation(String str) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", str);
        return result;
    }

    public static void backtrack(List<String> result, String temp, String str) {
        if (str.isEmpty()) {
            result.add(temp);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            backtrack(result, temp + currentChar, newString);
        }
    }
}
