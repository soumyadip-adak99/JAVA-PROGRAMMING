package Demo2;

public class MyThread extends Thread {

    @Override
    public void run() {

    }

    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();

        System.out.println(thread.getState()); // NEW

        thread.start();
        System.out.println(thread.getState()); // RUNNABLE

        Thread.sleep(100);

        System.out.println(Thread.currentThread().getName()); // CURRENT THREAD
    }
}
