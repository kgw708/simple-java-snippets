package snippets.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample1 {
    public static void main(String[] args) throws IOException {

        String fileName = "OutputStreamExample1.txt";
        String text = "Hello World!\n";
        byte[] data = text.getBytes();
        OutputStream out = null;

        try {
            out = new FileOutputStream(fileName);
            out.write(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
