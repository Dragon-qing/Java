package Demo;

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
            loginView.getPwdField().setText("");
        }else if("登录".equals(text)){
            login();
        }
    }

    private void login() {
        String user=loginView.getUserText().getText();
        char[] chars = loginView.getPwdField().getPassword();
        String pwd=new String(chars);
        System.out.println(pwd);
        //查询DB
        boolean flag=true;
        if(flag){
            new MainView();
            loginView.dispose();
        }else{
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
