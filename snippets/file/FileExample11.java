package snippets.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;
import java.lang.System;

public class FileExample11 {
    public static void main(String[] args) {

        String targetFile = "input.csv";
        // input.csvの中身
        // a,b,c,d,e
        // 1,2,3,4,5

        try {
            BufferedReader br = new BufferedReader(new FileReader(targetFile));
            String s;
            while ((s = br.readLine()) != null) {
                String[] tmp = s.split(",");
                System.out.println(tmp[0] + tmp[1] + tmp[2] + tmp[3] + tmp[4]);
            }
            br.close();
        } catch(FileNotFoundException e) {
            System.out.println(targetFile + " が見つかりませでした。");
        } catch(IOException ex) {
            System.out.println(targetFile + " を読み込めませんでした。");
        }
    }
}
