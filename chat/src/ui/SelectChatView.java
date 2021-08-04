package ui;

import ui.handler.SelectChatViewHandler;

import javax.swing.*;
import java.awt.*;

public class SelectChatView extends JFrame {
    JButton pChatBtn=new JButton("私聊");
    JButton gChatBtn=new JButton("群聊");
    JPanel centerPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
    SelectChatViewHandler selectChatViewHandler;
    public SelectChatView(){
        super("功能选择");
        selectChatViewHandler=new SelectChatViewHandler(this);
        Container contentPane = getContentPane();
        //添加组件
        gChatBtn.setPreferredSize(new Dimension(170,50));
        gChatBtn.addActionListener(selectChatViewHandler);
        centerPanel.add(gChatBtn);
        pChatBtn.setPreferredSize(new Dimension(170,50));
        pChatBtn.addActionListener(selectChatViewHandler);
        centerPanel.add(pChatBtn);
        contentPane.add(centerPanel,BorderLayout.CENTER);


        //设置默认大小
        setSize(300,180);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SelectChatView();
    }
}
