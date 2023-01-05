package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class Home extends JFrame{
    public JPanel panel;
    public JLabel titleLabel;
    public JScrollPane scrollPane;
    public JTable sinhVienTable;
    public JButton addButton, deleteButton;
    public DefaultTableModel tableModel;

    public Home() {
        initcomponents();
    }

    public void initcomponents(){
        //label
        titleLabel = new JLabel("DANH SÁCH SINH VIÊN:");
        titleLabel.setBounds(240,20,154, 28);
        
        //sinh vien table
        String[] columnName = { "Mã SV", "Họ và tên", "Tuổi", "Điểm TK", };
        tableModel = new DefaultTableModel(columnName, 0);
        sinhVienTable = new JTable(tableModel);
        Object[] row = {"21IT000", "Minh Fee", 17, 10};

        //scrollpane
        scrollPane = new JScrollPane(sinhVienTable);
        scrollPane.setBounds(50, 54, 500, 296);

        //add btn
        addButton = new JButton("ADD");
        addButton.setBounds(150, 368, 100, 23);
        
        //deletebutton
        deleteButton = new JButton("Delete");
        deleteButton.setBounds(300, 368, 100, 23);

        //panel
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,600,500);
        panel.add(scrollPane);
        panel.add(titleLabel);
        panel.add(addButton);
        panel.add(deleteButton);

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(600,500);
        setPreferredSize(getSize());
        getContentPane().add(panel);
        pack();
    }

    public void addAddSinhVienListener(ActionListener listener){
        addButton.addActionListener(listener);
    }

    public void addDeleteSinhVienListener(ActionListener listener){
        deleteButton.addActionListener(listener);
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }

    public void setTableModel(DefaultTableModel tableModel) {
        this.tableModel = tableModel;
    }

    public JTable getSinhVienTable() {
        return sinhVienTable;
    }

    public void setSinhVienTable(JTable sinhVienTable) {
        this.sinhVienTable = sinhVienTable;
    }
}
