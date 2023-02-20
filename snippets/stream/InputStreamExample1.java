package snippets.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample1 {
    public static void main(String[] args) throws IOException {

        String fileName = "OutputStreamExample1.txt";
        InputStream in = null;

        try {
            in = new FileInputStream(fileName);
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
