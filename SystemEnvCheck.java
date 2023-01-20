import java.util.Map;

public class SystemEnvCheck {
    public static void main(String[] args) {
        Map<String, String> map = System.getenv();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        // System.out.println(System.getProperties());
    }
}
