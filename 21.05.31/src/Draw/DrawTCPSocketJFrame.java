package Draw;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;
public class DrawTCPSocketJFrame extends JFrame implements MouseListener,MouseMotionListener,Runnable{
    private Point start,end;
    private Canvas canvas;
    private Socket socket;
    private ObjectOutputStream objout;
    public DrawTCPSocketJFrame(String name)throws IOException{
        super("同步画布"+name+" "+InetAddress.getLocalHost().toString());
        this.setBounds(400,300,580,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.start=this.end=null;
        this.canvas=new DrawCanvas();
        this.getContentPane().add(this.canvas);
        this.canvas.addMouseListener(this);
        this.canvas.addMouseMotionListener(this);
        this.setVisible(true);
        this.objout=null;
    }
    public DrawTCPSocketJFrame(String name,String host,int port)throws IOException{
        this(name);
        Socket socket=new Socket(host,port);
        this.setTitle(this.getTitle()+":"+socket.getLocalPort());
        this.setSocket(socket);
    }
    public void setSocket(Socket socket)throws IOException{
        this.socket=socket;
        this.objout=new ObjectOutputStream(this.socket.getOutputStream());
        new Thread(this).start();
    }
    public void run() {
        try {
            ObjectInputStream objin = new ObjectInputStream(this.socket.getInputStream());
            while (true) {
                try {
                    this.start = this.end;
                    this.end = (Point) objin.readObject();
                    this.canvas.repaint();
                } catch (EOFException e) {
                    break;
                }
            }
            objin.close();
            this.objout.close();
            this.socket.close();
        } catch (IOException | ClassNotFoundException e) { }
    }
    public void mousePressed(MouseEvent event){
        this.start=null;
        this.end=new Point(event.getX(),event.getY());
        try{
            if(this.objout!=null)
                this.objout.writeObject(this.end);
        }catch(IOException ex){}
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    @Override
    public void mouseReleased(MouseEvent event){}
    public void mouseMoved(MouseEvent event){
    }
    public void mouseDragged(MouseEvent event){
        this.start=this.end;
        this.end=new Point(event.getX(),event.getY());
        this.canvas.repaint();
        try{
            if(this.objout!=null)
                this.objout.writeObject(this.end);
        }catch(IOException ex){}
    }
    private class DrawCanvas extends Canvas{
        public void paint(Graphics g){
            if(start !=null&&end !=null){
                g.setColor(Color.blue);
                g.drawLine(start.x,start.y,end.x,end.y);
            }
        }
        public void update(Graphics g){
            this.paint(g);
        }
    }
    public static void main(String []args) throws IOException {
        new DrawTCPSocketJFrame("小蜜蜂","127.0.0.1",10011);
    }
}
