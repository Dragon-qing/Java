package t2;
import java.io.*;
public class test {
	public static void main(String[]args) {
		try(
			FileReader fr=new FileReader("HelloWorld.java");
				){
			int len=0;
			char []arr=new char[1024];
			while((len=fr.read(arr))!=-1) {
				System.out.println(new String(arr,0,len));
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
