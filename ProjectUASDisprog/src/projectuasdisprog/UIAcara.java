package projectuasdisprog;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Leon
 */
public class UIAcara extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form event
     */
    private int hitungTiket = 0;
    private Set<String> usedIds = new HashSet<>();

    // Method to generate random alphanumeric ID
    private String generateRandomId() {
        Random random = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();

        // Generate two random letters
        for (int i = 0; i < 2; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }

        // Generate four random digits
        sb.append(random.nextInt(10000));

        String id = sb.toString();

        // Check if the ID is already used, generate new if it's used
        while (usedIds.contains(id)) {
            sb.setLength(0);
            for (int i = 0; i < 2; i++) {
                sb.append(characters.charAt(random.nextInt(characters.length())));
            }
            sb.append(random.nextInt(10000));
            id = sb.toString();
        }

        // Add to used IDs set
        usedIds.add(id);

        return id;
    }

    Socket clientSocket;
    Thread t;
    DataOutputStream out;
    BufferedReader in;

    public UIAcara() {
        try {
            initComponents();
           
            //UNTUK MULTITHREADING TCP
            //clientSocket = new Socket("localhost", 8282);
            clientSocket = new Socket("localhost", 8282);
            if (t == null) {
                t = new Thread(this, "Client");
                t.start();
            }

            //declare untuk in (terima message) dan out (kirim message)
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            out = new DataOutputStream(clientSocket.getOutputStream());

            // kirim data minta daftar acara yg tersedia
            sendMessage("BacaAcara:");
            // terima data parkiran yang dimiliki
            String message = in.readLine();
            String[] daftarAcara = message.split("!"); // split message dgn menggunakan : utk mendapatkan daftar semua tempat parkir
            DefaultTableModel model = (DefaultTableModel) TableAcara.getModel();
            model.setRowCount(0);
            Object[] rowData = new Object[6];

            // Get the current date
            LocalDate currentDate = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);

            for (String acara : daftarAcara) {
                String[] daftarAcaraa = acara.split(":");
                LocalDate eventDate = LocalDate.parse(daftarAcaraa[2], formatter);
                int kapasitas = Integer.parseInt(daftarAcaraa[4]);

                // Check if the event date is today or in the future
                if (!eventDate.isBefore(currentDate) && kapasitas > 0) {
                    rowData[0] = daftarAcaraa[0];
                    rowData[1] = daftarAcaraa[1];
                    rowData[2] = daftarAcaraa[2];
                    rowData[3] = daftarAcaraa[3];
                    rowData[4] = daftarAcaraa[4];
                    rowData[5] = daftarAcaraa[5];
                    model.addRow(rowData);
                }
            }
        } catch (Exception ex) {
            System.out.println("Error di daftar acara");
        }

        // Atur tinggi baris
        TableAcara.setRowHeight(50);
        TableAcara.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int selectedRow = TableAcara.getSelectedRow();
                    if (selectedRow != -1) {
                        DefaultTableModel model = (DefaultTableModel) TableAcara.getModel();
                        TxtNama.setText(model.getValueAt(selectedRow, 0).toString());
                        TxtJenis.setText(model.getValueAt(selectedRow, 1).toString());
                        TxtTanggal.setText(model.getValueAt(selectedRow, 2).toString());
                        TxtHarga.setText(model.getValueAt(selectedRow, 3).toString());
                        TxtKapasitas.setText(model.getValueAt(selectedRow, 4).toString());
                        TxtLokasi.setText(model.getValueAt(selectedRow, 5).toString());
                    }
                }
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TableAcara = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        buttonBatal1 = new javax.swing.JButton();
        buttonReservasi = new javax.swing.JButton();
        labelNama = new javax.swing.JLabel();
        labelJenis = new javax.swing.JLabel();
        labelLokasi = new javax.swing.JLabel();
        labelTanggal = new javax.swing.JLabel();
        labelKapasitas = new javax.swing.JLabel();
        labelJudul2 = new javax.swing.JLabel();
        LabelEvents = new javax.swing.JLabel();
        TxtNama = new javax.swing.JLabel();
        TxtHarga = new javax.swing.JLabel();
        TxtJenis = new javax.swing.JLabel();
        TxtTanggal = new javax.swing.JLabel();
        TxtKapasitas = new javax.swing.JLabel();
        TxtLokasi = new javax.swing.JLabel();
        LabelUser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(990, 654));
        getContentPane().setLayout(null);

        TableAcara.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TableAcara.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Jenis", "Tanggal", "Harga", "Kapasitas", "Lokasi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableAcara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableAcaraMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableAcara);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(54, 450, 880, 170);

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(290, 390, 80, 30);

        buttonBatal1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonBatal1.setText("Batal");
        buttonBatal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBatal1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonBatal1);
        buttonBatal1.setBounds(190, 390, 90, 30);

        buttonReservasi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buttonReservasi.setText("Reservasi");
        buttonReservasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReservasiActionPerformed(evt);
            }
        });
        getContentPane().add(buttonReservasi);
        buttonReservasi.setBounds(58, 387, 120, 33);

        labelNama.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelNama.setText("Nama");
        getContentPane().add(labelNama);
        labelNama.setBounds(54, 80, 70, 25);

        labelJenis.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelJenis.setText("Jenis");
        getContentPane().add(labelJenis);
        labelJenis.setBounds(54, 120, 100, 40);

        labelLokasi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelLokasi.setText("Lokasi");
        getContentPane().add(labelLokasi);
        labelLokasi.setBounds(54, 330, 70, 25);

        labelTanggal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelTanggal.setText("Tanggal");
        getContentPane().add(labelTanggal);
        labelTanggal.setBounds(54, 180, 100, 30);

        labelKapasitas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelKapasitas.setText("Kapasitas");
        getContentPane().add(labelKapasitas);
        labelKapasitas.setBounds(54, 280, 110, 25);

        labelJudul2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelJudul2.setText("Harga");
        getContentPane().add(labelJudul2);
        labelJudul2.setBounds(54, 230, 70, 30);

        LabelEvents.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LabelEvents.setText("EVENTS");
        getContentPane().add(LabelEvents);
        LabelEvents.setBounds(530, 550, 131, 48);

        TxtNama.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TxtNama.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(TxtNama);
        TxtNama.setBounds(230, 80, 151, 36);
        TxtNama.getAccessibleContext().setAccessibleName("TxtNama");

        TxtHarga.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(TxtHarga);
        TxtHarga.setBounds(231, 227, 205, 35);

        TxtJenis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(TxtJenis);
        TxtJenis.setBounds(231, 126, 205, 34);

        TxtTanggal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(TxtTanggal);
        TxtTanggal.setBounds(231, 178, 205, 37);

        TxtKapasitas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(TxtKapasitas);
        TxtKapasitas.setBounds(231, 274, 205, 36);

        TxtLokasi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(TxtLokasi);
        TxtLokasi.setBounds(231, 328, 205, 33);
        getContentPane().add(LabelUser);
        LabelUser.setBounds(1075, 21, 0, 0);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectuasdisprog/images/acara.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-80, -220, 1070, 1090);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonReservasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReservasiActionPerformed
        // TODO add your handling code here:
        // Cek apakah pengguna telah memilih daftar acara
        if (TxtNama.getText().isEmpty() || TxtJenis.getText().isEmpty() || TxtTanggal.getText().isEmpty()
                || TxtHarga.getText().isEmpty() || TxtKapasitas.getText().isEmpty() || TxtLokasi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Silakan pilih daftar acara terlebih dahulu.");
        } else {
            String namaAcara = TxtNama.getText();
            String username = LabelUser.getText();
            String jenisAcara = TxtJenis.getText();
            String tanggalAcara = TxtTanggal.getText();
            int hargaTiket = Integer.parseInt(TxtHarga.getText());
            int kapasitasTiket = Integer.parseInt(TxtKapasitas.getText());
            String lokasiAcara = TxtLokasi.getText();
            //int jumlahTiket = Integer.parseInt(txtTiket.getText());

            // Generate unique order ID
            String IdPesanan = generateRandomId();

            DetailPemesananTiket det = new DetailPemesananTiket();
            det.nama.setText(namaAcara);
            det.labelUser.setText(username);
            det.jenis.setText(jenisAcara);
            det.tanggal.setText(tanggalAcara);
            det.harga1.setText(String.valueOf(hargaTiket));
            det.lokasi.setText(lokasiAcara);
            
            det.id.setText(IdPesanan);

            det.setVisible(true);

            dispose();
        }


    }//GEN-LAST:event_buttonReservasiActionPerformed


    private void buttonBatal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBatal1ActionPerformed
        // TODO add your handling code here:
        TxtNama.setText("");
        TxtJenis.setText("");
        TxtLokasi.setText("");
        TxtTanggal.setText("");
        TxtKapasitas.setText("");
        TxtHarga.setText("");
        hitungTiket = 0;
    }//GEN-LAST:event_buttonBatal1ActionPerformed

    private void TableAcaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableAcaraMouseClicked
        // TODO add your handling code here:
        JTable model = (JTable) evt.getSource();
        int row = TableAcara.getSelectedRow(); //ambil index row yang sedang dipilih
        //ambil value pada (row index, column index)
        TxtNama.setText((String) model.getValueAt(row, 0));
        TxtJenis.setText((String) model.getValueAt(row, 1));
        TxtTanggal.setText((String) model.getValueAt(row, 2));
        TxtHarga.setText((String) model.getValueAt(row, 3));
        TxtKapasitas.setText((String) model.getValueAt(row, 4));
        TxtLokasi.setText((String) model.getValueAt(row, 5));
    }//GEN-LAST:event_TableAcaraMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ChooseSubMenu ch = new ChooseSubMenu();
        ch.labelUsername.setText(labelNama.getText());
        ch.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIAcara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIAcara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIAcara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIAcara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIAcara().setVisible(true);
            }
        });
    }

    public void sendMessage(String s) //METHOD UTK MENGIRIM PESAN KE SERVER
    {
//        try {
//            out.writeBytes(s + "\n");
//        } catch (Exception e) {
//        }

        try {
            out.writeBytes(s + "\n");
        } catch (IOException e) {;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelEvents;
    public javax.swing.JLabel LabelUser;
    private javax.swing.JTable TableAcara;
    private javax.swing.JLabel TxtHarga;
    private javax.swing.JLabel TxtJenis;
    private javax.swing.JLabel TxtKapasitas;
    private javax.swing.JLabel TxtLokasi;
    private javax.swing.JLabel TxtNama;
    private javax.swing.JLabel TxtTanggal;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton buttonBatal1;
    private javax.swing.JButton buttonReservasi;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelJenis;
    private javax.swing.JLabel labelJudul2;
    private javax.swing.JLabel labelKapasitas;
    private javax.swing.JLabel labelLokasi;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelTanggal;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {

        }
    }
    
    
}
