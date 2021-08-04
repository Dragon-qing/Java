package t4;

import java.util.ArrayList;
import java.util.Random;

public class t4Test {
	public static void main(String []args) {
		Random r=new Random();
		int []arr=new int[10];
		ArrayList<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			arr[i]=r.nextInt(100)+1;
			if(arr[i]>=10) {
				list.add(arr[i]);
			}
		}
		System.out.println("arr:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("list:");
		System.out.println(list);
	}
}
