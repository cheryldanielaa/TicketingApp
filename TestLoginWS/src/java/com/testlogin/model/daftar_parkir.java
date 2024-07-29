/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testlogin.model;

import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author MATHEW
 */
public class daftar_parkir extends MyModel{
    private int id;
    private String lokasi;
    private int kapasitas;

    public daftar_parkir(){
        
    }
    
   //CONSTRUCTOR UTK BACA DATA
    public daftar_parkir(int _id, String _lokasi, int _kapasitas)
    {
        this.id=_id;
        this.lokasi=_lokasi;
        this.kapasitas=_kapasitas;
    }
    
    //CONSTRUCTOR UNTUK BACA KAPASITAS
    public daftar_parkir(String _lokasi)
    {
        this.lokasi=_lokasi;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    
    public int KapasitasParkiran(String _lokasi)
    {
        int kapasitasLot = 0;
        try
        {
            this.statement = (Statement)MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("select * from daftar_parkir where lokasi='"+_lokasi+"'"); 
            /*klo ada data yang terbaca, maka deklarasikan objek dr data itu*/
            while(this.result.next()) //klo ada data yg ditemukan
            {
                  kapasitasLot = this.result.getInt("kapasitas"); //ambil value kapasitas
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error saat baca kapasitas parkiran" + ex);
        }
        return kapasitasLot;
    }
    
    public int idLokasi(String _lokasi)
    {
        int id = 0;
        try
        {
            this.statement = (Statement)MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("select * from daftar_parkir where lokasi='"+_lokasi+"'"); 
            /*klo ada data yang terbaca, maka deklarasikan objek dr data itu*/
            while(this.result.next()) //klo ada data yg ditemukan
            {
                  id = this.result.getInt("id"); //ambil value id
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error saat baca id lokasi" + ex);
        }
        return id;
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
        try 
        {
            this.statement = (Statement)MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("select * from daftar_parkir");
            
            /*klo ada data yang terbaca, maka deklarasikan objek dr data itu*/
            while(this.result.next())
            {

                daftar_parkir dp = new daftar_parkir(this.result.getInt("id"),
                        this.result.getString("lokasi"), this.result.getInt("kapasitas")
                );
                collections.add(dp); /*simpan tiap objek ke dalam array*/
            }
        }
        catch (Exception e)
        {
            System.out.println("Error di viewlist " + e);
        }
        return collections;
    }
    
}
