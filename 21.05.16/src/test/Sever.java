package test;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class Sever {

    public static void main(String []args) {
        int port=1758;
        File file=new File("D:\\java\\a.jpg");
        try {
            ServerSocket sever=new ServerSocket(port);
            Socket socket=sever.accept();
            SocketAddress socketaddress=sever.getLocalSocketAddress();
            InputStream in=InputStream();
            OutputStream out=OutputStream();
            FileOutputStream outs=new FileOutputStream(file);
            byte []b=new byte[port];
            int index=0;
            while((index=in.read(b))!=-1) {
                outs.write(b);
            }
            sever.close();
            socket.close();
            in.close();
            out.close();
            outs.close();
            System.out.println("上传成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static OutputStream OutputStream() {
        // TODO Auto-generated method stub
        return null;
    }

    private static InputStream InputStream() {
        // TODO Auto-generated method stub
        return null;
    }
}