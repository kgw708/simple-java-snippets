package snippets.miniapp;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // コンソールに入力された値を取得する
        String input = scan.next();
        System.out.println("Characters typed in the console: " + input);
    }
}
