package Queue;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueULL {
    public static Node front = null;
    public static Node rear = null;

    public static void enqueue(int data) { // enqueue
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public static int dequeue() { // dequeue
        if (rear == null) {
            System.out.println("Queue is empty.");
            return -1;
        }

        int frontVal = front.data;
        front = front.next;

        if (front == null)
            rear = null;

        return frontVal;
    }

    public static int peek() { // peek
        if (rear == null) {
            System.out.println("Queue is empty.");
            return -1;
        }

        return front.data;
    }

    public static void display() { // display
        if (rear == null) {
            System.out.println("Queue is empty.");
        }

        Node currentNode = front;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        for (int i = 10; i <= 50; i += 10)
            enqueue(i);

        System.out.println("Display->");
        display();

        System.out.println("Dequeue-> " + dequeue());

        System.out.println("Peek->");
        while (front != null) {
            System.out.println(peek());
            dequeue();
        }
    }
}