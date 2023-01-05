package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Model.SinhVien;

import java.awt.event.*;

public class AddSinhVien extends JFrame {
    private JPanel mainPanel;
    private JLabel label, masvlab, hotenlab, tuoilab, diemlab;
    private JButton addBut, updateBut, deleteBut;
    private JTextField masvTextField, hotenTextField, tuoiTextField, diemTextField;

    public AddSinhVien() {
        initcomponents();
    }

    // java gợi ý hết đừng ngại đăt biến dài
    public void initcomponents() {

        // textfield
        masvTextField = new JTextField();
        masvTextField.setBounds(125, 100, 200, 20);

        hotenTextField = new JTextField();
        hotenTextField.setBounds(125, 150, 200, 20);

        tuoiTextField = new JTextField();
        tuoiTextField.setBounds(125, 200, 200, 20);

        diemTextField = new JTextField();
        diemTextField.setBounds(125, 250, 200, 20);

        // label
        label = new JLabel("VUI LÒNG NHẬP ĐỦ VÀ CHÍNH XÁC CÁC THÔNG TIN SAU:");
        masvlab = new JLabel("Mã SV:");
        hotenlab = new JLabel("Họ và tên:");
        tuoilab = new JLabel("Tuổi:");
        diemlab = new JLabel("Điểm TK:");
        label.setBounds(20, 49, 400, 20);
        masvlab.setBounds(20, 100, 75, 20);
        hotenlab.setBounds(20, 150, 75, 20);
        tuoilab.setBounds(20, 200, 75, 20);
        diemlab.setBounds(20, 250, 75, 20);
        // submit
        addBut = new JButton("Add");
        addBut.setBounds(125, 300, 80, 20);

        // main panel
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBounds(0, 0, 400, 400);
        mainPanel.add(masvTextField);
        mainPanel.add(hotenTextField);
        mainPanel.add(tuoiTextField);
        mainPanel.add(diemTextField);
        mainPanel.add(label);
        mainPanel.add(masvlab);
        mainPanel.add(hotenlab);
        mainPanel.add(tuoilab);
        mainPanel.add(diemlab);
        mainPanel.add(addBut);

        getContentPane().add(mainPanel);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400, 400);
        setPreferredSize(getSize());
        pack();
        // setVisible(true);
    }

    public void addAddButListener(ActionListener listener){
        addBut.addActionListener(listener);
    }
    public  SinhVien getSinhVienInfo(){
        // minh se lam cai show message o day, neu ko dung form thi se deo cho get
        try {
            String masv = masvTextField.getText();
            String hoten = hotenTextField.getText();
            int age = Integer.parseInt(tuoiTextField.getText());
            Double mark = Double.parseDouble(diemTextField.getText());
            if (age <= 0 || age >100){
                JOptionPane.showMessageDialog(null, "Vui long nhap tuoi trong khoang 0 - 100", "Wrong format", JOptionPane.WARNING_MESSAGE);
            }else if (mark < 0 || mark >10){
                JOptionPane.showMessageDialog(null, "Vui long nhap diem trong khoang 0 - 10", "Wrong format", JOptionPane.WARNING_MESSAGE);
            }else{
                return new SinhVien(masvTextField.getText(), hotenTextField.getText(),Integer.parseInt(tuoiTextField.getText()), Double.parseDouble(diemTextField.getText()));
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() , "Wrong format", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }

}
