package Demo02;

import java.io.File;
import java.io.FileNotFoundException;

public class Demo {
    public static void main(String[] args) {
        String s1="D://code";
        try{
            fileread(s1);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void fileread(String s)throws FileNotFoundException {
        if(!s.equals("c://code")){
            throw new FileNotFoundException("路径异常！！！");
        }
        System.out.println("正常！！！");
    }
}
