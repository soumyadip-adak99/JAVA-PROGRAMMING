package LinkedList.Practice_Question.src;// check if a linkedlist if palindrome or not

import java.util.List;
import java.util.LinkedList;

class CheckListIsPalindromeOrNot {
    public static List<Integer> list = new LinkedList<>();

    public static void addNode(int data) {
        list.add(data);
    }

    public static boolean isPalindrome() {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            if (!list.get(start).equals(list.get(end))) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class PalindromeOrNot {
    // This node class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // decleared head
    public static Node head = null;

    // add nodes
    public static void addNode(int data) {
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

    // find middel node of the linkedlist using 2 pointer method
    public static Node findMiddleNode() {
        Node firstPtr = head;
        Node secondPtr = head;

        while (firstPtr != null && firstPtr.next != null) {
            firstPtr = firstPtr.next.next;
            secondPtr = secondPtr.next;
        }

        return secondPtr;
    }

    // reverse the second part of the linkedlist
    public static Node reverse(Node middleHead) {
        if (middleHead == null || middleHead.next == null) {
            return middleHead;
        }

        Node newNode = reverse(middleHead.next);
        middleHead.next.next = middleHead;
        middleHead.next = null;
        return newNode;
    }

    // this method check the linkedlist palindrome or not
    public static boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        Node middleNode = findMiddleNode(); // get the middle node of the linked list
        Node secondPartHead = reverse(middleNode.next); // get second part linked list head
        middleNode.next = null;

        Node firstPartHead = head; // get the first part linkedlist head

        // compaire the first part linkedlist head or second part linkedlist head
        while (secondPartHead != null) {
            if (firstPartHead.data != secondPartHead.data) {
                return false;
            }

            firstPartHead = firstPartHead.next;
            secondPartHead = secondPartHead.next;
        }

        return true;
    }

    public static void main(String[] args) {
        addNode(10);
        addNode(20);
        addNode(10);

        // cheack the linkedlist is palindrome or not
        if (isPalindrome()) {
            System.out.println("The list is a palindrome.");
        } else {
            System.out.println("The list is not a palindrome.");
        }
    }
}

// using java collection frame work
