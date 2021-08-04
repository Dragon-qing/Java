package t5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",8888);
        FileInputStream fis=new FileInputStream("1.jpg");
        OutputStream os = socket.getOutputStream();
        InputStream is = socket.getInputStream();
        int len=0;
        byte []bytes=new byte[1024];
        while((len=fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        socket.shutdownOutput();
        len=is.read(bytes);
        System.out.println(new String(bytes,0,len));
        fis.close();
        socket.close();
    }
}
