package test;

import java.awt.*;
import javax.swing.*;

public class FlowLayouttest extends JFrame {
    JButton jButton1=new JButton("按钮1");
    JButton jButton2=new JButton("按钮2");
    JButton jButton3=new JButton("按钮3");
    JButton jButton4=new JButton("按钮4");
    JButton jButton5=new JButton("按钮5");
    JButton jButton6=new JButton("按钮6");
    public FlowLayouttest(){
        super("流式布局");
        setLayout(new FlowLayout(FlowLayout.LEFT,80,30));
        Container contentPane = getContentPane();
        contentPane.add(jButton1);
        contentPane.add(jButton2);
        contentPane.add(jButton3);
        contentPane.add(jButton4);
        contentPane.add(jButton5);
        contentPane.add(jButton6);
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new FlowLayouttest();
    }
}
