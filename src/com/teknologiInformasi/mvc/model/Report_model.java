/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknologiInformasi.mvc.model;

/**
 *
 * @author HP
 */
public class Report_model {
  
    private String report_name, report_id, data_id, report_start_date, report_end_date, data_start_date, data_end_date;

    public String getReport_name() {
        return report_name;
    }

    public void setReport_name(String report_name) {
        this.report_name = report_name;
    }

    public String getReport_id() {
        return report_id;
    }

    public void setReport_id(String report_id) {
        this.report_id = report_id;
    }

    public String getData_id() {
        return data_id;
    }

    public void setData_id(String data_id) {
        this.data_id = data_id;
    }

    public String getReport_start_date() {
        return report_start_date;
    }

    public void setReport_start_date(String report_start_date) {
        this.report_start_date = report_start_date;
    }

    public String getReport_end_date() {
        return report_end_date;
    }

    public void setReport_end_date(String report_end_date) {
        this.report_end_date = report_end_date;
    }

    public String getData_start_date() {
        return data_start_date;
    }

    public void setData_start_date(String data_start_date) {
        this.data_start_date = data_start_date;
    }

    public String getData_end_date() {
        return data_end_date;
    }

    public void setData_end_date(String data_end_date) {
        this.data_end_date = data_end_date;
    }
    
    
}
