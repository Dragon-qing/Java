package test;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.util.Vector;

public class JtableDemo extends JFrame {
    public JtableDemo() {
        super("测试jtable");

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

        StudentTableModel studentTableModel = StudentTableModel.assembleModel(data);
        JTable jTable=new JTable(studentTableModel);
        //设置表头
        JTableHeader tableHeader=jTable.getTableHeader();
        tableHeader.setFont(new Font(null,Font.BOLD,16));
        tableHeader.setForeground(Color.RED);
        //设置表格体
        jTable.setFont(new Font(null,Font.PLAIN,14));
        jTable.setForeground(Color.BLACK);
        jTable.setGridColor(Color.black);
        jTable.setRowHeight(30);
        //设置多行选择
        jTable.getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        //设置表格列的渲染
        Vector<String> columns = StudentTableModel.getColumns();
        StudentCellRender studentCellRender=new StudentCellRender();
        for (int i = 0; i < columns.size(); i++) {
            TableColumn column=jTable.getColumn(columns.get(i));
            column.setCellRenderer(studentCellRender);
        }


        Container contentPane = getContentPane();
        JScrollPane jScrollPane=new JScrollPane(jTable);
        contentPane.add(jScrollPane);

        setSize(600,400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JtableDemo();
    }
}
//自定义tableModel
class StudentTableModel extends DefaultTableModel{
    static Vector<String> columns=new Vector<>();
    static{
        columns.addElement("学号");
        columns.addElement("姓名");
        columns.addElement("性别");
        columns.addElement("学院");
    }
    private StudentTableModel(){
        super(null,columns);
    }
    private static StudentTableModel studentTableModel=new StudentTableModel();
    public static StudentTableModel assembleModel(Vector<Vector<Object>>data){
        studentTableModel.setDataVector(data,columns);
        return studentTableModel;
    }

    public static Vector<String> getColumns() {
        return columns;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}
class StudentCellRender extends DefaultTableCellRenderer {
    //每一行每一列显示之前都会调用
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if(row%2==0){
            setBackground(Color.LIGHT_GRAY);
        }else {
            setBackground(Color.white);
        }
        setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
