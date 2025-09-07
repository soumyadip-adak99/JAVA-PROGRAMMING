package LinkedList.Practice_Question.src;/*
 *  1->2->3->4->5
 *  1->2->3--->5
 *  
 * input= [1,2,3,4,5], n = 2;
 * output = [1,2,3,5];
 * 
 */

import java.util.LinkedList;
import java.util.List;

// using collection framework
class RemoveNode {
    public List<Integer> removeNode(List<Integer> list, int n) {
        List<Integer> newList = new LinkedList<>();

        if (list.get(1) == null || list.isEmpty() || n == 1) {
            return list;
        }

        if (list.size() == n) {
            newList.add(list.get(0));
            return newList;
        }

        int removeNode = list.get(list.size() - n);

        for (int i = 0; i < list.size(); i++) {
            if (removeNode != list.get(i)) {
                newList.add(list.get(i));
            }
        }

        return newList;
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RemoveNthNode {
    static Node head = null;
    static int size = 0;

    public static void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        size++;

        Node curretNode = head;
        while (curretNode.next != null) {
            curretNode = curretNode.next;
        }
        curretNode.next = newNode;
    }

    public static void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node curretNode = head;
        while (curretNode != null) {
            System.out.print(curretNode.data + " ");
            curretNode = curretNode.next;
        }
    }

    public static int getSize() {
        return size;
    }

    public static Node removeNthNode(int n) {
        if (head == null || head.next == null || n == 1) {
            return head;
        }

        if (n == size) {
            head = head.next;
            size--;
            return head;
        }

        Node prvNode = head;
        int indexToSearch = size - n;

        for (int i = 0; i < indexToSearch - 1; i++) {
            prvNode = prvNode.next;
        }

        prvNode.next = prvNode.next.next;
        size--;

        return head;
    }

    public static void main(String[] args) {
        addNode(10);
        addNode(20);
        addNode(30);
        printList();
        System.out.println("\nSize of the linked list: " + getSize());

        head = removeNthNode(2);

        printList();

        System.out.println("\nSize of the linked list: " + getSize());

        RemoveNode r = new RemoveNode();

        List<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list = r.removeNode(list, 2);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
