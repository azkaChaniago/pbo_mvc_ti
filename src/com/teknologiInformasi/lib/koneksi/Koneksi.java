/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknologiInformasi.lib.koneksi;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Koneksi {
    
    public static Connection con;
    public static Statement st;
    
     public static void koneksi(){         
         try {
            
             Class.forName("com.mysql.jdbc.Driver"); 
            
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo_ti","root","");
             st = (Statement) con.createStatement();
             
//             System.out.println("Berhasil Terhubung ke database");
             
         } catch (Exception e) {             
             JOptionPane.showMessageDialog(null,"Koneksi gagal : "+ e);
         }         
     }
     
//     public static void main(String[] args) {
//         koneksi();
//     }
    
}
