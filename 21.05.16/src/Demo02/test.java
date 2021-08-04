package Demo02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream(new File("b.txt"),true);
         String s="你好";
         byte []bytes=s.getBytes();
//
//        for (byte aByte : bytes) {
//            System.out.println(aByte);
//        }
        for(int i=0;i<10;i++){

            fos.write(bytes);
            fos.write("\r\n".getBytes(StandardCharsets.UTF_8));
        }
        fos.close();
    }
}
