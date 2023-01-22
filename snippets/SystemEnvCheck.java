package snippets;

import java.util.Map;
import java.util.stream.Collectors;

public class SystemEnvCheck {
    public static void main(String[] args) {
        Map<String, String> map = System.getenv();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "='" + entry.getValue() + "'");
        }

        String props = System.getProperties().entrySet().stream()
            .map(e -> e.getKey() + "='" + e.getValue() + "'")
            .collect(Collectors.joining("\n"));
        System.out.println(props);
    }
}
