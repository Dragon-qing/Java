package test;
import java.util.Scanner;
public class Demo02Anonymous {
    public static void main(String[] args) {
//        int num=new Scanner(System.in).nextInt();
//        System.out.println("num的值是："+num);
//        methodParam(new Scanner(System.in));
        Scanner sc = methodReturn();
        int num=sc.nextInt();
        System.out.println("num的值："+num);
    }
    public static void methodParam(Scanner sc){
        int i = sc.nextInt();
        System.out.println("i的值："+i);
    }
    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
