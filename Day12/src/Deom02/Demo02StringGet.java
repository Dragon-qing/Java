package Deom02;

public class Demo02StringGet {
    public static void main(String[] args) {
        int length="abkjfdsfoaijef".length();
        System.out.println("字符串长度"+length);
        String str1="Hello";
        String str2="World";
        String str3=str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("=============");
        String original="HelloWorldHHHH";
        int ss = original.indexOf("llo");
        System.out.println(ss);
    }
}
