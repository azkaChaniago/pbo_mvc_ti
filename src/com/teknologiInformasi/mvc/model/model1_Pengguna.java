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
public class model1_Pengguna {
    
    private String id_pengguna, nama_pengguna, alamat, telf, level, password;

    public String getId_pengguna() {
        return id_pengguna;
    }

    public void setId_pengguna(String id_pengguna) {
        this.id_pengguna = id_pengguna;
    }

    public String getNama_pengguna() {
        return nama_pengguna;
    }

    public void setNama_pengguna(String nama_pengguna) {
        if (nama_pengguna.equals("")) {
            this.nama_pengguna = "-";
        } else {
            this.nama_pengguna = nama_pengguna;
        }
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        if (alamat.equals("")) {
            this.alamat = "-";
        } else {
            this.alamat = alamat;
        }
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        if (telf.equals("")) {
            this.telf = "-";
        } else {
            this.telf = telf;
        }
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        if (level.equals("")) {
            this.level = "-";
        } else {
            this.level = level;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.equals("")) {
            this.password = "-";
        } else {
            this.password = password;
        }
    }   
    
}
