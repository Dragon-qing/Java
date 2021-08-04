package ui.handler;
import ui.LoginView;
import ui.MainView;
import ui.SelectChatView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoginHandler extends KeyAdapter implements ActionListener {
    private LoginView loginView;
    public LoginHandler(LoginView loginView) {
        this.loginView=loginView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();
        String text=jButton.getText();
        if("重置".equals(text)){
            loginView.getUserText().setText("");
        }else if("登录".equals(text)){
            login();
        }
    }

    private void login() {
        String user=loginView.getUserText().getText();
        //登录验证
        boolean flag = true;
        if(flag){
            //验证通过
            new SelectChatView();
            loginView.dispose();
        }else{
            //验证失败
            JOptionPane.showMessageDialog(loginView,"用户名密码错误");
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(KeyEvent.VK_ENTER==e.getKeyCode()){
            login();
        }
    }
}

