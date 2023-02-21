package snippets.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class StreamExample2 {
    public static void main(String[] args) throws IOException {

        InputStream in = null;
        InputStreamReader inr = null;

        try {
            in = new FileInputStream("input.txt");
            inr = new InputStreamReader(in, "UTF-8");
            int i = -1;
            while ((i = inr.read()) != -1) {
                char c = (char) i;
                System.out.print(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (inr != null) {
                inr.close();
            }
            if (in != null) {
                in.close();
            }
        }
    }
}
