package codeLogic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(towSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] towSum(int[] nums, int target) {
        // create a hashMap
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }
        return new int[0];
    }
}


// question-> https://www.masterji.co/problems/two-sum?otab=0&mtab=0