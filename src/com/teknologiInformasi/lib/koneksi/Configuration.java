/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknologiInformasi.lib.koneksi;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Configuration {
    
    //Deklarasi Variable
//    public static Connection con;
//    public static Statement st;
//    
//    
//    public static void koneksi() {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo_ti", "root", "");
//            st = (Statement) con.createStatement();
//            JOptionPane.showMessageDialog(null, "Berhasil Koneksi database");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error :: " + e.getMessage());
//        }
//    }  
    
//    UNTUK TES KONEKSI DATABASE
//    public static void main(String[] args) {
//        koneksi();
//    }  
    
    public Connection conn = null;
    public Statement stm = null;
    public ResultSet res = null;
    
    public Configuration() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pbo_ti", "root", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.err.print(e.getMessage());
        }
    }
    
    
    
}
