/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testlogin.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author MATHEW
 */
public class daftar_acara extends MyModel {

    private int id;
    private String nama;
    private String jenis;
    private String tanggal_pelaksanaan;
    private int harga;
    private int kapasitas;
    private String lokasi;

    public daftar_acara() 
    {

    }

    public daftar_acara(String _nama, String _jenis, String _tanggal, int _harga, int _kapasitas, String _lokasi) {
        this.nama = _nama;
        this.jenis = _jenis;
        this.tanggal_pelaksanaan = _tanggal;
        this.harga = _harga;
        this.kapasitas = _kapasitas;
        this.lokasi = _lokasi;
    }

    public daftar_acara(String _nama) {
        this.nama = _nama;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getTanggal_pelaksanaan() {
        return tanggal_pelaksanaan;
    }

    public void setTanggal_pelaksanaan(String tanggal_pelaksanaan) {
        this.tanggal_pelaksanaan = tanggal_pelaksanaan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public void loadById(int id) {
        try {
            String query = "SELECT * FROM daftar_acara WHERE id = ?";
            PreparedStatement sql = MyModel.conn.prepareStatement(query);
            sql.setInt(1, id);
            ResultSet resultSet = sql.executeQuery();
            if (resultSet.next()) {
                this.id = resultSet.getInt("id");
                this.nama = resultSet.getString("nama");
                this.jenis = resultSet.getString("jenis");
                this.tanggal_pelaksanaan = resultSet.getString("tanggal_pelaksanaan");
                this.harga = resultSet.getInt("harga");
                this.kapasitas = resultSet.getInt("kapasitas");
                this.lokasi = resultSet.getString("lokasi");
            }
            resultSet.close();
            sql.close();
        } catch (Exception e) {
            System.out.println("Error di loadById: " + e.getMessage());
        }
    }

    public int CariIDAcara(String _nama) {
        int idAcara = 0;
        try {
            this.statement = (Statement) MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("select id from daftar_acara where nama='" + nama + "'");
            /*klo ada data yang terbaca, maka deklarasikan objek dr data itu*/
            while (this.result.next()) //klo ada data yg ditemukan
            {
                idAcara = this.result.getInt("id"); //ambil value kapasitas
            }
        } catch (Exception ex) {
            System.out.println("Error saat baca kapasitas parkiran" + ex);
        }
        return idAcara;
    }
    public void updateKapasitasAcara(String namaAcara)
    {
        try
        {
            PreparedStatement sql = conn.prepareStatement(
                    "UPDATE daftar_acara set kapasitas=(select kapasitas from daftar_acara where " +
                        "nama=?)-1 where nama=?");
            sql.setString(1, namaAcara);
            sql.setString(2, namaAcara);
            sql.executeUpdate();
            sql.close();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    @Override
    public void insertData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        ArrayList<Object> collections = new ArrayList<>();
        try {
            this.statement = (Statement) MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("SELECT * from daftar_acara");
            while (this.result.next()) {
                daftar_acara da = new daftar_acara(
                        this.result.getString("nama"),
                        this.result.getString("jenis"),
                        this.result.getString("tanggal_pelaksanaan"),
                        this.result.getInt("harga"),
                        this.result.getInt("kapasitas"),
                        this.result.getString("lokasi"));
                collections.add(da);
            }
        } catch (Exception e) {
            System.out.println("Error di viewlist" + e);
        }
        return collections;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
