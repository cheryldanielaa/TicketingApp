/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serveruasdisprog;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Timestamp;

/**
 *
 * @author Asus
 */
public class HandleSocket extends Thread {

    BufferedReader in;
    DataOutputStream out;
    Socket s;
    ServerUASDisprog parent;

    public HandleSocket(ServerUASDisprog _parent, Socket _s) {
        try {
            this.parent = _parent;
            this.s = _s;
            in = new BufferedReader(new InputStreamReader(s.getInputStream())); //buat terima message
            out = new DataOutputStream(s.getOutputStream()); //buat kirim message
        } catch (IOException ex) {
            Logger.getLogger(HandleSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        //BUAT HANDLE SEMUA PERINTAH DISINI (YG DITERIMA DR USER)
        try {
            while (true) {
                //SPLIT COMMAND DAN INPUTAN USER
                String msg = in.readLine();
                String[] msgSplit = msg.split(":"); //list dari hasil splitting message jika bertemu :
                String command = msgSplit[0]; //ini buat deteksi perintahnya apa
                if (command.equals("LOGIN")) {
                    //SEMENTARA CMN CEK USN DAN PASSWORD
                    String username = msgSplit[1];
                    String password = msgSplit[2];
                    Boolean status = checkLogin(username, password);
                    //JIKA STATUS TRUE, MAKA LOGIN BERHASIL, JIKA STATUS FALSE, MAKA LOGIN GAGAL
                    if (status == true) {
                        sendChat("LOGIN BERHASIL");
                    } else {
                        sendChat("LOGIN GAGAL");
                    }
                } else if (command.equals("BacaParkiran")) {
                    //deklarasikan list penampung
                    ArrayList<serveruasdisprog.DaftarParkir> listParkiran = new ArrayList<>();
                    listParkiran = (ArrayList<serveruasdisprog.DaftarParkir>) bacaParkiran(); //panggil method baca parkiran trs dicasting biar modelnya sama kyk array list penampunya

                    String msgParkiran = ""; //gunakan utk menampung nama parkiran yg dikasih delimiter buat dikirim ke client
                    //lakukan looping utk mengambil data nama Parkiran
                    for (serveruasdisprog.DaftarParkir dp : listParkiran) {
                        msgParkiran += dp.getLokasi().toString() + ":";
                    }
                    //kirim pesan ke client
                    sendChat(msgParkiran);
                } else if (command.equals("CekLotParkir")) {
                    String lokasiParkir = msgSplit[1];
                    String tanggal = msgSplit[2];
                    int kapasitas = bacaKapasitas(lokasiParkir);
                    String capacity = String.valueOf(kapasitas);
                    int idLokasiParkir = bacaIdLokasi(lokasiParkir);
                    String idLokasi = String.valueOf(idLokasiParkir); //baca id lokasi utk diinsert ke query baca lot parkir
                    ArrayList<Integer> lotTerisi = new ArrayList<>();
                    lotTerisi = (ArrayList<Integer>) bacaLotTerisi(idLokasiParkir, tanggal);
                    //DEKLARASIKAN MESSAGE UTK DIKIRIM KE USER
                    String msgToClient = capacity + ":";
                    //LAKUKAN LOOPING UTK MEMBACA SETIAP LIST DARI LOT
                    for (Integer lot : lotTerisi) {
                        String lotParkir = String.valueOf(lot);
                        msgToClient += lotParkir + ",";
                    }
                    sendChat(msgToClient);
                } else if (command.equals("REGISTER")) {
                    String nama = msgSplit[1];
                    String email = msgSplit[2];
                    String username = msgSplit[3];
                    String password = msgSplit[4];
                    if (checkRegister(username) == true) {
                        sendChat("Maaf, akun dengan username yang Anda pilih sudah digunakan!");
                    } else {
                        insertData(nama, email, username, password);
                        sendChat("REGISTER BERHASIL");
                    }
                } else if (command.equals("BOOK")) {
                    String lokasi = msgSplit[1];
                    String tglpesan = msgSplit[2];
                    String noplat = msgSplit[3];
                    String lot = msgSplit[4];
                    String username = msgSplit[5];

                    int lokasiInt = bacaIdLokasi(lokasi);
                    int lotInt = Integer.parseInt(lot);
                    int userId = cariIDUser(username);

                    insertReservationParkir(noplat, lokasiInt, lotInt, tglpesan, userId, lokasiInt);
                    sendChat("BOOK BERHASIL");
                } else if (command.equals("BacaAcara")) {
                    ArrayList<serveruasdisprog.DaftarAcara> listAcara = new ArrayList<>();
                    listAcara = (ArrayList<serveruasdisprog.DaftarAcara>) getDaftarAcara();

                    String msgAcara = ""; //gunakan utk menampung nama parkiran yg dikasih delimiter buat dikirim ke client
                    //lakukan looping utk mengambil data nama Parkiran
                    for (serveruasdisprog.DaftarAcara da : listAcara) {
                        msgAcara += da.getNama() + ":" + da.getJenis() + ":"
                                + da.getTanggalPelaksanaan() + ":" + da.getHarga() + ":" + da.getKapasitas()
                                + ":" + da.getLokasi() + "!";
                    }
//                    //kirim pesan ke client
                    sendChat(msgAcara);
                } else if (command.equals("Bayar")) {
//                    int jumlahTiket = Integer.parseInt(msgSplit[1]);
                    String username = msgSplit[2];
                    String namaAcara = msgSplit[3];
                    int hargaTiket = Integer.parseInt(msgSplit[1]);
                    int idAkun = cariIDUser(username);
                    int idDaftarAcara = cariIdAcara(namaAcara);
                    String idTiket = msgSplit[4];
                    insertReservasiAcara(hargaTiket, idAkun, idDaftarAcara);
                   
                    int idReservasi = reservasiBaru();
                    insertReservasiTiket(idTiket, idReservasi);
                    
                    updateKapasitasAcara(namaAcara); //update kapasitas kurangin 1
                    sendChat(String.valueOf("BAYAR BERHASIL"));
                    
                    
                }
                else if(command.equals("BacaTiket"))
                {
                    String msgTiket = "";
                    try
                    {
                        String username = msgSplit[1];
                        //cari id dr user yg login
                        int idUser = cariIDUser(username);
                        ArrayList<serveruasdisprog.Tiket> listTiket = new ArrayList<>();
                        listTiket = (ArrayList<serveruasdisprog.Tiket>)getTickets(idUser);
                        // Panggil method untuk mendapatkan daftar tiket dari database
                        //List<Tiket> listTiket = getTickets();
                       
                       
                         // Looping untuk membaca setiap tiket dan menambahkannya ke pesan
                        for (serveruasdisprog.Tiket tiket : listTiket) {
                            // Dapatkan data yang diperlukan dari tiket
                            String kode = tiket.getKode();
                            String status = tiket.getStatus();
                            String namaAcara = tiket.getIdReservasi().getIdDaftarAcaraa().getNama();
                            String jenisAcara = tiket.getIdReservasi().getIdDaftarAcaraa().getJenis();
                            String tanggalAcara = tiket.getIdReservasi().getIdDaftarAcaraa().getTanggalPelaksanaan();
                            String lokasiAcara = tiket.getIdReservasi().getIdDaftarAcaraa().getLokasi();

                            // Tambahkan data tiket ke dalam pesan dengan format yang diinginkan
                            msgTiket +=kode + ":"+ status + ":" + namaAcara + ":" + jenisAcara+
                                    ":" + tanggalAcara + ":" + lokasiAcara + "!";
                            System.out.println(msgTiket);
                        }
                        sendChat(msgTiket);
                    }
                    catch(Exception ex)
                    {
                        System.out.println(ex);
                    }
                }
                  else if (command.equals("UpdateStatusToClaim")) {
                    // Panggil method updateStatusToClaim dengan kode tiket yang diberikan
                    String kodeTiket = msgSplit[1];
                    updateStatusToClaim(kodeTiket);
                    sendChat("Selamat");
                }
            }
        } catch (Exception ex) {
            System.out.println("Error in run HS: " + ex);
        }
    }

    public void sendChat(String msg) //Method buat kirim pesan ke user (notifikasi login gagal/berhasil,dll)
    {
        try {
            out.writeBytes(msg + "\n");
        } catch (Exception ex) {
            System.out.println("Error in sendChat: " + ex.getMessage());
        }

    }

    //INI BUAT CHECK LOGIN DARI WEBSERVICE
    private static Boolean checkLogin(java.lang.String username, java.lang.String password) {
        serveruasdisprog.Testloginservices_Service service = new serveruasdisprog.Testloginservices_Service();
        serveruasdisprog.Testloginservices port = service.getTestloginservicesPort();
        return port.checkLogin(username, password);
    }

    private static void insertData(java.lang.String nama, java.lang.String email, java.lang.String username, java.lang.String password) {
        serveruasdisprog.Testloginservices_Service service = new serveruasdisprog.Testloginservices_Service();
        serveruasdisprog.Testloginservices port = service.getTestloginservicesPort();
        port.insertData(nama, email, username, password);
    }

    private static java.util.List<serveruasdisprog.DaftarParkir> bacaParkiran() {
        serveruasdisprog.Testloginservices_Service service = new serveruasdisprog.Testloginservices_Service();
        serveruasdisprog.Testloginservices port = service.getTestloginservicesPort();
        return port.bacaParkiran();
    }

    private static java.util.List<java.lang.Integer> bacaLotTerisi(int daftarParkirId, java.lang.String tanggal) {
        serveruasdisprog.Testloginservices_Service service = new serveruasdisprog.Testloginservices_Service();
        serveruasdisprog.Testloginservices port = service.getTestloginservicesPort();
        return port.bacaLotTerisi(daftarParkirId, tanggal);
    }

    private static int bacaIdLokasi(java.lang.String nama) {
        serveruasdisprog.Testloginservices_Service service = new serveruasdisprog.Testloginservices_Service();
        serveruasdisprog.Testloginservices port = service.getTestloginservicesPort();
        return port.bacaIdLokasi(nama);
    }

    private static Integer bacaKapasitas(java.lang.String nama) {
        serveruasdisprog.Testloginservices_Service service = new serveruasdisprog.Testloginservices_Service();
        serveruasdisprog.Testloginservices port = service.getTestloginservicesPort();
        return port.bacaKapasitas(nama);
    }

    private static Integer cariIDUser(java.lang.String username) {
        serveruasdisprog.Testloginservices_Service service = new serveruasdisprog.Testloginservices_Service();
        serveruasdisprog.Testloginservices port = service.getTestloginservicesPort();
        return port.cariIDUser(username);
    }

    private static Boolean checkRegister(java.lang.String username) {
        serveruasdisprog.Testloginservices_Service service = new serveruasdisprog.Testloginservices_Service();
        serveruasdisprog.Testloginservices port = service.getTestloginservicesPort();
        return port.checkRegister(username);
    }

    private static void insertReservationParkir(java.lang.String noPlat, int harga, int noParkir, java.lang.String tanggal, int idAkun, int idDaftarParkir) {
        serveruasdisprog.Testloginservices_Service service = new serveruasdisprog.Testloginservices_Service();
        serveruasdisprog.Testloginservices port = service.getTestloginservicesPort();
        port.insertReservationParkir(noPlat, harga, noParkir, tanggal, idAkun, idDaftarParkir);
    }

    private static java.util.List<serveruasdisprog.DaftarAcara> getDaftarAcara() {
        serveruasdisprog.Testloginservices_Service service = new serveruasdisprog.Testloginservices_Service();
        serveruasdisprog.Testloginservices port = service.getTestloginservicesPort();
        return port.getDaftarAcara();
    }

    private static Integer bacaJumTiket(java.lang.Integer tiket) {
        serveruasdisprog.Testloginservices_Service service = new serveruasdisprog.Testloginservices_Service();
        serveruasdisprog.Testloginservices port = service.getTestloginservicesPort();
        return port.bacaJumTiket(tiket);
    }

    private static java.util.List<serveruasdisprog.DaftarAcara> getDaftarAcara_1() {
        serveruasdisprog.Testloginservices_Service service = new serveruasdisprog.Testloginservices_Service();
        serveruasdisprog.Testloginservices port = service.getTestloginservicesPort();
        return port.getDaftarAcara();
    }
    private static Integer cariIdAcara(java.lang.String name) {
        serveruasdisprog.Testloginservices_Service service = new serveruasdisprog.Testloginservices_Service();
        serveruasdisprog.Testloginservices port = service.getTestloginservicesPort();
        return port.cariIdAcara(name);
    }


    private static void insertReservasiTiket(java.lang.String kode, int idReservasi) {
        serveruasdisprog.Testloginservices_Service service = new serveruasdisprog.Testloginservices_Service();
        serveruasdisprog.Testloginservices port = service.getTestloginservicesPort();
        port.insertReservasiTiket(kode, idReservasi);
    }

    private static Integer reservasiBaru() {
        serveruasdisprog.Testloginservices_Service service = new serveruasdisprog.Testloginservices_Service();
        serveruasdisprog.Testloginservices port = service.getTestloginservicesPort();
        return port.reservasiBaru();
    }

    private static void insertReservasiAcara(int total, int idAkun, int idDaftarAcara) {
        serveruasdisprog.Testloginservices_Service service = new serveruasdisprog.Testloginservices_Service();
        serveruasdisprog.Testloginservices port = service.getTestloginservicesPort();
        port.insertReservasiAcara(total, idAkun, idDaftarAcara);
    }



    private static void updateStatusToClaim(java.lang.String arg0) {
        serveruasdisprog.Testloginservices_Service service = new serveruasdisprog.Testloginservices_Service();
        serveruasdisprog.Testloginservices port = service.getTestloginservicesPort();
        port.updateStatusToClaim(arg0);
    }



    private static void updateKapasitasAcara(java.lang.String namaAcara) {
        serveruasdisprog.Testloginservices_Service service = new serveruasdisprog.Testloginservices_Service();
        serveruasdisprog.Testloginservices port = service.getTestloginservicesPort();
        port.updateKapasitasAcara(namaAcara);
    }

    private static java.util.List<serveruasdisprog.Tiket> getTickets(int arg0) {
        serveruasdisprog.Testloginservices_Service service = new serveruasdisprog.Testloginservices_Service();
        serveruasdisprog.Testloginservices port = service.getTestloginservicesPort();
        return port.getTickets(arg0);
    }



}
