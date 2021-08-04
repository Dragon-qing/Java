package Swingdeom;

import javax.swing.*;
import java.awt.*;

public class test extends JFrame {
    public void CreateJFrame(String title){
        JFrame jf=new JFrame(title);
        Container container= jf.getContentPane();
        JLabel jl=new JLabel("这是一个JFrame窗口");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        container.setBackground(Color.orange);
        jf.setVisible(true);
        jf.setSize(300,200);
        jf.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new test().CreateJFrame("JF窗口");
    }
}
