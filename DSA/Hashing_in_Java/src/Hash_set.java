import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        int[] arr = { 8, 9, 4, 5, 6, 7 };

        for (int key : arr) {
            set.add(key);
        }

        for (int key : set) {
            if (set.contains(key))
                System.out.print(key + " ");
        }
        System.out.println();

        System.out.println(set);

        @SuppressWarnings("rawtypes")
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
