package Demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TcpSever {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8888);
        Socket socket=server.accept();
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        int len=0;
        byte []bytes=new byte[1024];
        len=is.read(bytes);
        System.out.println(new String (bytes,0,len));
        os.write("服务器收到！！！".getBytes(StandardCharsets.UTF_8));
        server.close();
        socket.close();
    }
}
