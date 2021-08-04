package ui;

import ui.handler.LoginHandler;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {
    JLabel nameLabel=new JLabel("聊天室",JLabel.CENTER);
    SpringLayout springLayout=new SpringLayout();
    JPanel centerPanel=new JPanel(springLayout);
    JLabel userNameLabel=new JLabel("用户名:");
    JTextField userText=new JTextField();
    JButton loginBtn=new JButton("登录");
    JButton resetBtn=new JButton("重置");

    LoginHandler loginHandler;
    public LoginView() {
        super("聊天室");
        loginHandler=new LoginHandler(this);
        Container contentPane = getContentPane();
        nameLabel.setFont(new Font("华文行楷",Font.PLAIN,40));
        nameLabel.setPreferredSize(new Dimension(0,80));
        Font centerFont=new Font("楷体",Font.PLAIN,20);
        userNameLabel.setFont(centerFont);
        userText.setPreferredSize(new Dimension(200,30));
        loginBtn.setFont(centerFont);
        resetBtn.setFont(centerFont);


        //组件加入面板
        centerPanel.add(userNameLabel);
        centerPanel.add(userText);
        loginBtn.addActionListener(loginHandler);
        loginBtn.addKeyListener(loginHandler);
        centerPanel.add(loginBtn);
        resetBtn.addActionListener(loginHandler);
        centerPanel.add(resetBtn);


        //弹簧布局
        layoutCenter();

        //边界布局
        contentPane.add(nameLabel,BorderLayout.NORTH);
        contentPane.add(centerPanel,BorderLayout.CENTER);
        //设置默认按钮
        getRootPane().setDefaultButton(loginBtn);

        //设置默认大小
        setSize(600,400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void layoutCenter() {
        //userNameLabel
        Spring childWith = Spring.sum(Spring.sum(Spring.width(userNameLabel), Spring.width(userText)), Spring.constant(20));
        int offsetX = childWith.getValue() / 2;
        springLayout.putConstraint(SpringLayout.WEST,userNameLabel,-offsetX,
                SpringLayout.HORIZONTAL_CENTER,centerPanel);
        springLayout.putConstraint(SpringLayout.NORTH,userNameLabel,20,SpringLayout.NORTH,centerPanel);
        //userTxt
        springLayout.putConstraint(SpringLayout.WEST,userText,20,SpringLayout.EAST,userNameLabel);
        springLayout.putConstraint(SpringLayout.NORTH,userText,0,SpringLayout.NORTH,userNameLabel);

        //loginBtn
        springLayout.putConstraint(SpringLayout.WEST,loginBtn,50,SpringLayout.WEST,userNameLabel);
        springLayout.putConstraint(SpringLayout.NORTH,loginBtn,20,SpringLayout.SOUTH,userNameLabel);
        //resetBtn
        springLayout.putConstraint(SpringLayout.WEST,resetBtn,50,SpringLayout.EAST,loginBtn);
        springLayout.putConstraint(SpringLayout.NORTH,resetBtn,0,SpringLayout.NORTH,loginBtn);

    }

    public JTextField getUserText() {
        return userText;
    }


    public static void main(String[] args) {
        new LoginView();
    }
}
