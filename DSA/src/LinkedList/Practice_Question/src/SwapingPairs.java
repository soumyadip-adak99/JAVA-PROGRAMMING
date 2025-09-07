package LinkedList.Practice_Question.src;

class Node {
    long data;
    Node next;

    Node(long data) {
        this.data = data;
        this.next = null;
    }
}

public class SwapingPairs {
    private static Node head = null;

    public static void add(long data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    public static void printLL() {
        if (head == null) {
            System.out.println("List id empty.");
        }

        Node curretNode = head;
        while (curretNode != null) {
            System.out.print(curretNode.data + " ");
            curretNode = curretNode.next;
        }
    }

    public static Node swapingPairs(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node firstNode = node;
        Node secondNode = node.next;

        firstNode.next = swapingPairs(secondNode.next);
        secondNode.next = firstNode;

        return secondNode;
    }

    public static void main(String[] args) {

        add(10);
        add(20);
        add(30);
        add(40);
        add(50);
        add(60);

        head = swapingPairs(head);

        printLL();

    }
}