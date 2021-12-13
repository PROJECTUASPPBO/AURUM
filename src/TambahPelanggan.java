import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TambahPelanggan extends javax.swing.JInternalFrame {

    // atribut
    Connection con;
    PreparedStatement pst;
    String path=null;
    byte[] userimage=null;
    
    // constructor
    public TambahPelanggan() {
        // method yang dipanggil
        initComponents();
        autoID();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNamaAwal = new javax.swing.JTextField();
        txtNamaAkhir = new javax.swing.JTextField();
        txtNIK = new javax.swing.JTextField();
        txtIDPaspor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtTanggalLahir = new com.toedter.calendar.JDateChooser();
        jk1 = new javax.swing.JRadioButton();
        jk2 = new javax.swing.JRadioButton();
        txtNoTelepon = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFoto = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIDPelanggan = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 355, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Nama Awal");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(33, 32, 64, 16);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Nama Akhir");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(33, 72, 66, 16);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("NIK");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(33, 112, 19, 16);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("ID Paspor");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(33, 151, 55, 16);

        txtNamaAwal.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jPanel1.add(txtNamaAwal);
        txtNamaAwal.setBounds(138, 30, 201, 21);

        txtNamaAkhir.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jPanel1.add(txtNamaAkhir);
        txtNamaAkhir.setBounds(138, 70, 201, 21);

        txtNIK.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jPanel1.add(txtNIK);
        txtNIK.setBounds(138, 110, 201, 21);

        txtIDPaspor.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jPanel1.add(txtIDPaspor);
        txtIDPaspor.setBounds(138, 149, 201, 21);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Alamat");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(33, 188, 40, 16);

        txtAlamat.setColumns(20);
        txtAlamat.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(138, 188, 201, 131);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setText("Tanggal Lahir");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(388, 32, 77, 16);

        txtTanggalLahir.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jPanel1.add(txtTanggalLahir);
        txtTanggalLahir.setBounds(510, 31, 201, 20);

        jk1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jk1.setText("Laki-Laki");
        jPanel1.add(jk1);
        jk1.setBounds(510, 69, 67, 23);

        jk2.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jk2.setText("Perempuan");
        jPanel1.add(jk2);
        jk2.setBounds(595, 69, 79, 23);

        txtNoTelepon.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jPanel1.add(txtNoTelepon);
        txtNoTelepon.setBounds(510, 110, 201, 21);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setText("Foto Profil");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(450, 158, 57, 16);

        txtFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtFoto);
        txtFoto.setBounds(424, 180, 110, 110);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setText("No. Telepon");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(388, 112, 66, 16);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setText("Jenis Kelamin");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(388, 72, 80, 16);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton1.setText("Cari Gambar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(424, 296, 110, 23);

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Tambah Data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(608, 249, 103, 23);

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
        jButton3.setBounds(608, 296, 103, 23);

        jLabel7.setFont(new java.awt.Font("Dialog", 2, 8)); // NOI18N
        jLabel7.setText("*tidak boleh lebih dari 11 angka");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(510, 137, 104, 10);

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rafika\\Downloads\\WhatsApp Image 2021-12-12 at 1.46.22 PM.jpeg")); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(-10, -60, 770, 440);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, 750, 360));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("ID Pelanggan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 19, -1, -1));

        txtIDPelanggan.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtIDPelanggan.setForeground(new java.awt.Color(153, 51, 0));
        txtIDPelanggan.setText("txtIDPelanggan");
        getContentPane().add(txtIDPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 19, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rafika\\Downloads\\WhatsApp Image 2021-12-12 at 1.46.22 PM.jpeg")); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // method memilih gambar atau foto pelanggan
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            JFileChooser pilfoto = new JFileChooser();
            pilfoto.showOpenDialog(null);
            File foto = pilfoto.getSelectedFile();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images", "png", "jpg");
            pilfoto.addChoosableFileFilter(filter);
            path = foto.getAbsolutePath();
            BufferedImage img;
            img = ImageIO.read(pilfoto.getSelectedFile());
            ImageIcon ikon = new ImageIcon (new ImageIcon(img).getImage().getScaledInstance(110, 110, Image.SCALE_DEFAULT));
            txtFoto.setIcon(ikon);
            File image = new File(path);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buff = new byte[1024];
            for(int readNum; (readNum=fis.read(buff)) !=-1; ){
                baos.write(buff, 0, readNum);
            }
            userimage=baos.toByteArray();
        } catch (IOException ex) {
            Logger.getLogger(TambahPelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // method menambah data pelanggan
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String idPelanggan = txtIDPelanggan.getText();
        String namaAwal = txtNamaAwal.getText();
        String namaAkhir = txtNamaAkhir.getText();
        String nik = txtNIK.getText();
        String idPaspor = txtIDPaspor.getText();
        String alamat = txtAlamat.getText();
        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
        String tanggalLahir = da.format(txtTanggalLahir.getDate());
        String jenisKelamin;
        if(jk1.isSelected()){
            jenisKelamin = "Laki-Laki";
        } else {
            jenisKelamin = "Perempuan";
        }
        String noTelepon = txtNoTelepon.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/aurumdb", "root", "");
            pst = con.prepareStatement("insert into pelanggan(idPelanggan, namaAwal, namaAkhir, nik, idPaspor, alamat, tanggalLahir, jenisKelamin, noTelepon, foto)values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, idPelanggan);
            pst.setString(2, namaAwal);
            pst.setString(3, namaAkhir);
            pst.setString(4, nik);
            pst.setString(5, idPaspor);
            pst.setString(6, alamat);
            pst.setString(7, tanggalLahir);
            pst.setString(8, jenisKelamin);
            pst.setString(9, noTelepon);
            pst.setBytes(10, userimage);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Registrasi Pelanggan Berhasil ditambahkan dan Sudah Tersimpan.");
            txtNamaAwal.setText("");
            txtNamaAkhir.setText("");
            txtNIK.setText("");
            txtIDPaspor.setText("");
            txtAlamat.setText("");
            txtTanggalLahir.setDate(null);
            txtNoTelepon.setText("");
            txtNamaAwal.requestFocus();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TambahPelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // method batal atau cancel
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    // method menampilkan ID otomatis
    public void autoID(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/aurumdb", "root", "");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select MAX(idPelanggan) from pelanggan");
            rs.next();
            rs.getString("MAX(idPelanggan)");
            if(rs.getString("MAX(idPelanggan)") == null){
                txtIDPelanggan.setText("PG001");
            } else {
                long idPelanggan = Long.parseLong(rs.getString("MAX(idPelanggan)").substring(2,rs.getString("MAX(idPelanggan)").length()));
                idPelanggan++;
                txtIDPelanggan.setText("PG" + String.format("%03d", idPelanggan));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TambahPelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jk1;
    private javax.swing.JRadioButton jk2;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JLabel txtFoto;
    private javax.swing.JTextField txtIDPaspor;
    private javax.swing.JLabel txtIDPelanggan;
    private javax.swing.JTextField txtNIK;
    private javax.swing.JTextField txtNamaAkhir;
    private javax.swing.JTextField txtNamaAwal;
    private javax.swing.JTextField txtNoTelepon;
    private com.toedter.calendar.JDateChooser txtTanggalLahir;
    // End of variables declaration//GEN-END:variables
}
