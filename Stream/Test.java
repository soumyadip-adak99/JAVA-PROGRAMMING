import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {

        // stream

        // java 8 --> minimal code, functional programming
        // java 8 -> lambda expression, Streams, Date & Time API

        // lambda expression
        //  is an anonymous function (no name, no return type, no
        // access modifier)

        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation div = (a, b) -> a / b;
        MathOperation mul = (a, b) -> a * b;

        System.out.println(add.operation(1, 1));
        System.out.println(sub.operation(3, 1));
        System.out.println(div.operation(4, 2));
        System.out.println(mul.operation(3, 3));

        // Predicate --> functional interface (Boolean value function)
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));

        Predicate<String> isWordStartsWithA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> endWithB = x -> x.toLowerCase().endsWith("b");

        // merge tow predicate
        Predicate<String> and = isWordStartsWithA.and(endWithB);

        System.out.println(and.test("ab"));

        // Function: work fully work
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> tripleIt = x -> 3 * x;

        // @andThen()
        // in functional interface function andThen() the first function call it
        // and then the inner function is run with the return value of first function
        System.out.println(doubleIt.andThen(tripleIt).apply(20));

        // @compose() in Functional interface
        // in compose() function work like andThen() but this vise varas
        System.out.println(doubleIt.compose(tripleIt).apply(20));

        // in functional interface the identity() which is input and return the same
        // value
        Function<Integer, Integer> identity = Function.identity();
        Integer res = identity.apply(5);
        System.out.println(res);

        // Consumer
        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(51);

        // ex
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<List<Integer>> printList = x -> {
            for (int i : x) {
                System.out.print(i + " ");
            }
        };

        printList.accept(list);

        // supplier
        Supplier<String> giveString = () -> "\nHello world";
        System.out.println(giveString.get());

        // Combined example
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer1 = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if (predicate.test(supplier.get())) {
            consumer1.accept(function.apply(supplier.get()));
        }

        // BiConsumer, BiPredicate, BiFunction it can consume multiple arguments
        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println(isSumEven.test(10, 2));

        BiFunction<String, String, Integer> biFunction = (x, y) -> (x + y).length();
        System.out.println(biFunction.apply("hello", "world"));

        // unaryOperator
        UnaryOperator<Integer> operator = x -> 2 * x;
        BinaryOperator<Integer> biOperator = (x, y) -> x + y;

        // Method reference --> use method without invoking and in place of lambda
        // expression
        List<String> student = Arrays.asList("Ram", "Shyam", "Hari");
        student.forEach(System.out::println);

        // constructor reference
        List<String> names = Arrays.asList("A", "B", "C");
        names.stream().map(MobilePhone::new).collect(Collectors.toList());

    }
}

class MobilePhone {
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}

// function interface must have containing only one function
@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}
