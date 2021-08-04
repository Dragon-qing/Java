package Demo03;

import java.io.FileInputStream;
import java.io.IOException;

public class test {
    public static void main(String[] args)throws IOException {
        FileInputStream fis=new FileInputStream("a.txt");
        int len=0;
        byte []bytes=new byte[1024];
        while((len=fis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }
}
