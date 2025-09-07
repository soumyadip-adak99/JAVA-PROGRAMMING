package LinkedList.Practice_Question.src.CreateList;

public class MyList {
    public static void insert(int data) {
        Node newNode = new Node(data);

        if (Node.head == null) {
            Node.head = newNode;
            return;
        }

        Node currNode = Node.head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }
}
