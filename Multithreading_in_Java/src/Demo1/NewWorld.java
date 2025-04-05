package Demo1;


// implementing runnable interface

public class NewWorld implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++ ) {
            System.out.println("New World");
        }
    }
}
