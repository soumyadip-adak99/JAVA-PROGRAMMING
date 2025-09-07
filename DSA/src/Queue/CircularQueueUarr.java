package Queue;

public class CircularQueueUarr {
    static class queue {
        static int[] arr;
        static int size;
        static int front;
        static int rear;

        queue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        // is empty condition
        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // is full condition
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // enqueue
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full.");
                return;
            }

            if (front == -1) { // if add first element front value increase by -1 to 0
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // dequeue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1;
            }

            int result = arr[front];
            // if queue have a singel element the rear and front set into previous state -1
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        // peek function
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        queue q = new queue(4);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println("Peek element: " + q.peek());
        System.out.println("Remove element: " + q.remove());
        System.out.println("Display all element.");
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}