import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CariPelanggan extends javax.swing.JInternalFrame {

    // atribut
    Connection con;
    PreparedStatement pst;
    String path=null;
    byte[] userimage=null;
    
    // constructor
    public CariPelanggan() {
        // method yang dipanggil
        initComponents();
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
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIDPelanggan = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

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

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
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
        txtFoto.setBounds(425, 180, 110, 110);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setText("No. Telepon");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(388, 112, 66, 16);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setText("Jenis Kelamin");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(388, 72, 80, 16);

        jButton3.setBackground(new java.awt.Color(0, 0, 204));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Kembali");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(592, 296, 119, 23);

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Perbaharui Data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(592, 255, 119, 23);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton1.setText("Ubah Gambar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(425, 296, 110, 23);

        jButton5.setBackground(new java.awt.Color(204, 0, 0));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Hapus Data");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(592, 214, 119, 23);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rafika\\Downloads\\WhatsApp Image 2021-12-12 at 1.46.22 PM.jpeg")); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(-20, -76, 790, 460);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 71, 740, 350));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("ID Pelanggan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 20, -1, 33));

        txtIDPelanggan.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtIDPelanggan.setForeground(new java.awt.Color(153, 51, 0));
        getContentPane().add(txtIDPelanggan, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 20, 200, -1));

        jButton4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton4.setText("Cari");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 20, 110, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rafika\\Downloads\\WhatsApp Image 2021-12-12 at 1.46.22 PM.jpeg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 790, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // method kembali atau back
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    // method cari data pelanggan
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
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
                String nik = rs.getString("nik");
                String idPaspor = rs.getString("idPaspor");
                String alamat = rs.getString("alamat");
                String tanggalLahir = rs.getString("tanggalLahir");
                Date tgl = new SimpleDateFormat("yyyy-MM-dd").parse(tanggalLahir);
                String jenisKelamin = rs.getString("jenisKelamin");
                if(jenisKelamin.equals("Laki-Laki")){
                    jk1.setSelected(true);
                    jk2.setSelected(false);
                } else {
                    jk2.setSelected(true);
                    jk1.setSelected(false);
                }
                String noTelepon = rs.getString("noTelepon");
                Blob blob = rs.getBlob("foto");
                byte[] _imagebytes=blob.getBytes(1, (int) blob.length());
                ImageIcon image = new ImageIcon(_imagebytes);
                Image im = image.getImage();
                Image img = im.getScaledInstance(txtFoto.getWidth(), txtFoto.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(img);
                txtNamaAwal.setText(namaAwal.trim());
                txtNamaAkhir.setText(namaAkhir.trim());
                txtNIK.setText(nik.trim());
                txtIDPaspor.setText(idPaspor.trim());
                txtAlamat.setText(alamat.trim());
                txtTanggalLahir.setDate(tgl);
                txtNoTelepon.setText(noTelepon.trim());
                txtFoto.setIcon(newImage);
            }
        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            Logger.getLogger(CariPelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_jButton4ActionPerformed

    // method memperbaharui data pelanggan
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
            pst = con.prepareStatement("update pelanggan set namaAwal=?, namaAkhir=?, nik=?, idPaspor=?, alamat=?, tanggalLahir=?, jenisKelamin=?, noTelepon=?, foto=? where idPelanggan=?");
            pst.setString(1, namaAwal);
            pst.setString(2, namaAkhir);
            pst.setString(3, nik);
            pst.setString(4, idPaspor);
            pst.setString(5, alamat);
            pst.setString(6, tanggalLahir);
            pst.setString(7, jenisKelamin);
            pst.setString(8, noTelepon);
            pst.setBytes(9, userimage);
            pst.setString(10, idPelanggan);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Pelanggan Berhasil diperbaharui dan Sudah Tersimpan.");
            txtNamaAwal.setText("");
            txtNamaAkhir.setText("");
            txtNIK.setText("");
            txtIDPaspor.setText("");
            txtAlamat.setText("");
            txtTanggalLahir.setDate(null);
            txtNoTelepon.setText("");
            txtNamaAwal.requestFocus();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CariPelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            Logger.getLogger(CariPelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // method menghapus data pelanggan
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            String idPelanggan = txtIDPelanggan.getText();
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/aurumdb", "root", "");
            pst = con.prepareStatement("delete from pelanggan where idPelanggan=?");
            pst.setString(1, idPelanggan);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Pelanggan Berhasil dihapus!");
            txtNamaAwal.setText("");
            txtNamaAkhir.setText("");
            txtNIK.setText("");
            txtIDPaspor.setText("");
            txtAlamat.setText("");
            txtTanggalLahir.setDate(null);
            txtNoTelepon.setText("");
            txtNamaAwal.requestFocus();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CariPelanggan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField txtIDPelanggan;
    private javax.swing.JTextField txtNIK;
    private javax.swing.JTextField txtNamaAkhir;
    private javax.swing.JTextField txtNamaAwal;
    private javax.swing.JTextField txtNoTelepon;
    private com.toedter.calendar.JDateChooser txtTanggalLahir;
    // End of variables declaration//GEN-END:variables
}
