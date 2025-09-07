package stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackULL {
    public static Node top = null; // top declared as a global variable

    public static void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public static int pop() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1;
        }

        int popValue = top.data;
        top = top.next;
        return popValue;
    }

    public static int peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return -1;
        }

        return top.data;
    }

    public static void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
        }

        Node currentNode = top;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        push(40);

        System.out.println("Pop: " + pop());
        System.out.println("Peek:- " + peek());

        display();
    }
}