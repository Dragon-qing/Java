package Demo1;

public class Demo01String {
    public static void main(String[] args) {
        String str1=new String ();
        System.out.println("第一种:"+str1);
        char[]chararray={'A','B','C'};
        String str2=new String(chararray);
        System.out.println("第一种:"+str2);
        byte[]byteArray={97,98,99};
        String str3=new String(byteArray);
        System.out.println("第三种"+str3);
        String s1="ababab";
        System.out.println(s1);
    }
}
