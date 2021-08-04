package t1;
import java.io.*;
public class test {
	public static void main(String []args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try{
			fis=new FileInputStream("D://HelloWorld.java");
			fos=new FileOutputStream("D://HW.java");
			byte []bytes=new byte[1024];
			int len=0;
			while((len=fis.read(bytes))!=-1) {
				fos.write(bytes,0,len);
			}
		}catch(IOException e) {
					e.printStackTrace();
		}finally {
			try {
				
				fis.close();
				fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
