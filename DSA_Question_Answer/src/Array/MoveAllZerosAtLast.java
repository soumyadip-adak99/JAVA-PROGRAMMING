package Array;

public class MoveAllZerosAtLast {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 5, 0, 6, 0, 7};
        solution(arr);

        for (int key : arr) {
            System.out.print(key + " ");
        }
    }

    static void solution(int[] arr) {
        int index = 0;

        for (int key : arr) {
            if (key != 0) {
                arr[index++] = key;
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
}
