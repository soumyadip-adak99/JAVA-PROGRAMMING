public class FindMissingElementArray {

    public static void main(String[] args) {
        System.out.println(findMissingElement(new int[]{1, 2, 4, 5}, 5));
    }

    static int findMissingElement(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return totalSum - sum;
    }
}
