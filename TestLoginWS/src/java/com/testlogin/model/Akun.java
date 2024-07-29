/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testlogin.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author INTEL
 */
public class Akun extends MyModel{
    
    private int id;
    private String username;
    private String password;
    private String nama;
    private String email;
    private Timestamp created_at;
    private Timestamp updated_at;
    
    public Akun ()
    {
        this.id=0;
        this.nama = null;
        this.email = null;
        this.username = null;
        this.password = null;   
        this.created_at=null;
        this.updated_at=null;
    }
    public Akun(String _username)
    {
        this.username = _username;
    }
    public Akun(String _username, String _password){
        this.username = _username;
        this.password = _password;
    }
    
    public Akun(String _nama, String _email, String _username, String _password){
        this.nama = _nama;
        this.email = _email;
        this.username = _username;
        this.password = _password;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Boolean CheckLogin(String _username, String _password)
    {
        Boolean status = false;
        try
        {
            this.statement = (Statement)MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("select * from akun");
            /*klo ada data yang terbaca, maka deklarasikan objek dr data itu*/
            while(this.result.next())
            {
               Akun acc = new Akun(this.result.getString("username"),
                        this.result.getString("password"));
               if(this.result.getString("username").equals(_username) && 
                       this.result.getString("password").equals(_password))
               {
                    status=true; 
               }
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error saat Login " + ex);
        }
        return status;
    }
    
    public Boolean CheckRegister(String _username){
        Boolean status = false;
        try{
            this.statement = (Statement)MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("select * from akun");
            
            while(this.result.next()){
                Akun acc = new Akun(this.result.getString("nama"), this.result.getString("email"),
                        this.result.getString("username"), this.result.getString("password"));
                if(this.result.getString("username").equals(_username)){
                    status = true;
                }
            }
        }
        catch(Exception x){
            System.out.println("Error saat rregister" + x);
        }
        return status;
    }
    
    public void loadById(int id) {
        try {
            String query = "SELECT * FROM akun WHERE id = ?";
            PreparedStatement sql = MyModel.conn.prepareStatement(query);
            sql.setInt(1, id);
            ResultSet resultSet = sql.executeQuery();
            if (resultSet.next()) {
                this.id = resultSet.getInt("id");
                this.nama = resultSet.getString("nama");
                this.email = resultSet.getString("email");
                this.username = resultSet.getString("username");
                this.password = resultSet.getString("password");
                this.created_at = resultSet.getTimestamp("created_at");
                this.updated_at = resultSet.getTimestamp("updated_at");
            }
            resultSet.close();
            sql.close();
        } catch (SQLException e) {
            System.out.println("Error di loadById: " + e.getMessage());
        }
    }
    public int CariIDUser(String _username)
    {
        int idUser = 0;
        try
        {
            this.statement = (Statement)MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("select * from akun where username='"+username+"'"); 
            /*klo ada data yang terbaca, maka deklarasikan objek dr data itu*/
            while(this.result.next()) //klo ada data yg ditemukan
            {
                  idUser = this.result.getInt("id"); //ambil value kapasitas
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error saat baca kapasitas parkiran" + ex);
        }
        return idUser;
    }
    @Override
    public void insertData() {
        try {
            //jika sdh terbentuk koneksi
            if (!MyModel.conn.isClosed()) {
                PreparedStatement sql = (PreparedStatement) MyModel.conn.prepareStatement(
                        "INSERT into akun(nama, email,"
                        + "username , password) VALUES "
                        + "(?, ?, ?, ?)"
                );
                sql.setString(1, this.nama);
                sql.setString(2, this.email);
                sql.setString(3, this.username);
                sql.setString(4, this.password);
                sql.executeUpdate();
                sql.close();
            }
        } catch (Exception e) {
            System.out.println("Error di insertdata " + e);
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
    public ArrayList<Object> viewListData() //ini buat menampilkan semua data akun
    {
        ArrayList<Object> collections = new ArrayList<>();
        try{
            this.statement = (Statement) MyModel.conn.createStatement();
            this.result = this.statement.executeQuery("SELECT * from akun");
            while(this.result.next()){
                Akun acc = new Akun(
                this.result.getString("username"),
                this.result.getString("password"));
            }
        } catch (Exception e){
            System.out.println("Error di viewlist" + e);
        }
        return collections;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
    
    
    
    
    
    
    
    
}
