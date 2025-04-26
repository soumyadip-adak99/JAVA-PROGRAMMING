import java.util.HashMap;
import java.util.Map;

public class CountFoChar {
    public static void main(String[] args) {
        String str = "hello how are you";
        Map<Character, Integer> coutChar = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (coutChar.containsKey(ch)) {
                coutChar.put(ch, coutChar.get(ch) + 1);
            } else {
                coutChar.put(ch, 1);
            }
        }
    }
}
