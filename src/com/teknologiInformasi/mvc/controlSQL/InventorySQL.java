/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknologiInformasi.mvc.controlSQL;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import com.teknologiInformasi.lib.koneksi.Configuration;
import com.teknologiInformasi.mvc.controlTable.InventoryControl_Table;
import com.teknologiInformasi.mvc.model.Inventory_model;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class InventorySQL {
    
    InventoryControl_Table user = new InventoryControl_Table();
    Configuration conf;
    
    public void reload() throws SQLException, ClassNotFoundException {
        conf = new Configuration();
        
        try {
           String sql = "SELECT * FROM inventories";
           conf.stm = (Statement) conf.conn.createStatement();
           conf.res = (ResultSet) conf.stm.executeQuery(sql);           
           while (conf.res.next()) {
               Inventory_model model = new Inventory_model();
               model.setInv_id(conf.res.getString(1));
               model.setInv_name(conf.res.getString(2));
               model.setInv_capital(conf.res.getString(3));
               model.setInv_sale(conf.res.getString(4));
               model.setInv_stock(conf.res.getString(5));
               user.insert(model);
           }           
           conf.res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public boolean insert(Inventory_model model) throws SQLException, ClassNotFoundException {
        conf = new Configuration();
        boolean status = true;
        
        try {
            String query = "INSERT INTO inventories VALUES ("
                    + "'" + model.getInv_id()+ "', "
                    + "'" + model.getInv_name()+ "', "
                    + "'" + model.getInv_capital()+ "', "
                    + "'" + model.getInv_sale()+ "', "
                    + "'" + model.getInv_stock()+ "')";
            conf.stm = (Statement) conf.conn.createStatement();
            conf.stm.executeUpdate(query);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            status = false;
        }
        
        return status;
    }
    
    public boolean update(Inventory_model model) throws SQLException, ClassNotFoundException {
        conf = new Configuration();
        boolean status = true;
        
        try {
            String query = "UPDATE inventories SET "
                    + "inv_name = '" + model.getInv_name()+ "', "
                    + "inv_capital = '" + model.getInv_capital()+ "', "
                    + "inv_sale = '" + model.getInv_sale()+ "', "
                    + "inv_stock = '" + model.getInv_stock()+ "' "
                    + "WHERE inv_id = '" + model.getInv_id()+ "'";
            conf.stm = (Statement) conf.conn.createStatement();
            conf.stm.executeUpdate(query);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            status = false;
        }
        
        return status;
    }
    
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        conf = new Configuration();
        boolean status = true;
        try {
            String query = "DELETE FROM inventories WHERE inv_id = '" + id +"'";
            conf.stm = (Statement) conf.conn.createStatement();
            conf.stm.executeUpdate(query);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            status = false;
        }
        
        return status;
    }
    
}
