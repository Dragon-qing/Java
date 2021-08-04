package t2;

public class t2 {
	public static void main(String []args) {
		int count =0;
		for(int i=1;i<=100;i++) {
			if(isPrime(i)) {
				System.out.print(i+"\t");
				count++;
				if(count%5==0) {
					System.out.println();
				}
			}
		}
	}
	private static boolean isPrime (int x) {
		if(x==1)return false;
		if(x==2||x==3)return true;
		if(x%6!=1&&x%6!=5)return false;
		for(int i=5;i<=Math.sqrt(x);i+=6) {
			if(x%i==0||x%(i+2)==0) {
				return false;
			}
		}
		return true;
	}
}
