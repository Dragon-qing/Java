package Deom02;

public class Demo04StringConcert {
    public static void main(String[] args) {
        char[]arr="abcd".toCharArray();
        System.out.println(arr[1]);
        byte[]b="acx".getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println("===============");
        String s1="HEooooLLLLoi";
        String str2=s1.replace('o','*');
        System.out.println(str2);

    }
}
