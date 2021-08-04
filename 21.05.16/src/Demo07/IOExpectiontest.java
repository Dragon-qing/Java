package Demo07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExpectiontest {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("1.jpg");
        FileOutputStream fos=new FileOutputStream("1副本.jpg");
        try(fis;fos){
            byte []bytes=new byte[1024];
            int len=0;
            while((len=fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
