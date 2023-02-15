package snippets.file;

import java.io.File;

public class FileExample8 {
    public static void main(String[] args) {

        String path = "C:\\home";
        String separator = "\\";
        String fileName = "test.txt";

        File home = new File(path);
        System.out.println(home.isDirectory());
        System.out.println(home.isFile());

        File file = new File(path + separator + fileName);
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
    }
}
