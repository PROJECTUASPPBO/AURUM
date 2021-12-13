import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PesanTiket extends javax.swing.JInternalFrame {
    
    // atribut
    Connection con;
    PreparedStatement pst;
    
    // constructor
    public PesanTiket() {
        // method yang dipanggil
        initComponents();
        autoID();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel6 = new javax.swing.JLabel();
        txtIDTiket = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtAsal = new javax.swing.JComboBox();
        txtKeberangkatan = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIDPelanggan = new javax.swing.JTextField();
        txtNamaAwal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtNamaAkhir = new javax.swing.JLabel();
        txtIDPaspor = new javax.swing.JLabel();
        txtIDPenerbangan = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNamaPenerbangan = new javax.swing.JLabel();
        txtJamKeberangkatan = new javax.swing.JLabel();
        txtKelas = new javax.swing.JComboBox();
        txtJmlTempatDuduk = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtBiaya = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtTotalBiaya = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtTanggalPemesanan = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 300, 0, 0));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("ID Tiket");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 22, -1, -1));

        txtIDTiket.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtIDTiket.setForeground(new java.awt.Color(153, 51, 0));
        txtIDTiket.setText("txtIDTiket");
        getContentPane().add(txtIDTiket, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 22, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("PILIH NEGARA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(490, 21, 97, 19);

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Pesan Tiket");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(952, 437, 97, 23);

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Batal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(952, 469, 97, 23);

        txtAsal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jakarta", "Bali", "Surabaya", "Malaysia", "Korea Selatan", "USA", "Turki", "Thailand" }));
        jPanel1.add(txtAsal);
        txtAsal.setBounds(34, 88, 350, 20);

        txtKeberangkatan.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtKeberangkatan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jakarta", "Bali", "Surabaya", "Malaysia", "Korea Selatan", "USA", "Turki", "Thailand" }));
        jPanel1.add(txtKeberangkatan);
        txtKeberangkatan.setBounds(713, 87, 350, 21);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Asal");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(188, 61, 25, 16);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Keberangkatan");
        jLabel3.setToolTipText("");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(846, 60, 87, 16);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("ID Penumpang");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(34, 269, 82, 16);

        txtIDPelanggan.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtIDPelanggan.setForeground(new java.awt.Color(153, 51, 0));
        jPanel1.add(txtIDPelanggan);
        txtIDPelanggan.setBounds(183, 269, 200, 21);

        txtNamaAwal.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtNamaAwal.setForeground(new java.awt.Color(153, 51, 0));
        txtNamaAwal.setText("****");
        jPanel1.add(txtNamaAwal);
        txtNamaAwal.setBounds(183, 304, 200, 15);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setText("Nama Akhir");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(35, 337, 66, 16);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setText("ID Paspor");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(35, 371, 55, 16);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setText("ID Penerbangan");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(542, 269, 90, 16);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel17.setText("Nama Awal");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(35, 303, 64, 16);

        txtNamaAkhir.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtNamaAkhir.setForeground(new java.awt.Color(153, 51, 0));
        txtNamaAkhir.setText("****");
        jPanel1.add(txtNamaAkhir);
        txtNamaAkhir.setBounds(183, 338, 200, 15);

        txtIDPaspor.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtIDPaspor.setForeground(new java.awt.Color(153, 51, 0));
        txtIDPaspor.setText("****");
        jPanel1.add(txtIDPaspor);
        txtIDPaspor.setBounds(183, 372, 200, 15);

        txtIDPenerbangan.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtIDPenerbangan.setForeground(new java.awt.Color(153, 51, 0));
        txtIDPenerbangan.setText("****");
        jPanel1.add(txtIDPenerbangan);
        txtIDPenerbangan.setBounds(692, 270, 200, 15);

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel21.setText("Tempat Duduk");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(542, 415, 82, 16);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setText("Nama Penerbangan");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(542, 296, 112, 16);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setText("Jam Keberangkatan");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(542, 327, 115, 16);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setText("Kelas Penerbangan");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(542, 356, 111, 16);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setText("Biaya");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(542, 386, 31, 16);

        txtNamaPenerbangan.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtNamaPenerbangan.setForeground(new java.awt.Color(153, 51, 0));
        txtNamaPenerbangan.setText("****");
        jPanel1.add(txtNamaPenerbangan);
        txtNamaPenerbangan.setBounds(692, 297, 200, 15);

        txtJamKeberangkatan.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtJamKeberangkatan.setForeground(new java.awt.Color(153, 51, 0));
        txtJamKeberangkatan.setText("****");
        jPanel1.add(txtJamKeberangkatan);
        txtJamKeberangkatan.setBounds(692, 328, 200, 15);

        txtKelas.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtKelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ekonomi", "Bisnis" }));
        jPanel1.add(txtKelas);
        txtKelas.setBounds(692, 354, 200, 21);

        txtJmlTempatDuduk.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtJmlTempatDuduk.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtJmlTempatDudukStateChanged(evt);
            }
        });
        jPanel1.add(txtJmlTempatDuduk);
        txtJmlTempatDuduk.setBounds(692, 413, 200, 22);

        jTable1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Penerbangan", "Nama Penerbangan", "Asal", "Keberangkatan", "Tanggal Keberangkatan", "Jam Keberangkatan", "Jam Kedatangan", "Biaya"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(34, 158, 1029, 93);

        jButton4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton4.setText("Cari");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(475, 124, 122, 23);

        jButton5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton5.setText("Cari");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(401, 269, 55, 23);

        txtBiaya.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtBiaya.setForeground(new java.awt.Color(153, 51, 0));
        txtBiaya.setText("****");
        jPanel1.add(txtBiaya);
        txtBiaya.setBounds(692, 387, 200, 15);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setText("Total Biaya");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(542, 466, 97, 24);

        txtTotalBiaya.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTotalBiaya.setForeground(new java.awt.Color(153, 51, 0));
        txtTotalBiaya.setText("****");
        jPanel1.add(txtTotalBiaya);
        txtTotalBiaya.setBounds(692, 466, 210, 24);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel15.setText("Tanggal Pemesanan");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(925, 269, 116, 16);

        txtTanggalPemesanan.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jPanel1.add(txtTanggalPemesanan);
        txtTanggalPemesanan.setBounds(910, 296, 153, 20);

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rafika\\Downloads\\WhatsApp Image 2021-12-12 at 1.46.22 PM.jpeg")); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(-20, -66, 1130, 610);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 57, 1110, 520));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rafika\\Downloads\\WhatsApp Image 2021-12-12 at 1.46.22 PM.jpeg")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // method batal atau cancel
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    // method pesan tiket
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String idTiket = txtIDTiket.getText();
        String idPenerbangan = txtIDPenerbangan.getText();
        String idPelanggan = txtIDPelanggan.getText();
        String kelas = txtKelas.getSelectedItem().toString().trim();
        String jmlTempatDuduk = txtJmlTempatDuduk.getValue().toString();
        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
        String tanggalPemesanan = da.format(txtTanggalPemesanan.getDate());
        String totalBiaya = txtTotalBiaya.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/aurumdb", "root", "");
            pst = con.prepareStatement("insert into tiket(idTiket, idPenerbangan, idPelanggan, kelas, jmlTempatDuduk, tanggalPemesanan, totalBiaya)values(?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, idTiket);
            pst.setString(2, idPenerbangan);
            pst.setString(3, idPelanggan);
            pst.setString(4, kelas);
            pst.setString(5, jmlTempatDuduk);
            pst.setString(6, tanggalPemesanan);
            pst.setString(7, totalBiaya);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Tiket Berhasil dipesan.");
            txtIDPelanggan.setText("");
            txtNamaAwal.setText("****");
            txtNamaAkhir.setText("****");
            txtIDPaspor.setText("****");
            txtIDPenerbangan.setText("****");
            txtNamaPenerbangan.setText("****");
            txtJamKeberangkatan.setText("****");
            txtBiaya.setText("****");
            txtJmlTempatDuduk.setValue(0);
            txtTotalBiaya.setText("****");
            txtTanggalPemesanan.setDate(null);
            txtNamaAwal.requestFocus();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TambahPenerbangan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // method cari penerbangan
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String asal = txtAsal.getSelectedItem().toString().trim();
        String keberangkatan = txtKeberangkatan.getSelectedItem().toString().trim();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/aurumdb", "root", "");
            pst = con.prepareStatement("select * from penerbangan where asal=? and keberangkatan=?");
            pst.setString(1, asal);
            pst.setString(2, keberangkatan);
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int c;
            c = rsmd.getColumnCount();
            DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
            dtm.setRowCount(0);
            while(rs.next()){
                Vector v2 = new Vector();
                for(int i=1; i<=c; i++){
                    v2.add(rs.getString("idPenerbangan"));
                    v2.add(rs.getString("namaPenerbangan"));
                    v2.add(rs.getString("asal"));
                    v2.add(rs.getString("keberangkatan"));
                    v2.add(rs.getString("tanggalKeberangkatan"));
                    v2.add(rs.getString("jamKeberangkatan"));
                    v2.add(rs.getString("jamKedatangan"));
                    v2.add(rs.getString("biaya"));
                }
                dtm.addRow(v2);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PesanTiket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // method cari data pelanggan
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String idPelanggan = txtIDPelanggan.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/aurumdb", "root", "");
            pst = con.prepareStatement("select * from pelanggan where idPelanggan=?");
            pst.setString(1, idPelanggan);
            ResultSet rs = pst.executeQuery();
            if(rs.next() == false){
                JOptionPane.showMessageDialog(this, "Data yang dicari Tidak Ada!");
            } else{
                String namaAwal = rs.getString("namaAwal");
                String namaAkhir = rs.getString("namaAkhir");
                String idPaspor = rs.getString("idPaspor");
                txtNamaAwal.setText(namaAwal.trim());
                txtNamaAkhir.setText(namaAkhir.trim());
                txtIDPaspor.setText(idPaspor.trim());
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PesanTiket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    // method memilih jadwal penerbangan
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        txtIDPenerbangan.setText(dtm.getValueAt(selectIndex, 0).toString());
        txtNamaPenerbangan.setText(dtm.getValueAt(selectIndex, 1).toString());
        txtJamKeberangkatan.setText(dtm.getValueAt(selectIndex, 5).toString());
        txtBiaya.setText(dtm.getValueAt(selectIndex, 7).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    // method menghitung jumlah tempat duduk dan total biaya
    private void txtJmlTempatDudukStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtJmlTempatDudukStateChanged
        int harga = Integer.parseInt(txtBiaya.getText());
        int jml = Integer.parseInt(txtJmlTempatDuduk.getValue().toString());
        String kelas = (String) txtKelas.getSelectedItem();
        int tharga;
        switch (kelas) {
            case "Ekonomi":
            tharga = harga * jml;
            txtTotalBiaya.setText(String.valueOf(tharga));
            break;
            case "Bisnis":
            tharga = harga * jml + 1500000;
            txtTotalBiaya.setText(String.valueOf(tharga));
            break;
        }
    }//GEN-LAST:event_txtJmlTempatDudukStateChanged

    // method menampilkan ID otomatis
    public void autoID(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/aurumdb", "root", "");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select MAX(idTiket) from tiket");
            rs.next();
            rs.getString("MAX(idTiket)");
            if(rs.getString("MAX(idTiket)") == null){
                txtIDTiket.setText("T0001");
            } else {
                long idTiket = Long.parseLong(rs.getString("MAX(idTiket)").substring(2,rs.getString("MAX(idTiket)").length()));
                idTiket++;
                txtIDTiket.setText("T" + String.format("%04d", idTiket));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PesanTiket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox txtAsal;
    private javax.swing.JLabel txtBiaya;
    private javax.swing.JLabel txtIDPaspor;
    private javax.swing.JTextField txtIDPelanggan;
    private javax.swing.JLabel txtIDPenerbangan;
    private javax.swing.JLabel txtIDTiket;
    private javax.swing.JLabel txtJamKeberangkatan;
    private javax.swing.JSpinner txtJmlTempatDuduk;
    private javax.swing.JComboBox txtKeberangkatan;
    private javax.swing.JComboBox txtKelas;
    private javax.swing.JLabel txtNamaAkhir;
    private javax.swing.JLabel txtNamaAwal;
    private javax.swing.JLabel txtNamaPenerbangan;
    private com.toedter.calendar.JDateChooser txtTanggalPemesanan;
    private javax.swing.JLabel txtTotalBiaya;
    // End of variables declaration//GEN-END:variables
}
