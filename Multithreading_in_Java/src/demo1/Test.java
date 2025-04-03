package demo1;

import java.lang.Thread;

public class Test {
    public static void main(String[] args) {
        System.out.println("Current Thread name: " + Thread.currentThread());

        new World();
//
//        for (int i = 0; i <= 5; i++) {
//            try {
//                System.out.println("Task/Tread: " + i);
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                System.out.println("Error: " + e);
//            }
//        }

        System.out.println("Thread execution complete.");
    }
}
