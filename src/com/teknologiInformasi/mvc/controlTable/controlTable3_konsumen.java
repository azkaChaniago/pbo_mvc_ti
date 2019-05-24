/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknologiInformasi.mvc.controlTable;

import com.teknologiInformasi.mvc.model.model1_Pengguna;
import com.teknologiInformasi.mvc.model.model2_Barang;
import com.teknologiInformasi.mvc.model.model3_Konsumen;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author HP
 */
public class controlTable3_konsumen extends AbstractTableModel {
    
    private String[] kolom = {"ID Konsumen","Nama Konsumen","Telf","Alamat","Catatan"};
    public static Vector<model3_Konsumen> feldData=new Vector<model3_Konsumen>(); 

    @Override
    public int getRowCount() {
        return feldData.size();
    }

    @Override
    public int getColumnCount() {
         return kolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){             
            case 0: 
                return feldData.get(rowIndex).getId_konsumen();
            case 1: 
                return feldData.get(rowIndex).getNama_konsumen();
            case 2: 
                return feldData.get(rowIndex).getTelf();             
            case 3: 
                return feldData.get(rowIndex).getAlamat();             
            case 4: 
                return feldData.get(rowIndex).getCatatan();                                 default: 
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column) {         
        return this.kolom[column];     
    }
    
    public void insert(model3_Konsumen mdp) {         
        feldData.add(mdp);         
        fireTableRowsInserted(getRowCount(), getRowCount());                 
    }
    
    public void update(int index, model3_Konsumen mdp){         
        feldData.set(index, mdp);         
        fireTableRowsUpdated(index, index);     
    }       
    
    public void delete(int index){         
        feldData.remove(index);         
        fireTableRowsDeleted(index - 1, index - 1);       
    } 
 
    public void removeAllData(){         
        feldData.removeAllElements();
        fireTableRowsDeleted(getRowCount(), getRowCount());
    }              
      
    public void lebarKolomTabel(JTable namaTable){         
        namaTable.getColumnModel().getColumn(0).setPreferredWidth(30);
        namaTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        namaTable.getColumnModel().getColumn(2).setPreferredWidth(70);                    namaTable.getColumnModel().getColumn(3).setPreferredWidth(100);                   namaTable.getColumnModel().getColumn(4).setPreferredWidth(100);     
    }//lebar kolom 
 
      public int search(String id){         
          int n=0;
          int ketemu=-1;         
          while(n<feldData.size() && ketemu==-1){             
                if(id.equals(feldData.get(n).getId_konsumen())) {
                  ketemu=n;
                }             
                n++;         
            }
        return ketemu;
      }
}
