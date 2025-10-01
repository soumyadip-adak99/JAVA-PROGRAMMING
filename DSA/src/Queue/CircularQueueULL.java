package Queue;

public class CircularQueueULL {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node front = null;
    public static Node rear = null;

    public static boolean isEmpty() {
        return rear == null && front == null;
    }

    public static void enQueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
            rear.next = front;
            return;
        }
        rear.next = newNode;
        rear = newNode;
        rear.next = front;
    }

    public static int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        int result = front.data;
        if (front == rear) {
            front = rear = null;
            return result;
        }

        front = front.next;
        rear.next = front;
        return result;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return front.data;
    }

    private static void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node currNode = front;
        do {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        } while (currNode != front);

        System.out.println();
    }

    public static void main(String[] args) {
        enQueue(10);
        enQueue(20);
        enQueue(30);
        enQueue(40);

        display();

        System.out.println("Dequeued: " + deQueue());
        display();

        System.out.println("Peek: " + peek());
    }
}
