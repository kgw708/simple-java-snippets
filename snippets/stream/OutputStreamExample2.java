package snippets.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample2 {

    private static final String NEW_LINE = "\n";

    public static void main(String[] args) throws IOException {

        String fileName = "OutputStreamExample2.txt";
        String text = "Hello World!";
        byte[] data = text.getBytes();
        OutputStream out = null;

        try {
            out = new FileOutputStream(fileName);
            out.write(data);
            out.write(NEW_LINE.getBytes());
            out.write(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }

        File file = new File(fileName);
        String filePath = file.getAbsolutePath();
        System.out.println("PATH: " + filePath);
    }
}
