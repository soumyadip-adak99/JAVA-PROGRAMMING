package Queue;

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class Queue_using_java_collectionFramWork {
    public static void implementUisngLinkedList() {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("Pop element-> " + q.remove());
        q.remove();

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

    public static void implementUisngArray() {
        Queue<Integer> q = new ArrayDeque<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.remove();

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

    public static void main(String[] args) {
        System.out.println("Queue usiing linkedlist.");
        implementUisngLinkedList();

        System.out.println("Queue using array.");
        implementUisngArray();

    }
}
