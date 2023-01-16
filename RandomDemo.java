import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // Math.random()
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random() * 100) + 1);
        }
        System.out.println(list);
        list.clear();

        // Random
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100) + 1);
        }
        System.out.println(list);
    }
}
