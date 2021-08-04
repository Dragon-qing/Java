package Deom02;

public class Demo05 {
    public static void main(String[] args) {
        String str1="aaa,vvv,ccc";
        String[] array=str1.split(",");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
