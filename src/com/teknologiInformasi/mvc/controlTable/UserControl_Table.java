/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknologiInformasi.mvc.controlTable;

import com.teknologiInformasi.mvc.model.User_model;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HP
 */
public class UserControl_Table extends AbstractTableModel {

    private String [] column = {"ID", "Nama", "Alamat", "Telepon", "Level"};
    public static Vector<User_model> field_data = new Vector<User_model>();    
    
    @Override
    public int getRowCount() {
        return field_data.size();
    }

    @Override
    public int getColumnCount() {
        return column.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return field_data.get(rowIndex).getUser_id();
            case 1:
                return field_data.get(rowIndex).getUser_name();
            case 2:
                return field_data.get(rowIndex).getUser_address();
            case 3:
                return field_data.get(rowIndex).getUser_phone();
            case 4:
                return field_data.get(rowIndex).getUser_auth();
            default :
                return null;
        }
    }
    
    @Override
    public String getColumnName(int col) {
        return this.column[col];
    }
    
    public void insert(User_model model) {
        field_data.add(model);
        fireTableRowsInserted(getRowCount(), getRowCount());
    }
    
    public void update(int index, User_model model) {
        field_data.add(index, model);
        fireTableRowsUpdated(index, index);
    }
    
    public void delete(int index) {
        field_data.remove(index);
        fireTableRowsDeleted(index - 1, index - 1);
    }
    
    public void removeAllData() {
        field_data.removeAllElements();
        fireTableRowsDeleted(getRowCount(), getRowCount());
    }
    
    public void tableColumnWidth(JTable table_name) {
        table_name.getColumnModel().getColumn(0).setPreferredWidth(30);
        table_name.getColumnModel().getColumn(1).setPreferredWidth(100);
        table_name.getColumnModel().getColumn(2).setPreferredWidth(70);
        table_name.getColumnModel().getColumn(3).setPreferredWidth(100);
        table_name.getColumnModel().getColumn(4).setPreferredWidth(100);
    }
    
    public int search(String id) {
        int n = 0;
        int found = -1;
        while (n < field_data.size() && found == -1) {
            if (id.equals(field_data.get(n).getUser_id())) {
                found = n;
            }
            n++;
        }
        return found;
    }
    
}
