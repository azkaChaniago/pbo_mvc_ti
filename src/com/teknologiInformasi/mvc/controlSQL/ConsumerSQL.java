/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknologiInformasi.mvc.controlSQL;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import com.teknologiInformasi.lib.koneksi.Configuration;
import com.teknologiInformasi.mvc.controlTable.ConsumerControl_Table;
import com.teknologiInformasi.mvc.model.Consumer_model;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ConsumerSQL {
    
    ConsumerControl_Table user = new ConsumerControl_Table();
    Configuration conf;
    
    public void reload() throws SQLException, ClassNotFoundException {
        conf = new Configuration();
        
        try {
           String sql = "SELECT * FROM consumers";
           conf.stm = (Statement) conf.conn.createStatement();
           conf.res = (ResultSet) conf.stm.executeQuery(sql);           
           while (conf.res.next()) {
               Consumer_model model = new Consumer_model();
               model.setCon_id(conf.res.getString(1));
               model.setCon_name(conf.res.getString(2));
               model.setCon_phone(conf.res.getString(3));
               model.setCon_address(conf.res.getString(4));
               model.setCon_notes(conf.res.getString(5));
               user.insert(model);
           }           
           conf.res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public boolean insert(Consumer_model model) throws SQLException, ClassNotFoundException {
        conf = new Configuration();
        boolean status = true;
        
        try {
            String query = "INSERT INTO consumers VALUES ("
                    + "'" + model.getCon_id()+ "', "
                    + "'" + model.getCon_name()+ "', "
                    + "'" + model.getCon_phone()+ "', "
                    + "'" + model.getCon_address()+ "', "
                    + "'" + model.getCon_notes()+ "')";
            conf.stm = (Statement) conf.conn.createStatement();
            conf.stm.executeUpdate(query);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            status = false;
        }
        
        return status;
    }
    
    public boolean update(Consumer_model model) throws SQLException, ClassNotFoundException {
        conf = new Configuration();
        boolean status = true;
        
        try {
            String query = "UPDATE consumers SET "
                    + "con_name = '" + model.getCon_name()+ "', "
                    + "con_phone = '" + model.getCon_phone()+ "', "
                    + "con_address = '" + model.getCon_address()+ "', "
                    + "con_notes = '" + model.getCon_notes()+ "' "
                    + "WHERE con_id = '" + model.getCon_id()+ "'";
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
            String query = "DELETE FROM consumers WHERE con_id = '" + id +"'";
            conf.stm = (Statement) conf.conn.createStatement();
            conf.stm.executeUpdate(query);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            status = false;
        }
        
        return status;
    }
    
}
