/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serveruasdisprog;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class ServerUASDisprog 
{

    /**
     * @param args the command line arguments
     */
        //INI SERVER YANG DIBUAT CONSOLE
        //DECLARE SOCKET DLL DISINI
        Socket incoming; 
        ServerSocket s;
        Thread t;
        ArrayList<HandleSocket> clients = new ArrayList<>(); //array yg menyimpan daftar client
        HandleSocket confirmClient;
        
        public ServerUASDisprog()
        {
            try
            {
                s = new ServerSocket(8282); //PASTIIN PORTNYA SAMA KYK DI CLIENT
            }
            catch(IOException ex)
            {
                Logger.getLogger(ServerUASDisprog.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public void start()
        {
             while(true)
                {
                 try {
                     incoming = s.accept();
                     confirmClient = new HandleSocket(this,incoming);
                     confirmClient.start(); //jalankan handle socket
                     clients.add(confirmClient); //setiap client akan ditambahkan ke dalam array
                 } catch (IOException ex) {
                     Logger.getLogger(ServerUASDisprog.class.getName()).log(Level.SEVERE, null, ex);
                 }
                    
                }
        }
//        //ini gatau butuh atau nggak soalnya ini ambil dr yg buat message
//        public void Broadcast(String message)
//        {
//            for(HandleSocket client : clients)
//            {
//                client.sendChat(message); //kirimkan message yang sama ke setiap client
//            }
//        }
        

    public static void main(String[] args) 
    {
        //DEKLARASI CONSTRUCTOR >> INI BIAR WAKTU DI RUN GA LGSG BUILD SUCCESSFUL
        ServerUASDisprog server = new ServerUASDisprog();
        server.start();
    }
    
}