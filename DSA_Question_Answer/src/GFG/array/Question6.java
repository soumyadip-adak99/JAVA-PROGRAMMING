package GFG.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Question6 {
    public static void main(String[] args) {
        System.out.println(findMajorityElement(new int[]{2, 2, 3, 1, 3, 2, 1, 1}));
    }

    static ArrayList<Integer> findMajorityElement(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int key : arr) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }


        for (int num : map.keySet()) {
            if (map.get(num) > (arr.length / 3)) {
                result.add(num);
            }
        }

        Collections.sort(result);

        return result;
    }
}
