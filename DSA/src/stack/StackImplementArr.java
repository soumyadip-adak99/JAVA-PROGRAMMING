package stack;

import java.util.ArrayList;

class Stack {
    private int size;

    Stack(int size) {
        this.size = size;
    }

    ArrayList<Integer> arr = new ArrayList<>(size);

    public boolean isFull() {
        return arr.size() == size;
    }

    public boolean isEmpty() {
        return arr.size() == 0;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack over flow.");
            return;
        }

        arr.add(data);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr.remove(arr.size() - 1);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr.get(arr.size() - 1);
    }

    public void display() {
        if (isEmpty())
            System.out.println("Stack is empyt.");

        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.println(arr.get(i));
        }
    }
}

public class StackImplementArr {
    public static void main(String[] args) {
        Stack n = new Stack(3);

        n.push(10);
        n.push(20);
        n.push(30);
        n.push(40);

        // n.display();

        while (!n.isEmpty()) {
            System.out.println("Peek: " + n.peek());
            n.pop();
        }
    }
}
