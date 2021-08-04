package Deom02;
import java.util.Random;
public class Demo08 {
    public static void main(String[] args) {
        String str=Integer.toString(456);
        String str2=Integer.toBinaryString(456);
        String str3=Integer.toHexString(456);
        String str4=Integer.toOctalString(456);
        System.out.println("十进制："+str);
        System.out.println("二进制："+str2);
        System.out.println("十六进制："+str3);
        System.out.println("八进制："+str4);

    }
}
