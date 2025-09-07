package LinkedList.Practice_Question.src;

import java.util.Arrays;
import java.util.LinkedList;

// using java collection frame work
class Linked_List {
    private LinkedList<int[][]> list = new LinkedList<>();

    public void addAtFirst(int[][] data) { // add first
        list.addFirst(data);
    }

    public void addAtMid(int[][] data) { // add mid
        if (list.isEmpty()) {
            list.add(data);
        }

        int mid = list.size() / 2;
        list.add(mid, data);
    }

    public void addAtLast(int[][] data) { // add first
        list.addLast(data);
    }

    public void deleteAtFirst() { // delete at first
        if (list.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        list.remove();
    }

    public void deleteAtMid() { // delete at mid
        if (list.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        int mid = list.size() / 2;
        list.remove(mid);
    }

    public void deleteAtLast() { // delete at last
        if (list.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        list.removeLast();
    }

    public void printLL() { // printlist
        if (list.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        for (int[][] data : list) {
            System.out.print(Arrays.deepToString(data) + "->");
        }
        System.out.print("NULL");
    }
}

// Using Normal
class Node {
    int[][] data;
    Node next;

    Node(int[][] data, int row, int col) {
        this.data = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                this.data[i][j] = data[i][j];
            }
        }

        this.next = null;
    }
}

public class TowDarrayLL {
    public static Node head = null;
    public static int row, col;
    public static int size = 0;

    TowDarrayLL(int r, int c) {
        row = r;
        col = c;
    }

    public static void addFirst(int[][] data) { // add first
        Node newNode = new Node(data, row, col);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    public static void addMid(int[][] data) { // add mid
        Node newNode = new Node(data, row, col);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        if (size == 1) {
            head.next = newNode;
            size++;
            return;
        }

        int mid = size / 2;
        Node currNode = head;

        for (int i = 0; i < mid - 1; i++)
            currNode = currNode.next;

        newNode.next = currNode.next;
        currNode.next = newNode;
        size++;
    }

    public static void addLast(int[][] data) { // add last
        Node newNode = new Node(data, row, col);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node currNode = head;
        while (currNode.next != null)
            currNode = currNode.next;

        currNode.next = newNode;
        size++;
    }

    public static void deleteFirst() { // delete at last
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        size--;
        head = head.next;
    }

    public static void deleteMid() { // delete at mid
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        int mid = size / 2;

        if (size == 1) {
            deleteFirst();
            size--;
            return;
        }

        size--;
        Node currNode = head;
        for (int i = 0; i < mid - 1; i++)
            currNode = currNode.next;

        currNode.next = currNode.next.next;
    }

    public static void deleteLast() { // delete at last
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        size--;
        Node secondLastNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }

        secondLastNode.next = null;
    }

    public static void printLL() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(Arrays.deepToString(currNode.data) + "->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        TowDarrayLL n = new TowDarrayLL(3, 3);
        Linked_List list = new Linked_List();

        int[][] a = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 },
        };

        int[][] b = {
                { 20, 10, 30 },
                { 50, 40, 60 },
                { 80, 70, 90 },
        };

        int[][] c = {
                { 30, 20, 10 },
                { 60, 50, 40 },
                { 90, 80, 70 },
        };

        // Function calls ->
        // _________________________
        // _________________________

        addFirst(a);
        addFirst(b);
        addMid(c);

        printLL();

        System.out.println("Using Java Framework->");
        // using collection frame work
        // function calls ////_____________________
        list.addAtFirst(a);
        list.addAtLast(c);
        list.addAtMid(c);

        list.printLL();
    }
}
