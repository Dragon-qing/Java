package Demo05;

import java.io.*;

public class myFile { public static void main(String []args) {
    File in=new File("D:\\1.jpg");
    File out=new File("a.jpg");
    try {
        FileInputStream fin=new FileInputStream(in);
        FileOutputStream fout=new FileOutputStream(out);
        int s;
        int i=0;
        try {
            byte []b=new byte[(int)(fin.available())];
            while((s=fin.read())!=-1) {
                b[i++]=(byte)s;
            }
            fout.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
}
}
