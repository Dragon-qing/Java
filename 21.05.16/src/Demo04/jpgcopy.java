package Demo04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class jpgcopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("1.jpg");
        FileOutputStream fos=new FileOutputStream("1副本.jpg");
        byte []bytes=new byte[1024];
        int len=0;
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }
}
