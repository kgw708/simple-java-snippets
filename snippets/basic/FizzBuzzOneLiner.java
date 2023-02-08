package snippets.basic;

import java.util.stream.IntStream;

public class FizzBuzzOneLiner {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
            .mapToObj(i -> (i % 15 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : i))
            .forEach(System.out::println);
    }
}
