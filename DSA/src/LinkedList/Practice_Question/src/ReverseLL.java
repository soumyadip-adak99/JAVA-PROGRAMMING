package LinkedList.Practice_Question.src;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLL {
    public static Node head = null;

    public static void addItems(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // iterator method
    public static void reverseLinkedList() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;
    }

    // recursive method
    public static Node reverseLLRecursion(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newNode = reverseLLRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public static void printLL() {
        if (head == null) {
            System.out.println("Stack is empty.");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        addItems(10);
        addItems(20);
        addItems(30);
        addItems(40);

        printLL();
        System.out.println("\nreverse.");
        reverseLinkedList();
        printLL();
    }
}
