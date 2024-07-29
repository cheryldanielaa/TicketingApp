/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testlogin.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author MATHEW
 */
public class reservasi_parkir extends MyModel {
    private int id;
    private String no_plat;
    private int harga;
    private int no_parkir;
    private String tanggal;
    private int idAkun;
    private int idDaftarParkir;

    public reservasi_parkir(String _no_plat, int _harga, int _no_parkir, String _tanggal, int _idAkun, int _idDaftarParkir)
    {
        this.no_plat = _no_plat;
        this.harga = _harga;
        this.no_parkir = _no_parkir;
        this.tanggal = _tanggal;
        this.idAkun=_idAkun;
        this.idDaftarParkir=_idDaftarParkir;
    }
    
    public reservasi_parkir() 
    {
        this.id = 0;
        this.no_plat = null;
        this.harga = 0;
        this.no_parkir = 0;
        this.tanggal = null;
        this.idAkun=0;
        this.idDaftarParkir=0;
    }
    
    public ArrayList<Integer>ParkiranTerisi(int _daftarParkirId, String _tanggal) //method buat mengecek ada berapa bnyk lot yg keisi dan disimpan ke list
    {
        ArrayList<Integer>lotTerisi = new ArrayList<>();
        try
        {
            this.statement = (Statement)MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("select no_parkir from reservasi_parkir where daftar_parkir_id='"+_daftarParkirId+"' and tanggal='" + _tanggal + "'"); 
            int noParkir=0;
            /*klo ada data yang terbaca, maka deklarasikan objek dr data itu*/
            while(this.result.next()) //klo ada data yg ditemukan
            {
                noParkir = this.result.getInt("no_parkir");
                lotTerisi.add(noParkir); //tambahkan ke dlm list nomor parkirnya aja
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error saat baca lot parkiran yang terisi " + ex);
        }
        return lotTerisi;
    } 
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNo_plat() {
        return no_plat;
    }

    public void setNo_plat(String no_plat) {
        this.no_plat = no_plat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getNo_parkir() {
        return no_parkir;
    }

    public void setNo_parkir(int no_parkir) {
        this.no_parkir = no_parkir;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getIdAkun() {
        return idAkun;
    }

    public void setIdAkun(int idAkun) {
        this.idAkun = idAkun;
    }

    public int getIdDaftarParkir() {
        return idDaftarParkir;
    }

    public void setIdDaftarParkir(int idDaftarParkir) {
        this.idDaftarParkir = idDaftarParkir;
    }

    @Override
    public void insertData() {
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = MyModel.conn.prepareStatement(
                    "INSERT INTO reservasi_parkir (no_plat, harga, no_parkir, tanggal, akun_id, daftar_parkir_id) VALUES (?, ?, ?, ?, ?, ?)"
                );
                sql.setString(1, this.no_plat);
                sql.setInt(2, this.harga);
                sql.setInt(3, this.no_parkir);
                sql.setString(4, this.tanggal);
                sql.setInt(5, this.idAkun);
                sql.setInt(6, this.idDaftarParkir);
                
                sql.executeUpdate();
                sql.close();
                System.out.println("Data inserted successfully.");
            }
        } catch (SQLException e) {
            System.out.println("Error in insert: " + e);
        }    
    }

    @Override
    public void updateData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Object> viewListData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
