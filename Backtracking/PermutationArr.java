import java.util.ArrayList;
import java.util.List;

public class PermutationArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(permutations(arr));
    }

    public static List<List<Integer>> permutations(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(result, new ArrayList<>(), arr);
        return result;
    }

    public static void backtrack(List<List<Integer>> result, List<Integer> tempArr, int[] arr) {
        if (tempArr.size() == arr.length) {
            result.add(new ArrayList<>(tempArr));
            return;
        }

        for (int number : arr) {
            if (tempArr.contains(number))
                continue;

            // add mew element
            tempArr.add(number);

            // go back and try another element
            backtrack(result, tempArr, arr);

            // remove the element
            tempArr.removeLast();
        }
    }
}