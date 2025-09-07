package LinkedList.Practice_Question.src;

import java.util.LinkedList;
import java.util.Arrays;

public class LLData_arr {

    public static LinkedList<int[]> list = new LinkedList<>();

    public static void addAtFirst(int[] data) {
        list.addFirst(data);
    }

    public static void addAtMid(int[] data) {
        if (list.isEmpty()) {
            list.add(data);
            return;
        }

        int mid = list.size() / 2;
        list.add(mid, data);
    }

    public static void addAtLast(int[] data) {
        list.addLast(data);
    }

    public static void deleteAtFirst() {
        if (list.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        list.removeFirst();
    }

    public static void deleteAtMid() {
        if (!list.isEmpty()) {
            int mid = list.size() / 2;
            list.remove(mid);
            return;
        }
        System.out.println("List is empty.");

    }

    public static void deleteAtLast() {
        if (list.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        list.removeLast();
    }

    public static void printLL() {
        if (list.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        for (int[] arr : list)
            System.out.print(Arrays.toString(arr) + "-->");
    }

    public static void main(String[] args) {
        int[] a = { 10, 20, 30 };
        int[] b = { 40, 50, 60 };
        int[] c = { 70, 80, 90 };

        addAtFirst(a);
        addAtLast(b);
        addAtMid(c);

        printLL();
    }
}
