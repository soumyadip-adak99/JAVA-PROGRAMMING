import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // feature introduction in java 8
        // process collections of data in functional and declarative manner
        // Simplify Data processing
        // Improve Readability and maintainability

        // How to use stream ?
        // Source, intermediate operations & terminal operation

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int count = 0;
        for (int i : numbers) {
            if (i % 2 == 0)
                count++;
        }

        System.out.println(count);

        long totalEvenNumbers = numbers.stream().filter(x -> x % 2 == 0).count();
        System.out.println(totalEvenNumbers);

        // Creating Stream
        // 1. From collections
        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = lists.stream();

        // 2. from arrays
        String[] array = {"a", "b", "c"};
        Stream<String> stream2 = Arrays.stream(array);

        // 3. using stream of
        Stream<String> stream3 = Stream.of("a", "b");

        // 4. infinite stream
        Stream<Integer> generate = Stream.generate(() -> 1);
        Stream.iterate(0, x -> x + 1).limit(100);
    }
}