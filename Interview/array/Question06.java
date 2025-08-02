package Interview.array;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class Question06 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};
        System.out.println(findMajorityElement(arr));
    }

    static ArrayList<Integer> findMajorityElement(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
		ArrayList<Integer> result = new ArrayList<>();
		int n = arr.length;
		
		for(int num : arr) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			} else {
				map.put(num, 1);
			}
		}
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			if(entry.getValue() > n / 3) {
				result.add(entry.getKey());
			}
		}
		
		Collections.sort(result);
		return result;
    }
}

