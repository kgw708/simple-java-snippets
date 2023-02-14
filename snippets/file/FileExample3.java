package snippets.file;

import java.io.File;

public class FileExample3 {
    public static void main(String[] args) {

        String path = "C:\\home\\";
        String dirName = "directory";

        File file = new File(path + dirName);
        file.mkdir();

        if (file.exists()) {
            System.out.println("dir exists.");
        }
    }
}
