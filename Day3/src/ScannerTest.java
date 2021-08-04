import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args){
        System.out.println("please input a number:1");
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        System.out.println(num);
        double n2=scan.nextDouble();
        System.out.println(n2);
    }
}
