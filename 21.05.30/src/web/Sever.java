package web;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
    public static void main(String[] args) throws IOException {
        ServerSocket sever=new ServerSocket(8081);
        Socket socket = sever.accept();
        InputStream is=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len=0;
        while((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
    }
}
