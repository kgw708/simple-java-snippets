package snippets.control;

public class ForExample {
    public static void main(String[] args) {

        // for文
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
            if (i == 2) {
                break;
            }
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
            if (i < 3) {
                continue;
            } else {
                break;
            }
        }

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                for (int k = 1; k <= 7; k++) {
                    // System.out.println("i = " + i + ", j = " + j + ", k = " + k);
                }
            }
        }
    }
}
