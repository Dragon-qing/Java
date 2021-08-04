package Demo01;

import java.io.FileOutputStream;
import java.io.IOException;

public class test {
    public static void main(String []args){
        try(FileOutputStream fos=
                    new FileOutputStream("a.txt")
        ){
            fos.write(97);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
