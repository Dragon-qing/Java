package Demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",8888);
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        int len=0;
        byte[] bytes=new byte[1024];
        os.write("你好服务器！！！".getBytes(StandardCharsets.UTF_8));
        len=is.read(bytes);
        System.out.println(new String(bytes,0,len));
        socket.close();
    }
}
