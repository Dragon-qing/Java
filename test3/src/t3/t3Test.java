package t3;
import java.io.*;
public class t3Test {
	public static void main(String []args) {
		try(
				BufferedReader br=new BufferedReader(new FileReader("D://HelloWorld.java"));
				BufferedWriter bw=new BufferedWriter(new FileWriter("D://HelloWorld.bak"))
				){
			int len=0;
			char[]arr=new char[1024];
			while((len=br.read(arr))!=-1) {
				bw.write(arr,0,len);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
