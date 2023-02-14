package snippets.file;

import java.io.File;

public class FileExample4 {
    public static void main(String[] args) {

        // 2階層以上のディレクトリ作成
        String path = "C:\\home";
        String separator = "\\";
        String dir1 = "directory1";
        String dir2 = "directory2";

        File file = new File(path + separator + dir1 + separator + dir2);
        file.mkdirs();

        if (file.exists()) {
            System.out.println("dir exists.");
        }
    }
}
