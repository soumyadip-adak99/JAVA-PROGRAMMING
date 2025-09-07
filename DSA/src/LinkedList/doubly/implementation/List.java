package LinkedList.doubly.implementation;

public interface List<K> {
    void addFirst(K data);

    void addLast(K data);

    void deleteFirst();

    void deleteLast();

    void printForward();

    void printBackword();

    long getSize();
}
