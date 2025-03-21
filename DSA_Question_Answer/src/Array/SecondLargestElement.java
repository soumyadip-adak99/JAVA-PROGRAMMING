package Array;


public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 6};
        int answer = solution(arr);

        // find the second-smallest element of this array
        if (answer == -1) {
            System.out.println("Not found second smallest elements in this array.");
        } else {
            System.out.println("Second largest element is: " + answer);
        }
    }

    public static int solution(int[] arr) {
        int size = arr.length; // find the size of the array;

        // sort thi array
        sort(arr);

        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }

        return -1;
    }

    // sorting function to sort this array
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }
}
