package LinkedList.doubly.implementation;

public class DoublyLinkedList<K> implements List<K> {
    long size;

    DoublyLinkedList() {
        this.size = 0;
    }

    class Node {
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
    }

    @Override
    public void deleteFirst() {

    }

    @Override
    public void deleteLast() {

    }

    @Override
    public void printForward() {

    }

    @Override
    public void printBackword() {

    }

    @Override
    public long getSize() {
        return 0;
    }
}
