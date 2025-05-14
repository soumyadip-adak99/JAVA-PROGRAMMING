package Practice;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class CountChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scan.nextLine();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            map.compute(word.charAt(i), (k, v) -> (v == null) ? 1 : v + 1);
        }

        System.out.println(map);
    }
}
