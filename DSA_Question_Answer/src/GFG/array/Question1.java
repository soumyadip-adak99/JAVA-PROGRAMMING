package GFG.array;

public class Question1 {
    static int findSecondLargestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {2, 35, 1, 10, 34, 1};
        System.out.println("Second Largest element: " + findSecondLargestElement(arr));
    }
}
