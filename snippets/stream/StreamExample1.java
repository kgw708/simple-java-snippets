package snippets.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class StreamExample1 {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;
        FileChannel inChannel = null;
        FileChannel outChannel = null;

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");
            inChannel = in.getChannel();
            outChannel = out.getChannel();
            inChannel.transferTo(0, inChannel.size(), outChannel);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (outChannel != null) {
                outChannel.close();
            }
            if (inChannel != null) {
                inChannel.close();
            }
            if (out != null) {
                out.close();
            }
            if (in != null) {
                in.close();
            }
        }
    }
}
