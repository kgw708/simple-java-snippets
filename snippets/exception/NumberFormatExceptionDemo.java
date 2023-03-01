package snippets.exception;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt("a");
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int i = Integer.parseInt("a", 16);
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
