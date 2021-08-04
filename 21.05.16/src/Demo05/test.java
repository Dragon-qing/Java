package Demo05;

import java.io.FileReader;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("a.txt");
        char[] c=new char[1024];
        int len=0;
        while((len=fr.read(c))!=-1){
            System.out.print(new String(c,0,len));
        }
        fr.close();
    }
}
