package Queue;

import java.util.Stack;

public class QueueUsingTwoStacks {
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        public void add(int data) {
            while (!s1.isEmpty())
                s2.push(s1.pop());

            s1.push(data);

            while (!s2.isEmpty())
                s1.push(s2.pop());
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            return s1.pop();
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            return s1.peek();
        }

        public void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }

            System.out.println("Queue contents: ");
            for (int i = s1.size() - 1; i >= 0; i--)
                System.out.println(s1.get(i));
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Peek: " + queue.peek());
        System.out.println("Remove: " + queue.remove());

        queue.display();
    }
}
