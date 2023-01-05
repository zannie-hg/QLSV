package Controller;

import javax.swing.table.DefaultTableModel;

import Model.SinhVien;

import java.awt.event.*;
import View.AddSinhVien;

public class SinhVienController {
    private DefaultTableModel homeTable;
    AddSinhVien addView;

    public SinhVienController(DefaultTableModel homeTable) {
        this.homeTable = homeTable;
    }

    public void AddSinhVien() {
        addView = new AddSinhVien();
        addView.setVisible(true);
        // khi họ bấm add thì gọi tau
        addView.addAddButListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddSV(evt);
            }
        });
    }

    public void UpdateSinhVien() {

    }

    public void DeleteSinhVien() {

    }

    // listen event from addbut in AddView
    public void AddSV(ActionEvent e) {
        Object[] sv = new Object[4];
        // rứa bánh mì nớ là chi
        SinhVien svInfo = addView.getSinhVienInfo();
        sv[0] = svInfo.getId();
        sv[1] = svInfo.getName();
        sv[2] = svInfo.getAge();
        sv[3] = svInfo.getMark();
        homeTable.addRow(sv);
        addView.dispose();
    }

}
