package snippets.stream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class InputStreamExample2 {
    public static void main(String[] args) throws IOException {

        // System.setProperty("http.proxyHost", "test.proxy.com");
        // System.setProperty("http.proxyPort", "8081");
        // System.setProperty("https.proxyHost", "test.proxy..com");
        // System.setProperty("https.proxyPort", "8081");
        // System.setProperty("http.nonProxyHosts", "localhost|*.nonproxy.com");

        URL url = new URL("https://www.google.co.jp");
        InputStream in = null;

        try {
            in = url.openStream();
            int i = -1;
            while ((i = in.read()) != -1) {
                char c = (char) i;
                System.out.println(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}
