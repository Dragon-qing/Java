package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[]args)throws IOException{
		Socket socket=new Socket("127.0.0.1",9999);
		OutputStream os=socket.getOutputStream();
		os.write("请求连接！！！".getBytes());
		socket.shutdownOutput();
		InputStream is=socket.getInputStream();
		byte[]bytes=new byte[1024];
		int len=0;
		while((len=is.read(bytes))!=-1) {
			System.out.println(new String(bytes, 0, len));
		}
		socket.close();
	}
}

