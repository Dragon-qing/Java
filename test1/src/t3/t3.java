package t3;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class t3 {
	public static void main(String []args) {
		int x=0;
		ArrayList<Integer>a=new ArrayList<>();
		ArrayList<Integer>b=new ArrayList<>();
		Random r=new Random();
		while(b.size()!=7) {
			Integer temp=r.nextInt(30)+1;
			if(!b.contains(temp)) {
				b.add(temp);
			}
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("please input seven numbers:");
		while(a.size()!=7) {
			x=sc.nextInt();
			if(!a.contains(x)&&(x>=1&&x<=30)) {				
				a.add(x);
			}else {
				System.out.println("数据违法，应为1-30且不重复");
			}
		}
		int re=judg(a,b);
		System.out.print("中奖号码为："+b);		
		System.out.println("\r\n您中了"+re+"个号！！");
		switch(re) {
		case 7:
			System.out.println("一等奖");
			break;
		case 6:
			System.out.println("二等奖");
			break;
		case 5:
			System.out.println("三等奖");
			break;
		default:
			System.out.println("未中奖");
		}
		sc.close();
	}
	private static int judg(ArrayList<Integer>a,ArrayList<Integer>b) {
		int count=0;
		for(int i=0;i<a.size();i++) {
			Integer t=a.get(i);
			if(b.contains(t)) {
				count++;
			}
		}
		return count;
	}
}
