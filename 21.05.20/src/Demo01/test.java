package Demo01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("1.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        fos.write("abcdef".getBytes(StandardCharsets.UTF_8));
        fos.close();
    }
}
