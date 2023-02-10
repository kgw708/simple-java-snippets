package snippets.miniapp;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        // コンソールに入力された値を取得する
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        System.out.println("Characters typed in the console: " + input);
        scan.close();
    }
}
