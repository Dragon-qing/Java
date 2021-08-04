package Demo1;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please input:");
        int a=sc.nextInt();
        System.out.println("please input:");
        int b=sc.nextInt();
        int result=a+b;
        System.out.println("结果是："+result);
    }
}
