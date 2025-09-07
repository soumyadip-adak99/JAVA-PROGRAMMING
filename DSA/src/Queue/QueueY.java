package Queue;

public class QueueY {
    static class queue {
        static int arr[];
        static int size;
        static int rear;

        queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        // enqueue
        public void enqueue(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full.");
                return;
            }

            arr[++rear] = data;
            System.out.println("Enqueue: " + data);
        }

        // dequeue
        public int dequeque() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        queue q = new queue(3);

        for (int i = 10; i <= 40; i += 10) {
            q.enqueue(i);
        }

        System.out.print("Queue is element: ");
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.dequeque();
        }
    }
}