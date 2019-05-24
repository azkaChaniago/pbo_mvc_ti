/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknologiInformasi.mvc.controlSQL;

import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import com.teknologiInformasi.lib.koneksi.Configuration;
import com.teknologiInformasi.mvc.controlTable.UserControl_Table;
import com.teknologiInformasi.mvc.model.User_model;
import com.teknologiInformasi.mvc.view.FormPengguna;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class UserSQL {
    
    UserControl_Table user = new UserControl_Table();
    Configuration conf;
    
    public void reload() throws SQLException, ClassNotFoundException {
        conf = new Configuration();
        
        try {
           String sql = "SELECT * FROM users";
           conf.stm = (Statement) conf.conn.createStatement();
           conf.res = (ResultSet) conf.stm.executeQuery(sql);           
           while (conf.res.next()) {
               User_model model = new User_model();
               model.setUser_id(conf.res.getString(1));
               model.setUser_name(conf.res.getString(2));
               model.setUser_address(conf.res.getString(4));
               model.setUser_phone(conf.res.getString(5));
               model.setUser_auth(conf.res.getString(6));
               user.insert(model);
           }           
           conf.res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public boolean insert(User_model model) throws SQLException, ClassNotFoundException {
        conf = new Configuration();
        boolean status = true;
        
        try {
            String query = "INSERT INTO users VALUES ("
                    + "'" + model.getUser_id() + "', "
                    + "'" + model.getUser_name() + "', "
                    + "'" + model.getUser_password() + "', "
                    + "'" + model.getUser_address() + "', "
                    + "'" + model.getUser_phone() + "', "
                    + "'" + model.getUser_auth() + "') ";
            conf.stm = (Statement) conf.conn.createStatement();
            conf.stm.executeUpdate(query);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            status = false;
        }
        
        return status;
    }
    
    public boolean update(User_model model) throws SQLException, ClassNotFoundException {
        conf = new Configuration();
        boolean status = true;
        
        try {
            String query = "UPDATE users SET "
                    + "user_name = '" + model.getUser_name() + "', "
                    + "user_password = '" + model.getUser_password()+ "', "
                    + "user_address = '" + model.getUser_address()+ "', "
                    + "user_phone = '" + model.getUser_phone()+ "', "
                    + "user_auth = '" + model.getUser_auth()+ "' "
                    + "WHERE user_id = '" + model.getUser_id() + "'";
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
            String query = "DELETE FROM users WHERE user_id = '" + id +"'";
            conf.stm = (Statement) conf.conn.createStatement();
            conf.stm.executeUpdate(query);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            status = false;
        }
        
        return status;
    }
    
    /**
     * Method Login Aplikasi
     * @param mod
     */
    public static String id_pengguna = "P-0001";
    public static String data_login = "Anda tidak melakukan login";
    public static String level = "Kasir";
    
    public boolean login(User_model mod) throws SQLException, ClassNotFoundException {
        boolean status = false;
        conf = new Configuration();
        
        try {
            String query = "SELECT * FROM users WHERE user_name = "
                    + "'" + mod.getUser_name() + "' AND user_password = "
                    + "'" + mod.getUser_password() + "'";
            conf.stm = (Statement) conf.conn.createStatement();
            conf.res = (ResultSet) conf.stm.executeQuery(query);
            if (conf.res.next()) {
                id_pengguna = conf.res.getString(1);
                data_login = conf.res.getString(2);
                level = conf.res.getString(6);
                status = true;
            } else {
                status = false;
            }
            conf.res.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "GAGAL LOGIN :: " +e.getMessage());
        }
        return status;
    }
    
}
