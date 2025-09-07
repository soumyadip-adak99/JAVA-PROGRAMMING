package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add elements
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);

        // get elements
        int elemment = list.get(0);
        System.out.println(elemment);

        // add eliment in between
        list.add(1, 3);
        System.out.println(list);

        // set element / change element
        list.set(3, 4);
        System.out.println(list);

        // delete element
        list.remove(3);
        System.out.println(list);

        // size
        int size = list.size();
        System.out.println(size);

        // loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // sort
        Collections.sort(list);
        System.out.println(list);
    }
}
