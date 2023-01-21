package snippets;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class List2StringDemo {
    public static void main(String[] args) {
        List<String> g7List =
            Arrays.asList("France", "USA", "UK", "Germany", "Japan", "Italy", "Canada");

        // Stream API
        String g7Countries = g7List.stream()
                                .map(x -> x.toUpperCase())
                                .collect(Collectors.joining(", "));
        System.out.println(g7Countries);
    }
}
