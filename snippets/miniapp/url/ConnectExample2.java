package snippets.miniapp.url;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class ConnectExample2 {
    public static void main(String args[]) {
        try {
            Scanner scanner = new Scanner(System.in);
            String urlStr = scanner.next();

            URL url = new URL(urlStr);
            Object obj = url.getContent();

            if (obj instanceof InputStream) {
                BufferedReader br = new BufferedReader(
                    new InputStreamReader((InputStream) obj));
                String line = "";
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
            } else {
                System.out.println("error: This is not URL." + obj.toString());
            }
        } catch (IOException e) {
            System.err.println("network error detected.");
        }
    }
}
