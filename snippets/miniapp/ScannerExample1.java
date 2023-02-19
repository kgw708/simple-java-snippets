package snippets.miniapp;

import java.util.Scanner;

public class ScannerExample1 {
    public static void main(String[] args) {
        // Integer#parseIntを使うとメモリ使用量がおさえられる
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        System.out.println("Characters typed in the console: " + n);
        sc.close();
    }
}
