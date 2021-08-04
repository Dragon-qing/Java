package test;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest extends JFrame {
    JButton northB=new JButton("北边的按钮");

    public BorderLayoutTest() {
        super("测试边界窗体");
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(northB,BorderLayout.NORTH);

        setSize(600,400);
        setVisible(true);
        //jf.setLocationRelativeTo(null);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int offsetx=(screenSize.width-300)/2;
        int offsety=(screenSize.height-200)/2;
        setLocation(offsetx,offsety);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public static void main(String[] args) {
        new BorderLayoutTest();
    }
}
