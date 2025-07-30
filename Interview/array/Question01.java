// find the second largest element in the array
package Interview.array;

public class Question01 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7, 6 };
        System.out.println(findSecondLargestElement(arr));
    }

    static int findSecondLargestElement(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        }

        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = num;
            } else if (num > secondLargestNumber && num != largestNumber) {
                secondLargestNumber = num;
            }
        }

        return secondLargestNumber == Integer.MIN_VALUE ? -1 : secondLargestNumber;
    }
}