package t4;

public class MyMath {
public static int max(int a,int b,int c) {
		if(a>b) {
			if(a>c)return a;
			else return c;
		}else if(a>c) {
			return b;
		}else {
			if(b>c)return b;
			else return c;
		}
}
}
