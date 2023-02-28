package snippets.file;

import java.io.File;

public class FileExample12 {
    public static void main(String[] args) {

        // normal file
        System.out.println(removeFileExtension("hoge.txt"));

        // file without extension
        System.out.println(removeFileExtension("hosts"));

        // dot file
        System.out.println(removeFileExtension(".bash_profile"));

        // remove extension from file
        File file = new File("C:\\home\\piyopiyo.txt");
        String fileName = file.getName();
        System.out.println(removeFileExtension(fileName));
    }

    private static String removeFileExtension(final String fileName) {
        int dotPosition = fileName.lastIndexOf(".");

        if (dotPosition == -1 || dotPosition == 0) {
            return fileName;
        } else {
            return fileName.substring(0, dotPosition);
        }
    }
}
