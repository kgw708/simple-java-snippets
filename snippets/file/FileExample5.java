package snippets.file;

import java.io.File;
import java.io.IOException;

public class FileExample5 {
    public static void main(String[] args) {

        String path = "C:\\home";
        String separator = "\\";
        String fileName = "test.txt";

        try {
            File file = new File(path + separator + fileName);
            file.createNewFile();

            if (file.exists()) {
                System.out.println("fileName = " + file.getName());
            }
    
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
