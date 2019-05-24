/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teknologiInformasi.mvc.controlSQL;

import com.mysql.jdbc.ResultSet;
import com.teknologiInformasi.lib.koneksi.Koneksi;
import com.teknologiInformasi.mvc.controlTable.controlTable1_pengguna;
import com.teknologiInformasi.mvc.model.model1_Pengguna;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class controlSQL1_pengguna {
    
     controlTable1_pengguna ctp = new controlTable1_pengguna();     
     public void reload(){         
         Koneksi.koneksi();         
         try{             
             ResultSet rst = (ResultSet) Koneksi.st.executeQuery("select * from tbl_pengguna");              
             while(rst.next()){                 
                 model1_Pengguna mdp = new model1_Pengguna();                 
                 mdp.setId_pengguna(rst.getString(1));                 
                 mdp.setNama_pengguna(rst.getString(2));                 
                 mdp.setAlamat(rst.getString(3));                 
                 mdp.setTelf(rst.getString(4));                 
                 mdp.setLevel(rst.getString(5));                                
                 ctp.insert(mdp);             }             rst.close();         }        catch(Exception z){             
                     System.out.print(z.getMessage());          
        }     
     }//reload          
     
     public boolean insert(model1_Pengguna mdp){         
         boolean cek=true;                              
         try{                 
             String query="insert into tbl_pengguna values ('"+mdp.getId_pengguna()+"','"+mdp.getNama_pengguna()+"','"+mdp.getAlamat()+"','"+mdp.getTelf()+"','"+mdp.getLevel() +"','"+mdp.getPassword()+"')";                 
             Koneksi.st.executeUpdate(query);             
         } catch(Exception z){                 
             JOptionPane.showMessageDialog(null,"Pengisian Data Gagal ??? \n"+ z.getMessage());                 
             cek=false;             
         }                
         return cek;      
     }//blok insert 
    
     
      public boolean update(model1_Pengguna mdp){         
          boolean cek=true;         
          try{             
              String query="update tbl_pengguna set "
                      + "nama_pengguna='"+mdp.getNama_pengguna()+""
                      + "',alamat='"+mdp.getAlamat()+"',"
                      + "telf='"+mdp.getTelf()+"' ,"
                      + "level='"+mdp.getLevel()+"', "
                      + "password='"+mdp.getPassword()+"' "
                      + "where id_pengguna='"+mdp.getId_pengguna()+"'";   
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
            String query="delete from tbl_pengguna where id_pengguna='"+id+"'";               Koneksi.st.executeUpdate(query);         
        } catch(Exception z){             
            JOptionPane.showMessageDialog(null,"Hapus Data Gagal ??? \n"+ z.getMessage());             
            cek=false;         
        }         
        return cek;     
    }//blok Delet
}
