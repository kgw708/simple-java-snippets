package snippets.file;

import java.io.File;
import java.io.IOException;

public class FileExample2 {
    public static void main(String[] args) {

        // windows only
        String fileName = "C:\\home\\test.txt";
        File file = new File(fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("file created.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (file.exists()) {
            System.out.println("file exists.");
        }

        if (file.delete()) {
            System.out.println("file deleted.");
        }
    }
}
