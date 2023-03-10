package snippets.exception;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String str = null;
            if (str == null) {
                System.out.println("Its not null.");
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
