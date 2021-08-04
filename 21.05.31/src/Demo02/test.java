package Demo02;

public class test {
    public static void meth(int i,MessageBuilder m){
        if(i==1){
            System.out.println(m.buildMessage());
        }
    }
    public static void main(String[] args) {
        String s1="123";
        String s2="abc";
        String s3="nbc";
        meth(1,()->
           s1+s2+s3
        );
    }
}
