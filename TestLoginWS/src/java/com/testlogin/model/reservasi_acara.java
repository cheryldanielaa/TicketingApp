/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testlogin.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author MATHEW
 */
public class reservasi_acara extends MyModel{

    private int id;
    private int total;
    private int idAkun;
    private int idDaftarAcara; //ini buat insert data
    private daftar_acara idDaftarAcaraa; //ini model buat inner join
    private Akun idAkunn; //ini model buat inner join
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getIdAkun() {
        return idAkun;
    }

    public void setIdAkun(int idAkun) {
        this.idAkun = idAkun;
    }

    public int getIdDaftarAcara() {
        return idDaftarAcara;
    }

    public void setIdDaftarAcara(int idDaftarAcara) {
        this.idDaftarAcara = idDaftarAcara;
    }

    public daftar_acara getIdDaftarAcaraa() {
        return idDaftarAcaraa;
    }

    public void setIdDaftarAcaraa(daftar_acara idDaftarAcaraa) {
        this.idDaftarAcaraa = idDaftarAcaraa;
    }

    public Akun getIdAkunn() {
        return idAkunn;
    }

    public void setIdAkunn(Akun idAkunn) {
        this.idAkunn = idAkunn;
    }
  

    public reservasi_acara() {
       
    }
    
    public reservasi_acara(int _total, int _idAkun, int _idDaftarAcara){
        this.total = _total;
        this.idAkun = _idAkun;
        this.idDaftarAcara = _idDaftarAcara;
    }
    
    public reservasi_acara (int _id, int _total, Akun _idAkun, daftar_acara idDaftarAcara) //METHOD UTK BACA DATA DI TIKET
    {
       this.id = _id;
       this.total = _total;
       this.idAkunn = _idAkun;
       this.idDaftarAcaraa=idDaftarAcara;
    }
   
    public void loadById(int id) {
        try {
            PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement(
                    "SELECT * FROM reservasi_acara WHERE id = ?"
            );
            sql.setInt(1, id);
            ResultSet result = sql.executeQuery();
            
            if (result.next()) {
                this.setId(result.getInt("id"));
                this.setTotal(result.getInt("total"));
                
                
                Akun akun = new Akun();
                akun.setId(result.getInt("akun_id"));
                akun.loadById(akun.getId());
                this.setIdAkunn(akun);
                
               
                daftar_acara acara = new daftar_acara();
                acara.setId(result.getInt("daftar_acara_id"));
                acara.loadById(acara.getId());
                this.setIdDaftarAcaraa(acara);
            }
            result.close();
            sql.close();
        } catch (Exception e) {
            System.out.println("Error in loadById: " + e.getMessage());
        }
    }
    
    @Override
    public void insertData() {
       String query = "INSERT INTO reservasi_acara (total, akun_id, daftar_acara_id) VALUES (?, ?, ?)";
        try {
            PreparedStatement sql = MyModel.conn.prepareStatement(query);
            sql.setInt(1, this.getTotal());
            sql.setInt(2, this.getIdAkun()); 
            sql.setInt(3, this.getIdDaftarAcara()); 
            
            sql.executeUpdate();
            sql.close();
            System.out.println("Data inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting data: " + e.getMessage());
        }
    }
     public int ReservasiTerbaru()
    {
         int idTerbaru = 0;
        try {
            this.statement = MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("SELECT MAX(id) AS max_id FROM reservasi_acara");
            /* Jika ada data yang terbaca, maka deklarasikan objek dari data itu */
            if (this.result.next()) // Jika ada data yang ditemukan
            {
                idTerbaru = this.result.getInt("max_id"); // Ambil nilai maksimum dari id
            }
        } catch (Exception ex) {
            System.out.println("Error saat lihat ID" + ex);
        }
        return idTerbaru;
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
            this.result = this.statement.executeQuery("SELECT * FROM reservasi_acara");
            while (this.result.next()) {
                int total = this.result.getInt("total");
                int akun = this.result.getInt("akun_id"); 
                int daftarAcara = this.result.getInt("daftar_acara_id");

                reservasi_acara reservasi = new reservasi_acara(total, akun, daftarAcara);
                collections.add(reservasi);
            }
        } catch (SQLException e) {
            System.out.println("Error di viewListData: " + e.getMessage());
        }
        return collections;
    }
    
    
   public ArrayList<Object> viewListDataa() { //ini buat baca data reservasi yang buat inner join sama tiket
         ArrayList<Object> collections = new ArrayList<>();
        try {
            this.statement = (Statement) MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("SELECT * FROM reservasi_acara");
            while (this.result.next()) {
                int id = this.result.getInt("id");
                Akun akun = new Akun(); 
                akun.loadById(this.result.getInt("akun_id"));
                daftar_acara daftarAcara = new daftar_acara(); 
                daftarAcara.loadById(this.result.getInt("daftar_acara_id"));
                reservasi_acara reservasi = new reservasi_acara(id, getTotal(), 
                        akun, daftarAcara);
                collections.add(reservasi);
            }
        } catch (SQLException e) {
            System.out.println("Error di viewListData: " + e.getMessage());
        }
        return collections;
    }
    
}
