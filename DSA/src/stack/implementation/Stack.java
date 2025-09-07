package stack.implementation;

public class Stack<K> {

    class Node {
        K data;
        Node next;

        public Node(K data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top = null;

    private boolean isEmpty() {
        return top == null;
    }

    // insert data
    public void push(K data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // delete data
    public K pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }

        K popData = top.data;
        top = top.next;
        return popData;
    }

    // get the first element
    public K peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }

        return top.data;
    }

    // display all data
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        Node currentNode = top;

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
}
