package GFG.array;

public class Question11 {
    public static void main(String[] args) {
        int[] arr = {-2, 6, -3, -10, 0, 2};
        System.out.println(maxProduct(arr));
    }

    static int maxProduct(int[] arr) {
        int n = arr.length;
        int currentMin = arr[0];
        int currentMax = arr[0];
        int maxProd = arr[0];

        for (int i = 1; i < n; i++) {
            int temp = Math.max(arr[i], Math.max(arr[i] * currentMax, arr[i] * currentMin));
            currentMin = Math.min(arr[i], Math.min(arr[i] * currentMax, arr[i] * currentMin));
            currentMax = temp;
            maxProd = Math.max(maxProd, currentMax);
        }

        return maxProd;
    }
}
