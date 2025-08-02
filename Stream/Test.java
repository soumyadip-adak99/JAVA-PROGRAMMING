import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        // convert a List in a stream
        List<String> list = Arrays.asList("apple", "banana", "cherry");

        Stream<String> myListStream = list.stream();

        // conver a array in a stream
        String[] array = { "apple", "banana", "cherry" };

    }
}
