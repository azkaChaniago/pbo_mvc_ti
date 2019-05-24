/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknologiInformasi.mvc.controlSQL;

import com.mysql.jdbc.ResultSet;
import com.teknologiInformasi.lib.koneksi.Koneksi;
import com.teknologiInformasi.mvc.controlTable.controlTable1_pengguna;
import com.teknologiInformasi.mvc.controlTable.controlTable2_barang;
import com.teknologiInformasi.mvc.model.model1_Pengguna;
import com.teknologiInformasi.mvc.model.model2_Barang;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class controlSQL2_barang {
    
     controlTable2_barang ctp = new controlTable2_barang();     
     public void reload(){         
         Koneksi.koneksi();         
         try{             
             ResultSet rst = (ResultSet) Koneksi.st.executeQuery("select * from tbl_barang");              
             while(rst.next()){                 
                 
                 model2_Barang mdp = new model2_Barang();      
                 
                 mdp.setId_barang(rst.getString(1));                 
                 mdp.setNama_barang(rst.getString(2));                 
                 mdp.setModal(rst.getString(3));                 
                 mdp.setJual(rst.getString(4));                 
                 mdp.setStok(rst.getString(5));                                
                 ctp.insert(mdp);             
             }             
             rst.close();         
         } catch(Exception z){             
                     System.out.print(z.getMessage());          
        }     
     }//reload          
     
     public boolean insert(model2_Barang mdp){         
         boolean cek=true;                              
         try{                 
             String query="insert into tbl_barang values ("
                     + "'"+mdp.getId_barang()+"',"
                     + "'"+mdp.getNama_barang()+"',"
                     + "'"+mdp.getModal()+"',"
                     + "'"+mdp.getJual()+"',"
                     + "'"+mdp.getStok()+"')";                 
             Koneksi.st.executeUpdate(query);             
         } catch(Exception z){                 
             JOptionPane.showMessageDialog(null,"Pengisian Data Gagal ??? \n"+ z.getMessage());                 
             cek=false;             
         }                
         return cek;      
     }//blok insert 
    
     
      public boolean update(model2_Barang mdp){         
          boolean cek=true;         
          try{             
              String query="update tbl_barang set "
                      + "nama_barang ='"+mdp.getNama_barang()+","
                      + "modal ='"+mdp.getModal()+"',"
                      + "jual ='"+mdp.getJual()+"' ,"
                      + "stok ='"+mdp.getStok()+"' "
                      + "where id_barang ='"+mdp.getId_barang()+"'";   
              Koneksi.st.executeUpdate(query);         
          }catch(Exception z){             
              JOptionPane.showMessageDialog(null,"Ubah Data Gagal ??? \n"+ z.getMessage());             
              cek=false;         
          }         
          return cek;     
      }//blok update 
      
 
    public boolean delete(String id){         
        boolean cek=true;         
        try{             
            String query="delete from tbl_barang where id_barang='"+id+"'";               Koneksi.st.executeUpdate(query);         
        } catch(Exception z){             
            JOptionPane.showMessageDialog(null,"Hapus Data Gagal ??? \n"+ z.getMessage());             
            cek=false;         
        }         
        return cek;     
    }//blok Delet
}
