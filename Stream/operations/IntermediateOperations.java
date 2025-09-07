package operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        /*
            Intermediate operations transform a stream into another stream
            They are lazy, meaning they don't execute until a terminal operations is invoked.
        * */

        // 1. filter
        List<String> list = Arrays.asList("Ram", "Shyam", "Hari", "Arun");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));
        // no filtering at this point
        long result = list.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(result);

        // 2. map
        Stream<String> stringStream = list.stream().map(String::toUpperCase);

        // 3. sorted list
        Stream<String> sortedStreamList = list.stream().sorted();
        Stream<String> sortedUsingComparator = list.stream().sorted((a, b) -> a.length() - b.length());

        // 4. distinct
        list.stream().filter(x-> x.startsWith("A")).distinct().count();
    }
}
