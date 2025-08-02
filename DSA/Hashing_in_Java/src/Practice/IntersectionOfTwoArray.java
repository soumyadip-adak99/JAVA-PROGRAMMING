package Practice;

import java.util.HashSet;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] array1 = { 7, 3, 9 };
        int[] array2 = { 6, 3, 9, 2, 9, 4 };

        System.out.println("Total repeted number: " + intersection(array1, array2));
    }

    public static int intersection(int[] array1, int[] array2) {
        //step 1: create a hash-set
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        //step 2: insert all array 1 elements in the set
        for (int num : array1) {
            set.add(num);
        }

        //step 3: run a loop on an array 2
        for (int num : array2) {
            //step 4: if the num is contains in the set then 
            if (set.contains(num)) {
                //step 5: increase the count + 1
                count++;

                //step 6: remove the element from the set
                set.remove(num);
            }
        }

        return count;
    }
}
