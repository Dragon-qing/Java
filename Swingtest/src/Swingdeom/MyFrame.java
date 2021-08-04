package Swingdeom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyJDialog extends JDialog {
    public MyJDialog(MyFrame frame){
        super(frame,"JDialog窗口",true);
        Container container=getContentPane();
        container.add(new JLabel("这是一个对话框"));
        setBounds(120,120,100,100);
    }
}
public class MyFrame extends JFrame{
    public MyFrame(){
        Container container=getContentPane();
        container.setLayout(null);
        JLabel jl=new JLabel("这是窗口");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        JButton jb=new JButton("弹出对话框");
        jb.setBounds(100,10,100,21);
        jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new MyJDialog(MyFrame.this).setVisible(true);
            }
        });
        container.add(jb);
        setVisible(true);
        setSize(300,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
