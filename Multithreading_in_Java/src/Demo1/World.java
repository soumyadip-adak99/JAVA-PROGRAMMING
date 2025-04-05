package Demo1;

// extends thread class

public class World extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++ ) {
            System.out.println("world");
        }
    }

}
