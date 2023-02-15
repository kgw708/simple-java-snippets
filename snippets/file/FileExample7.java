package snippets.file;

import java.io.File;

public class FileExample7 {
    public static void main(String[] args) {

        String path = "C:\\home";
        String separator = "\\";
        String fileName = "test.txt";

        File file = new File(path + separator + fileName);

        // 親ディレクトリのパス
        String parentPath = file.getParent();
        System.out.println(parentPath);

        // 親ディレクトリ（ファイルオブジェクト）
        File parentDir = file.getParentFile();
        System.out.println(parentDir);
    }
}
