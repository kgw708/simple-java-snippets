package snippets.miniapp.scanner;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScannerExample3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("> 正規表現を入力してください");

        Pattern pattern = Pattern.compile(scanner.nextLine());
        System.out.println("> 正規表現にマッチさせる文字列を入力してください");

        // 入力の受付を終了する場合は ctrl + c を入力する
        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            Matcher matcher = pattern.matcher(nextLine);

            // 入力した文字列が正規表現にマッチするか確認する
            while (matcher.find()) {
                System.out.println("> マッチしました: " + matcher.group());
            }
        }

        scanner.close();
    }
}
