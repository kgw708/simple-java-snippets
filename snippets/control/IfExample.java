package snippets.control;

public class IfExample {
    public static void main(String[] args) {

        String fruit = "watermelon";

        // if文
        if ("melon".equals(fruit)) {
            System.out.println("This is a melon.");
        } else if ("lemon".equals(fruit)) {
            System.out.println("This is a lemon.");
        } else {
            System.out.println("This number is a " + fruit + ".");
        }
    }
}
