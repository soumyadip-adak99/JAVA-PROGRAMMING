package Practice;

import java.util.Set;
import java.util.HashSet;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = { 7, 3, 9 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };

        System.out.println(union(arr1, arr2));
    }

    public static int union(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        // insert all elements of arr1
        for (int num : arr1) {
            set.add(num);
        }

        // insert all elements of arr2
        for (int num : arr2) {
            set.add(num);
        }

        System.out.println(set);

        return set.size();
    }
}
