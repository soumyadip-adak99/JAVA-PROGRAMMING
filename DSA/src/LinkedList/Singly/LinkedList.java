package LinkedList.Singly;//import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    private static Node head = null;
    private static int size = 0;

    public static void addFirst(int data) { // add first
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    public static void addMid(int data) { // add mid
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        if (size == 1) { // if list have a single node
            head.next = newNode;
            size++;
            return;
        }

        int mid = size / 2;
        Node currNode = head;

        for (int i = 0; i < mid - 1; i++) {
            currNode = currNode.next;
        }

        newNode.next = currNode.next;
        currNode.next = newNode;
        size++;
    }

    public static void addAtPosition(int data, int pos) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        if (head.next == null) {
            head.next = newNode;
            size++;
            return;
        }
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }

        Node currNode = head;

        for (int i = 0; i < pos - 1; i++) {
            currNode = currNode.next;
        }

        newNode.next = currNode.next;
        currNode.next = newNode;
        size++;
        System.out.println(data + "will be added");
    }

    public static void addLast(int data) { // add last
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        size++;
    }

    public static void deleteFirst() { // delete first
        if (head == null) {
            System.out.println("This list empty.");
            return;
        }

        size--;
        head = head.next;
    }

    public static void deleteMid() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        int mid = size / 2;

        if (mid == 0) { // If only one element, just delete the head
            deleteFirst();
            size--;
            return;
        }

        Node currNode = head;
        for (int i = 0; i < mid - 1; i++) {
            currNode = currNode.next;
        }

        currNode.next = currNode.next.next;
        size--;
    }

    public static void deleteAtPos(int pos) {
        if (head == null) {
            System.out.println("This list is empty.");
            return;
        }

        if (pos == 0) {
            deleteFirst();
            size--;
            return;
        }

        Node currNode = head;
        for (int i = 0; i < pos - 1; i++) {
            currNode = currNode.next;
        }

        currNode.next = currNode.next.next;
        size--;
    }

    public static void deleteLast() { // delete last
        if (head == null) {
            System.out.println("This list empty.");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    public static void printLL() { // print list
        if (head == null) {
            System.out.println("This list empty.");
            return;
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static int getSize() {
        return size;
    }

    public static void main(String[] args) {
        addLast(10);
        addAtPosition(20, 2);
        addLast(30);
        addAtPosition(40, 3);
        printLL();
        System.out.println("Total size of the list is: " + getSize());
    }
}