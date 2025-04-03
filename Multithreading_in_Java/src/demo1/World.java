package demo1;

public class World extends Thread {

    World() {
        Thread n = new Thread(this);
        n.start();
    }

    @Override
    public void run() {
        for (; ; ) {
            System.out.println("world");
        }
    }

}
