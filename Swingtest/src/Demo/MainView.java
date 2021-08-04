package Demo;

import Demo.ext.MainViewTable;
import Demo.ext.MainViewTableModel;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Vector;

public class MainView extends JFrame {
    JPanel northPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
    JButton addBtn=new JButton("增加");
    JButton updateBtn=new JButton("修改");
    JButton delBtn=new JButton("删除");
    JTextField searchTxt=new JTextField(15);
    JButton searchBtn=new JButton("查询");
    JPanel southPanel=new JPanel(new FlowLayout(FlowLayout.RIGHT));
    JButton preBtn=new JButton("上一页");
    JButton nextBtn=new JButton("下一页");
    MainViewTable mainViewTable=new MainViewTable();
    public MainView() {
        super("主界面——学生信息管理系统");
        Container contentPane = getContentPane();
        //北部组件
        layoutNorth(contentPane);
        //设置中间的Jtable
        layoutCenter(contentPane);
        //南边的组件
        layoutSouth(contentPane);
        //设置图标
        URL imgUrl = MainView.class.getClassLoader().getResource("resources\\pkq.jpeg");
        setIconImage(new ImageIcon(imgUrl).getImage());

        //根据屏幕大小设置界面大小
        setBounds(DimensionUtil.getBonds());
        //充满整个屏幕
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void layoutCenter(Container contentPane) {
        Vector<Vector<Object>>data=new Vector<>();

        Vector<Object> rowVector1=new Vector<>();
        rowVector1.addElement("1");
        rowVector1.addElement("张三");
        rowVector1.addElement("男");
        rowVector1.addElement("计算机");

        Vector<Object> rowVector2=new Vector<>();
        rowVector2.addElement("2");
        rowVector2.addElement("徐娜");
        rowVector2.addElement("女");
        rowVector2.addElement("土木");

        Vector<Object> rowVector3=new Vector<>();
        rowVector3.addElement("3");
        rowVector3.addElement("张丽");
        rowVector3.addElement("女");
        rowVector3.addElement("外语");
        data.addElement(rowVector1);
        data.addElement(rowVector2);
        data.addElement(rowVector3);
        MainViewTableModel mainViewTableModel=MainViewTableModel.assembleModel(data);
        mainViewTable.setModel(mainViewTableModel);
        mainViewTable.renderRule();
        JScrollPane jScrollPane=new JScrollPane(mainViewTable);
        contentPane.add(jScrollPane,BorderLayout.CENTER);
    }

    private void layoutSouth(Container contentPane) {
        southPanel.add(preBtn);
        southPanel.add(nextBtn);
        contentPane.add(southPanel,BorderLayout.SOUTH);
    }

    private void layoutNorth(Container contentPane) {
        northPanel.add(addBtn);
        northPanel.add(updateBtn);
        northPanel.add(delBtn);
        northPanel.add(searchTxt);
        northPanel.add(searchBtn);
        contentPane.add(northPanel,BorderLayout.NORTH);
    }


//    public static void main(String[] args) {
//        new MainView();
//    }
}
