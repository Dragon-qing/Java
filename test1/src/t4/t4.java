package t4;
import java.util.Scanner;
public class t4 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int a;
		int x;
		int t;
		int re=0;
		System.out.println("请输入a和x的值(x为几个数):");
		a=sc.nextInt();
		t=a;
		x=sc.nextInt();
		for(int i=0;i<x;i++) {
			re+=t;
			System.out.print(t);
			if(i+1!=x)
			System.out.print("+");
			t+=a*10;
			a*=10;
		}
		System.out.print("="+re);
		sc.close();
	}
}
