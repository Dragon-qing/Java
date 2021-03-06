package TCPsever;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPSeverThread {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8081);
        while(true){
            Socket socket=server.accept();
            new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            try{
                                InputStream is = socket.getInputStream();
//        byte[]bytes=new byte[1024];
//        int len=0;
//        while((len=is.read(bytes))!=-1){
//            System.out.println(new String(bytes,0,len));
//        }
                                BufferedReader br=new BufferedReader(new InputStreamReader(is));
                                String line=br.readLine();
                                String[] arr=line.split(" ");
                                String htmlpath=arr[1].substring(1);
                                System.out.println(htmlpath);
                                FileInputStream fis=new FileInputStream(htmlpath);
                                OutputStream os = socket.getOutputStream();
                                os.write("HTTP/1.1 200 OK\r\n".getBytes());
                                os.write("Content-Type:text/html\r\n".getBytes());
                                os.write("\r\n".getBytes());
                                int len=0;
                                byte[]bytes=new byte[1024];
                                while((len=fis.read(bytes))!=-1){
                                    os.write(bytes,0,len);
                                }
                                fis.close();
                                socket.close();
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    }
            ).start();

        }
        //server.close();
    }
}
