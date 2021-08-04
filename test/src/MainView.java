import javax.swing.*;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class MainView extends JFrame {
    JTextPane textPane=new JTextPane();
    JPanel northPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
    JPanel southPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
    JButton sendBtn=new JButton("发送");
    JButton backBtn=new JButton("返回");
    JTextPane sendMessage=new JTextPane();
    MainViewHandler mainViewHandler;

    public JTextPane getTextPane() {
        return textPane;
    }


    public JTextPane getSendMessage() {
        return sendMessage;
    }

    public MainView(){
        super("聊天室");
        mainViewHandler=new MainViewHandler(this);
        Container contentPane = getContentPane();


        //中部布局
        textPane.setEnabled(false);
        Font font=new Font("宋体",Font.BOLD,20);
        textPane.setFont(font);
        textPane.setDisabledTextColor(Color.black);
        textPane.setBackground(Color.white);
        //JScrollPane jScrollPane=new JScrollPane(textPane);
        contentPane.add(textPane,BorderLayout.CENTER);

        //北部布局
        backBtn.addActionListener(mainViewHandler);
        northPanel.add(backBtn);
        contentPane.add(northPanel,BorderLayout.NORTH);

        //南部布局
        sendMessage.setPreferredSize(new Dimension(200,50));
        JScrollPane jScrollPane1=new JScrollPane(sendMessage);
        southPanel.add(jScrollPane1);
        sendBtn.addActionListener(mainViewHandler);
        southPanel.add(sendBtn);
        contentPane.add(southPanel,BorderLayout.SOUTH);


        //设置窗体默认大小
        setSize(800,600);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {


        new MainView();
    }
}
