/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknologiInformasi.mvc.view;

import com.teknologiInformasi.mvc.controlSQL.ConsumerSQL;
import com.teknologiInformasi.mvc.controlSQL.InventorySQL;
import com.teknologiInformasi.mvc.controlSQL.UserSQL;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) {
        UserSQL user_sql = new UserSQL();
        InventorySQL inv_sql = new InventorySQL();
        ConsumerSQL con_sql = new ConsumerSQL();

        try {
            user_sql.reload();
            inv_sql.reload();
            con_sql.reload();

            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new FormLogin().setVisible(true);
//            new MenuUtama().setVisible(true);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
