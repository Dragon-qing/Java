package test;

import javax.swing.*;
import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        JFrame jf=new JFrame("窗口");
        jf.setSize(300,200);
        jf.setVisible(true);
        //jf.setLocationRelativeTo(null);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int offsetx=(screenSize.width-300)/2;
        int offsety=(screenSize.height-200)/2;
        jf.setLocation(offsetx,offsety);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
    }
}
