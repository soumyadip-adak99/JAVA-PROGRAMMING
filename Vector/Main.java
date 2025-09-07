package Vector;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        for (int i = 1; i <= 10; i++)
            vector.add(i);

        System.out.println(vector);
    }
}
