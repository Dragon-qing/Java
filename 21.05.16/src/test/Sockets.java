package test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Sockets {
    public static void main(String []args) {
        String ip="192.168.0.1";
        int port=1758;
        File file=new File("D:\\1.jpg");
        try {
            Socket socket=new Socket(ip,port);
            FileInputStream ins=new FileInputStream(file);
            InputStream in=socket.getInputStream();
            OutputStream out=socket.getOutputStream();
            byte []b=new byte[(int) (file.length()+10)];
            int index=0;
            while((index=ins.read(b))!=-1) {
                out.write(b);
            }
            socket.close();
            ins.close();
            in.close();
            out.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
