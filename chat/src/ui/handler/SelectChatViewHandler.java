package ui.handler;

import ui.LoginView;
import ui.MainView;
import ui.SelectChatView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;

public class SelectChatViewHandler extends KeyAdapter implements ActionListener {
    private SelectChatView selectChatView;
    public SelectChatViewHandler(SelectChatView selectChatView){this.selectChatView=selectChatView;}
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();
        String text = jButton.getText();
        if("群聊".equals(text)){
            selectChatView.dispose();
            new MainView();
        }else if("私聊".equals(text)){
            selectChatView.dispose();
            new MainView();
        }
    }
}
