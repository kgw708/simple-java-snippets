package snippets.file;

import java.io.File;

public class FileExample6 {
    public static void main(String[] args) {

        String path = "C:\\home";
        String separator = "\\";
        String fileName = "test.txt";

        File file = new File(path + separator + fileName);

        // 絶対パス
        System.out.println(file.getAbsolutePath());
    }
}
