package Queue;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularQueueULL {
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
            System.out.println("Stack is empty.");
            return -1;
        }

        int result = front.data;
        if (front == rear)
            front = rear = null;

        front = front.next;
        rear.next = front;
        return result;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }

        return front.data;
    }

    public static void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        Node currNode = front;
        while (currNode != front) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {

    }
}
