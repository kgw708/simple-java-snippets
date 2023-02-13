package snippets.file;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample1 {
    public static void main(String[] args) {

        // windows only
        String dir = "C:\\home\\";
        DateFormat format = new SimpleDateFormat("yyyyMMddhhmmss");

        Date date = new Date();
        String datetime = format.format(date);
        String fileName = dir + datetime + ".txt";
        System.out.println(fileName);

        try {
            File file = new File(fileName);
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
