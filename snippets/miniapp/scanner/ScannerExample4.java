package snippets.miniapp.scanner;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ScannerExample4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("> How old are you?");
            int old = scanner.nextInt();
            System.out.println("Your are " + old + " years old.");
        } catch (InputMismatchException e) {
            System.out.println("You should input numeric value.");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }    
}
