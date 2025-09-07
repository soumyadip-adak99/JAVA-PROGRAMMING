package LinkedList.Practice_Question.src;

import CreateList.MyList;
import CreateList.Node;

public class CheckCycleInList {
    // Create a cycle in the linked list
    public static void createCycle() {
        if (Node.head == null || Node.head.next == null) {
            return; // No cycle if list has 0 or 1 node
        }

        Node lastNode = Node.head;
        Node connectNode = Node.head; // Node to connect the last node to create a cycle

        // Traverse to the last node
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        // Connect the last node to the second node (or any valid node to form a cycle)
        connectNode = Node.head.next;
        lastNode.next = connectNode;
    }

    // Delete a cycle in the linked list
    public static void deleteCycle() {
        if (Node.head == null || Node.head.next == null) {
            return;
        }

        Node slow = Node.head;
        Node fast = Node.head;

        // Detect cycle using two-pointer approach
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Cycle detected
                break;
            }
        }

        // If no cycle detected, return
        if (fast == null || fast.next == null) {
            return;
        }

        // Find the start of the cycle
        slow = Node.head;
        Node prev = null; // To track the node before the cycle starts

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Break the cycle
        prev.next = null;
    }

    // Check if the linked list contains a cycle
    public static boolean hasCycle() {
        if (Node.head == null) {
            return false;
        }

        Node slow = Node.head;
        Node fast = Node.head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // Cycle detected
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        MyList.insert(10);
        MyList.insert(30);
        MyList.insert(40);
        MyList.insert(50);

        createCycle();

        if (hasCycle()) {
            System.out.println("Cycle was created.");
            deleteCycle();

            // Verify if the cycle was removed
            if (!hasCycle()) {
                System.out.println("Cycle was removed.");
            } else {
                System.out.println("Cycle still exists.");
            }
        } else {
            System.out.println("Cycle was not created.");
        }
    }
}
