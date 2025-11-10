import java.util.PriorityQueue;

public class FIndKLargestElement {
    public static void main(String[] args) {
        System.out.println(kLargestElement(new int[]{7, 3, 4, 0, 5, 6, 8, 9}, 3));
    }

    public static int kLargestElement(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.add(num);

            if (pq.size() > k) {
                pq.remove();
            }
        }

        Integer result = pq.peek();

        if (result == null) {
            throw new IllegalStateException("PriorityQueue should not be empty at this point.");
        }
        return result;
    }
}