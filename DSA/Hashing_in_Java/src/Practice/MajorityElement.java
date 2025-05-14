package Practice;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };

        System.out.println(majorityElement(arr));
    }

    public static List<Integer> majorityElement(int[] arr) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for (int i : arr) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > n / 3)
                result.add(key);
        }

        return result;
    }
}
