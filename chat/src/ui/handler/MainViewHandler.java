package ui.handler;
import ui.LoginView;
import ui.MainView;
import ui.SelectChatView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainViewHandler extends KeyAdapter implements ActionListener{
    private MainView mainView;
    public MainViewHandler(MainView mainView){this.mainView=mainView;}
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();
        String text = jButton.getText();
        if("ει".equals(text)){

        }else if("θΏε".equals(text)){
            mainView.dispose();
            new SelectChatView();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(KeyEvent.VK_ENTER==e.getKeyCode()){

        }
    }
}
