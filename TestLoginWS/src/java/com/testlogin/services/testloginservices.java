/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.testlogin.services;

import com.testlogin.model.Akun;
import com.testlogin.model.daftar_acara;
import com.testlogin.model.daftar_parkir;
import com.testlogin.model.reservasi_acara;
import com.testlogin.model.reservasi_parkir;
import com.testlogin.model.tiket;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author INTEL
 */
@WebService(serviceName = "testloginservices")
public class testloginservices {
    
    
    Akun akun;
    daftar_acara da;
    daftar_parkir dp;
    reservasi_acara ra;
    reservasi_parkir rp;
    tiket tiket;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "checkLogin")
    public Boolean checkLogin(@WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        akun = new Akun(username, password);
        return akun.CheckLogin(username, password);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertData")
    public void insertData(@WebParam(name = "nama") String nama, @WebParam(name = "email") String email, @WebParam(name = "username") String username, @WebParam(name = "password") String password) {
        akun = new Akun(nama, email, username, password);
        akun.insertData();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertReservasiAcara")
    public void insertReservasiAcara(@WebParam(name = "total") int total, @WebParam(name = "idAkun") int idAkun, @WebParam(name = "idDaftarAcara") int idDaftarAcara) {
        ra = new reservasi_acara(total, idAkun, idDaftarAcara);
        ra.insertData();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertReservationParkir")
    public void insertReservasiParkir(@WebParam(name = "no_plat") String no_plat, @WebParam(name = "harga") 
            int harga, @WebParam(name = "no_parkir") int no_parkir, @WebParam(name = "tanggal") String tanggal, @WebParam(name = "idAkun") 
                    int idAkun, @WebParam(name = "idDaftarParkir") int idDaftarParkir) {
       rp = new reservasi_parkir(no_plat, harga, no_parkir, tanggal, idAkun, idDaftarParkir);
       rp.insertData();
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "getTickets") //BUAT AMBIL DAFTAR TIKET SESUAI TANGGAL & KASIH PARAMETER BUAT CEK SESUAI SM USER YG LOGIN
    public ArrayList<com.testlogin.model.tiket> getTikets(int idAkun) {
        tiket  = new tiket();
        ArrayList<Object> list = tiket.viewListDataa(idAkun);
        ArrayList<com.testlogin.model.tiket> t = new ArrayList<>();
        for (Object obj : list) {
            t.add((tiket) obj);
        }
        return t;
    }


    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "getDaftarAcara")
    public ArrayList<com.testlogin.model.daftar_acara> getDaftarAcara() {
        da = new daftar_acara();
        ArrayList<Object> list = da.viewListData();
        ArrayList<com.testlogin.model.daftar_acara> das = new ArrayList<>();
        for (Object obj : list) {
            das.add((daftar_acara) obj);
        }
        return das;
    }
    
    @WebMethod(operationName = "BacaParkiran")
    public ArrayList<com.testlogin.model.daftar_parkir> BacaParkiran() 
    {
        
        dp = new daftar_parkir();
        ArrayList<com.testlogin.model.daftar_parkir>listTempatParkir = new ArrayList<>(); //deklarasikan list yg menyimpan dftr parkiran
        ArrayList<Object> listObject = new ArrayList<Object>(); //krn yg direturn di view list data itu list of object
        listObject = dp.viewListData();
        for (Object obj : listObject) 
        {
            if (obj instanceof daftar_parkir) //jika objectnya itu berupa daftar parkiran, maka masukkan ke list tempat parkir
            {
                listTempatParkir.add((daftar_parkir) obj);
            }
        }
        return listTempatParkir;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "BacaKapasitas")
    public Integer BacaKapasitas(@WebParam(name = "nama") String _nama) {
        dp = new daftar_parkir(_nama);
        return dp.KapasitasParkiran(_nama); //kembalikan value dari yang dipilih oleh user
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "BacaLotTerisi")
    public ArrayList <Integer> BacaLotTerisi(@WebParam(name = "daftar_parkir_id") int daftar_parkir_id, @WebParam(name = "tanggal") String __tanggal) {
        //rp = new reservasi_parkir();
        rp = new reservasi_parkir();
        return rp.ParkiranTerisi(daftar_parkir_id, __tanggal); //return list sesuai inputan user
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "bacaIdLokasi")
    public int bacaIdLokasi(@WebParam(name = "nama") String _nama) {
        //TODO write your implementation code here:
        dp = new daftar_parkir(_nama);
        return dp.idLokasi(_nama);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CariIDUser")
    public Integer CariIDUser(@WebParam(name = "username") String username) {
        akun = new Akun(username);
        return akun.CariIDUser(username);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CheckRegister")
    public Boolean CheckRegister(@WebParam(name = "username") String username) 
    {
       akun = new Akun(username);
       return akun.CheckRegister(username);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "bacaJumTiket")
    public Integer bacaJumTiket(@WebParam(name = "tiket") Integer tiket) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cariIdAcara")
    public Integer cariIdAcara(@WebParam(name = "name") String nama) {
        //TODO write your implementation code here:
        da = new daftar_acara(nama);
        return da.CariIDAcara(nama);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "reservasiBaru")
    public Integer reservasiBaru() {
        ra = new reservasi_acara();
        return ra.ReservasiTerbaru();
    }
    
     @WebMethod(operationName = "insertReservasiTiket")
    public void insertReservasiTiket(@WebParam(name = "kode") String kode, @WebParam(name = "idReservasi") int idReservasi) 
    {
        tiket = new tiket(kode, idReservasi);
        tiket.insertData();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "UpdateStatusToClaim")
    public void UpdateStatusToClaim(String _kode) 
    {
        tiket = new tiket(_kode);
        tiket.updateStatusToClaim(_kode);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "UpdateKapasitasAcara")
    public void UpdateKapasitasAcara(@WebParam(name = "namaAcara") String namaAcara) {
        da = new daftar_acara(namaAcara);
        da.updateKapasitasAcara(namaAcara);
    }
}
