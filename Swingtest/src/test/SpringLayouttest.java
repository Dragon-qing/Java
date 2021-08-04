package test;

import javax.swing.*;
import java.awt.*;
import java.security.DigestException;

public class SpringLayouttest extends JFrame {
    SpringLayout springLayout=new SpringLayout();
    JPanel jPanel=new JPanel(springLayout);
    JLabel titleLable=new JLabel("文章标题:");
    JTextField titleText=new JTextField();
    JLabel authorLable=new JLabel("作者:");
    JTextField authorText=new JTextField();
    JLabel contLable=new JLabel("内容:");
    JTextArea contArea=new JTextArea(4,10);
    public SpringLayouttest() {
        super("弹簧布局");
        jPanel.add(titleLable);
        titleText.setPreferredSize(new Dimension(200,30));
        jPanel.add(titleText);
        authorText.setPreferredSize(new Dimension(200,30));
        jPanel.add(authorLable);
        jPanel.add(authorText);
        jPanel.add(contLable);

        jPanel.add(contArea);
        SpringLayout.Constraints titleLablec = springLayout.getConstraints(titleLable);
        titleLablec.setX(Spring.constant(100));
        titleLablec.setY(Spring.constant(50));
        SpringLayout.Constraints titleTexc=springLayout.getConstraints(titleText);
        Spring titleLableEastSpring=titleLablec.getConstraint(SpringLayout.EAST);
        titleTexc.setConstraint(SpringLayout.WEST,Spring.sum(titleLableEastSpring,Spring.constant(20)));
        titleTexc.setConstraint(SpringLayout.NORTH,titleLablec.getConstraint(SpringLayout.NORTH));
        springLayout.putConstraint(SpringLayout.EAST,authorLable,0,springLayout.EAST,titleLable);
        springLayout.putConstraint(SpringLayout.NORTH,authorLable,20,SpringLayout.SOUTH,titleLable);
        springLayout.putConstraint(SpringLayout.WEST,authorText,0,SpringLayout.WEST,titleText);
        springLayout.putConstraint(SpringLayout.NORTH,authorText,0,SpringLayout.NORTH,authorLable);
        springLayout.putConstraint(SpringLayout.EAST,contLable,0,springLayout.EAST,titleLable);
        springLayout.putConstraint(SpringLayout.NORTH,contLable,20,SpringLayout.SOUTH,authorLable);
        springLayout.putConstraint(SpringLayout.WEST,contArea,0,SpringLayout.WEST,titleText);
        springLayout.putConstraint(SpringLayout.NORTH,contArea,0,SpringLayout.NORTH,contLable);
        springLayout.putConstraint(SpringLayout.SOUTH,contArea,-20,SpringLayout.SOUTH,jPanel);
        springLayout.putConstraint(SpringLayout.EAST,contArea,-20,SpringLayout.EAST,jPanel);

        Container contentPane = getContentPane();
        contentPane.add(jPanel);
        setSize(600,400);
        setVisible(true);
        setResizable(true);
        setLocationRelativeTo(null);
        jPanel.setBackground(Color.orange);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SpringLayouttest();
    }
}
