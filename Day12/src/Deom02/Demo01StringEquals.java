package Deom02;

public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="Hello";
        char[] charArray={'H','e','l','l','l','o'};
        String str3=new String (charArray);
        System.out.println("hello".equalsIgnoreCase(str1));

    }
}
