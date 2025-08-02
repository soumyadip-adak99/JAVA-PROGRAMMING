import java.util.Arrays;

public class FindSumOfEvenNumbers {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		// using stream
		int sum = Arrays.stream(arr).filter(n -> n % 2 == 0).sum();

		// using normal approach
		int sum2 = 0;

		for (int n : arr) {
			if (n % 2 == 0) {
				sum2 += n;
			}
		}

		System.out.println("Using stream is a advance approach: " + sum);

		System.out.println("Normal approach: " + sum2);
	}
}
