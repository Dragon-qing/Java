public class StringTest {
    public static void main(String[]args)
    {
        String s1="abc";
        String s2="ABC";
        s1+=s2;
        System.out.println(s1);
        int number=1234;
        s2+=number;
        System.out.println(s2);
        System.out.println('*'+'\t'+'*');
        System.out.println('*'+"\t"+'*');
        System.out.println('*'+('\t'+"*"));
        System.out.println('*'+'\t'+"*");
        String str1=3.5f+"";
        System.out.println(str1);
        System.out.println((int)'a');
        System.out.println((int)'A');
        byte b=3;
        short sh=4;
    }


}
