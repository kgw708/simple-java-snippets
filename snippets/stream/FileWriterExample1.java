package snippets.stream;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample1 {
    public static void main(String[] args) throws IOException {

        FileWriter fw = null;

        try {
            fw = new FileWriter("output.txt");
            fw.write("Hello World!!!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                fw.close();
            }
        }
    }
}
