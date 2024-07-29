/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testlogin.model;

import static com.testlogin.model.MyModel.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author MATHEW
 */
public class tiket extends MyModel {

    private int id;
    private String kode;
    private String status;
    private reservasi_acara idReservasi;
    private int idReservasiAcara;
    public tiket() {

    }

    public tiket(String _kodeTiket)  //BUAT UPDATE DATA
    {
        this.kode = _kodeTiket;
    }
    public tiket(String kode, String status, reservasi_acara idReservasi) {
        this.kode = kode;
        this.status = status;
        this.idReservasi = idReservasi;
    }
 public tiket(String kode, int idReservasi) {
        this.kode = kode;
        this.idReservasiAcara = idReservasi;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public reservasi_acara getIdReservasi() {
        return idReservasi;
    }

    public void setIdReservasi(reservasi_acara idReservasi) {
        this.idReservasi = idReservasi;
    }

    @Override
    public void insertData() {
        try {
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = MyModel.conn.prepareStatement(
                        "INSERT INTO tiket (kode, reservasi_acara_id) VALUES (?,?)"
                );
                sql.setString(1, this.kode);
                sql.setInt(2, this.idReservasiAcara);
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

    public void updateStatusToClaim(String kodeTiket) {
        try {
           

            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = conn.prepareStatement(
                        "UPDATE tiket SET status = 'CLAIM' WHERE kode = ?"
                );
                sql.setString(1, kodeTiket);
                sql.executeUpdate();
                sql.close();
                System.out.println("Ticket status updated to CLAIM.");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error in updateStatusToClaim: " + e.getMessage(), e);
        }
    }
    
    
    public ArrayList<Object> viewListDataa(int idAkun) {
    ArrayList<Object> collections = new ArrayList<>();
    try {
        String query = "SELECT t.id, t.kode, t.status, da.nama AS nama_acara, da.jenis AS jenis_acara, " +
                       "da.tanggal_pelaksanaan AS tanggal_acara, da.lokasi AS lokasi_acara,r.id AS id_reservasi " +
                       "FROM tiket t " +
                       "INNER JOIN reservasi_acara r ON t.reservasi_acara_id = r.id " +
                       "INNER JOIN daftar_acara da ON r.daftar_acara_id = da.id " +
                       "WHERE da.tanggal_pelaksanaan = ?" + "and r.akun_id='" + idAkun + "'";
        PreparedStatement sql = MyModel.conn.prepareStatement(query);
        
        sql.setString(1, getCurrentDate());

        ResultSet resultSet = sql.executeQuery();
        while (resultSet.next()) 
        {
            reservasi_acara ra = new reservasi_acara();
            ra.setId(resultSet.getInt("id_reservasi"));
            tiket t = new tiket(
                resultSet.getString("kode"),
                resultSet.getString("status"),
                ra
            );
            t.setId(resultSet.getInt("id"));
            
            
            daftar_acara da = new daftar_acara();
            da.setNama(resultSet.getString("nama_acara"));
            da.setJenis(resultSet.getString("jenis_acara"));
            da.setTanggal_pelaksanaan(resultSet.getString("tanggal_acara"));
            da.setLokasi(resultSet.getString("lokasi_acara"));
            
            // Set the daftar_acara object to the tiket object
            t.getIdReservasi().setIdDaftarAcaraa(da);
            
            collections.add(t);
        }
        resultSet.close();
        sql.close();
    } catch (Exception e) {
        System.out.println("Error in viewListData: " + e.getMessage());
    }
    return collections;
}

private String getCurrentDate() {
    // Get current date in SQL format (yyyy-MM-dd)
    java.util.Date today = new java.util.Date();
    return new java.sql.Date(today.getTime()).toString();
}    

    @Override
    public ArrayList<Object> viewListData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
