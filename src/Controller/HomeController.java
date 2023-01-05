package Controller;

import View.AddSinhVien;
import View.Home;

import java.awt.event.*;

import javax.swing.table.DefaultTableModel;

public class HomeController {
    private SinhVienController sinhVienController;
    private Home homeView;

    public HomeController () {
        this.homeView = new Home();
        sinhVienController = new SinhVienController(homeView.getTableModel());
        init();
    }

    public void ShowHomeView() {
        homeView.setVisible(true);
    }

    public void init() {
        homeView.addAddSinhVienListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddButtonListenr(evt);
            }
        });
        homeView.addDeleteSinhVienListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                DeleteButtonListener(evt);
            }
        });
    }

    // listen event from addbut in homeview
    public void AddButtonListenr(ActionEvent e) {
        System.out.println("AddSV");
        sinhVienController.AddSinhVien();
    }

    // listen event from delbut in homeview
    public void DeleteButtonListener(ActionEvent e) {
        int[] deleteRows = homeView.getSinhVienTable().getSelectedRows();
        DefaultTableModel homeTable = homeView.getTableModel();
        for (int i = deleteRows.length - 1; i >= 0; i--) {
            homeTable.removeRow(deleteRows[i]);
        }
    }
}
