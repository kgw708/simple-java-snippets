package snippets.miniapp.url;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

// ブラウザを介さずにWebサイトにアクセスする
public class ConnectExample1 {

    private static final String TARGET_URL = "http://example.com/";

    public static void main(String[] args) {
        try {
            URL url = new URL(TARGET_URL);
            URLConnection conn = url.openConnection();

            try (BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), "UTF-8"))) {
                while (br.ready()) {
                    System.out.println(br.readLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
