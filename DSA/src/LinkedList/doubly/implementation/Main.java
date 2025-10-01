package LinkedList.doubly.implementation;

public class Main {
    public static void main(String[] args) {
        List<Integer> doublyList = new DoublyLinkedList<>();

        doublyList.addFirst(10);
        doublyList.addFirst(20);
        doublyList.addFirst(30);
        doublyList.addFirst(40);

        doublyList.printBackword();
    }
}
