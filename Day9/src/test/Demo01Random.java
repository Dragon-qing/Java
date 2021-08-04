package test;
import java.util.Random;
public class Demo01Random {
    public static void main(String[] args) {
        Random r=new Random();
        int num=r.nextInt();
        System.out.println("随机数是："+num);
        for(int i=0;i<10;++i) {
            num = r.nextInt(3);
            System.out.println(num);
        }
    }
}
