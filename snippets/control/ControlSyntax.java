package snippets.control;

public class ControlSyntax {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 100) + 1;

        // for
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }

        // if
        if (number > 50) {
            System.out.println("This number is larger than 50.");
        } else if (number < 50) {
            System.out.println("This number is smaller than 50.");
        } else {
            System.out.println("This number is 50.");
        }

        // while
        int len = String.valueOf(number).length();
        String result = "This number has 2 digits.";
        switch (len) {
          case 1:
            result = "This number has 1 digit.";
            break;
          case 3:
            result = "This number has 3 digits.";
            break;
          default:
            break;
        }
        System.out.println(result);
    }
}
