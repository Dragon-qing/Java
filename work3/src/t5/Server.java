package t5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8888);
        Socket socket=server.accept();
        OutputStream os=socket.getOutputStream();
        InputStream is = socket.getInputStream();
        FileOutputStream fos=new FileOutputStream("D:\\a.jpg");
        int len=0;
        byte []bytes=new byte[1024];
        while((len=is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        os.write("上传成功".getBytes());
        server.close();
        socket.close();
        fos.close();
    }
}
