/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknologiInformasi.mvc.view;

import com.teknologiInformasi.lib.koneksi.Configuration;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    private FormPengguna form_pengguna;
    private FormKonsumen form_konsumen;
    private FormBarang form_barang;
    private Configuration conf;
    
    public MenuUtama() throws SQLException, ClassNotFoundException {
        initComponents();
        conf = new Configuration();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setContentPane(desktopPane);
        
        this.form_pengguna = new FormPengguna();
        this.form_konsumen = new FormKonsumen();
        this.form_barang = new FormBarang();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        datapenggunaLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        logoutMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        transaksiMenu = new javax.swing.JMenu();
        transaksiMenuItem = new javax.swing.JMenuItem();
        kelolatransaksiMenuItem = new javax.swing.JMenuItem();
        masterMenu = new javax.swing.JMenu();
        barangMenuItem = new javax.swing.JMenuItem();
        penggunaMenuItem = new javax.swing.JMenuItem();
        konsumenMenuItem = new javax.swing.JMenuItem();
        laporanMenu = new javax.swing.JMenu();
        baranglaporanMenuItem = new javax.swing.JMenuItem();
        penggunalaporanMenuItem = new javax.swing.JMenuItem();
        konsumenlaporanMenuItem = new javax.swing.JMenuItem();
        transaksilaporanMenuItem = new javax.swing.JMenuItem();
        aboutprogramMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        datapenggunaLabel.setText("jLabel1");
        desktopPane.add(datapenggunaLabel);
        datapenggunaLabel.setBounds(360, 30, 34, 14);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        logoutMenuItem.setMnemonic('o');
        logoutMenuItem.setText("Log Out");
        logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(logoutMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        transaksiMenu.setText("Transaksi");

        transaksiMenuItem.setText("Transaksi");
        transaksiMenu.add(transaksiMenuItem);

        kelolatransaksiMenuItem.setText("Kelola Transaksi");
        transaksiMenu.add(kelolatransaksiMenuItem);

        menuBar.add(transaksiMenu);

        masterMenu.setText("Master");

        barangMenuItem.setText("Barang");
        barangMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barangMenuItemActionPerformed(evt);
            }
        });
        masterMenu.add(barangMenuItem);

        penggunaMenuItem.setText("Pengguna");
        penggunaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penggunaMenuItemActionPerformed(evt);
            }
        });
        masterMenu.add(penggunaMenuItem);

        konsumenMenuItem.setText("Konsumen");
        konsumenMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konsumenMenuItemActionPerformed(evt);
            }
        });
        masterMenu.add(konsumenMenuItem);

        menuBar.add(masterMenu);

        laporanMenu.setText("Laporan");

        baranglaporanMenuItem.setText("Barang");
        baranglaporanMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baranglaporanMenuItemActionPerformed(evt);
            }
        });
        laporanMenu.add(baranglaporanMenuItem);

        penggunalaporanMenuItem.setText("Pengguna");
        laporanMenu.add(penggunalaporanMenuItem);

        konsumenlaporanMenuItem.setText("Konsumen");
        konsumenlaporanMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konsumenlaporanMenuItemActionPerformed(evt);
            }
        });
        laporanMenu.add(konsumenlaporanMenuItem);

        transaksilaporanMenuItem.setText("Transaksi");
        laporanMenu.add(transaksilaporanMenuItem);

        menuBar.add(laporanMenu);

        aboutprogramMenu.setText("About Program");
        aboutprogramMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutprogramMenuMouseClicked(evt);
            }
        });
        menuBar.add(aboutprogramMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        desktopPane.getAccessibleContext().setAccessibleName("");
        desktopPane.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuItemActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Log Out");
    }//GEN-LAST:event_logoutMenuItemActionPerformed

    private void baranglaporanMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baranglaporanMenuItemActionPerformed
        // TODO add your handling code here:
        if (desktopPane.getAllFrames().length == 0){
            desktopPane.add(form_barang);
        } else {
            desktopPane.remove(0);
            desktopPane.add(form_barang);
            revalidate();
            repaint();
        }
        form_barang.setVisible(true);
    }//GEN-LAST:event_baranglaporanMenuItemActionPerformed

    private void konsumenlaporanMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konsumenlaporanMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_konsumenlaporanMenuItemActionPerformed

    private void penggunaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penggunaMenuItemActionPerformed
        // TODO add your handling code here:
        if (desktopPane.getAllFrames().length == 0){
            desktopPane.add(form_pengguna);
        } else {
            desktopPane.remove(0);
            desktopPane.add(form_pengguna);
            revalidate();
            repaint();
        }
        form_pengguna.setVisible(true);
        form_pengguna.setBorder(null);
    }//GEN-LAST:event_penggunaMenuItemActionPerformed

    private void barangMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barangMenuItemActionPerformed
        // TODO add your handling code here:
        if (desktopPane.getAllFrames().length == 0){
            desktopPane.add(form_barang);
        } else {
            desktopPane.remove(0);
            desktopPane.add(form_barang);
            revalidate();
            repaint();
        }
        form_barang.setVisible(true);
    }//GEN-LAST:event_barangMenuItemActionPerformed

    private void konsumenMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konsumenMenuItemActionPerformed
        // TODO add your handling code here:
        if (desktopPane.getAllFrames().length == 0){
            desktopPane.add(form_konsumen);
        } else {
            desktopPane.remove(0);
            desktopPane.add(form_konsumen);
            revalidate();
            repaint();
        }
        form_konsumen.setVisible(true);
    }//GEN-LAST:event_konsumenMenuItemActionPerformed

    private void aboutprogramMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutprogramMenuMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "About Program di klikss");
    }//GEN-LAST:event_aboutprogramMenuMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MenuUtama().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MenuUtama.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public javax.swing.JLabel getDataPenggunaLabel() {
        return this.datapenggunaLabel;
    }
    
    public void setDataPenggunaLabel(javax.swing.JLabel data_pengguna) {
        this.datapenggunaLabel = data_pengguna;
    }
    
    public javax.swing.JMenuBar getDesktop () {
        return this.menuBar;
    }
    
    public void setDesktop(javax.swing.JMenuBar desk) {
        this.menuBar = desk;
    }
    
    public javax.swing.JMenuItem getPenggunaMenuItem() {
        return this.penggunaMenuItem;
    }
    
    public void setPenggunaMenuItem(javax.swing.JMenuItem pengguna) {
        this.penggunaMenuItem = pengguna;
    }
    
    public javax.swing.JMenu getMasterMenu() {
        return this.masterMenu;
    }
    
    public void setMasterMenu(javax.swing.JMenu master) {
        this.masterMenu = master;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutprogramMenu;
    private javax.swing.JMenuItem barangMenuItem;
    private javax.swing.JMenuItem baranglaporanMenuItem;
    private javax.swing.JLabel datapenggunaLabel;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem kelolatransaksiMenuItem;
    private javax.swing.JMenuItem konsumenMenuItem;
    private javax.swing.JMenuItem konsumenlaporanMenuItem;
    private javax.swing.JMenu laporanMenu;
    private javax.swing.JMenuItem logoutMenuItem;
    private javax.swing.JMenu masterMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem penggunaMenuItem;
    private javax.swing.JMenuItem penggunalaporanMenuItem;
    private javax.swing.JMenu transaksiMenu;
    private javax.swing.JMenuItem transaksiMenuItem;
    private javax.swing.JMenuItem transaksilaporanMenuItem;
    // End of variables declaration//GEN-END:variables

}
