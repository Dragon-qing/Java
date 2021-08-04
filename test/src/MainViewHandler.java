
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
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
        JTextPane textPane = mainView.getTextPane();
        if("发送".equals(text)){
            JTextPane jTextPane=mainView.getSendMessage();
            String message=jTextPane.getText();
            message+="\n";
            jTextPane.setText("");
            Document docs=textPane.getDocument();
            try {

                docs.insertString(docs.getLength(), message,null);//对文本进行追加
            } catch (BadLocationException ex) {
                ex.printStackTrace();
            }
        } else if("返回".equals(text)){
            mainView.dispose();
        }
    }

}
