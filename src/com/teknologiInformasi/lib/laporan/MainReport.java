/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknologiInformasi.lib.laporan;

import com.teknologiInformasi.lib.koneksi.Configuration;
import com.teknologiInformasi.mvc.model.Report_model;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author HP
 */
public class MainReport {

    Configuration conf;
    
    public void printReport(Report_model model) throws SQLException, ClassNotFoundException, ClassNotFoundException {
        this.conf = new Configuration();
        String src = "src/com/teknologiInformasi/lib/laporan/" + model.getReport_name() + ".jrxml";
        HashMap param = new HashMap();
        
        param.put(model.getReport_id(), model.getData_id());
        param.put(model.getReport_start_date(), model.getData_start_date());
        param.put(model.getReport_end_date(), model.getData_end_date());
        
        try {
            JasperReport report = JasperCompileManager.compileReport(src);
            JasperPrint print = JasperFillManager.fillReport(report, param, conf.conn);
            JasperViewer.viewReport(print, false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
       
    
}
