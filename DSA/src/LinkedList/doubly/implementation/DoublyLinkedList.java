package LinkedList.doubly.implementation;

public class DoublyLinkedList<K> implements List<K> {
    long size;

    DoublyLinkedList() {
        this.size = 0;
    }

    private class Node {
        K data;
        Node prev, next;

        Node(K data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;


    @Override
    public void addFirst(K data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }

    @Override
    public void addLast(K data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        head.prev = tail;
        tail = newNode;
        size++;
    }

    @Override
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
    }

    @Override
    public void deleteLast() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }

        size--;
    }

    @Override
    public void printForward() {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

    @Override
    public void printBackword() {
        Node currentNode = tail;

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.prev;
        }
    }

    @Override
    public long getSize() {
        return size;
    }
}
