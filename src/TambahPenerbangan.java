
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
import javax.swing.JOptionPane;

public class TambahPenerbangan extends javax.swing.JInternalFrame {

    // atribut
    Connection con;
    PreparedStatement pst;
    
    // constructor
    public TambahPenerbangan() {
        // method yang dipanggil
        initComponents();
        autoID();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBiaya = new javax.swing.JTextField();
        txtNamaPenerbangan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTanggalKeberangkatan = new com.toedter.calendar.JDateChooser();
        txtJamKedatangan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtJamKeberangkatan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIDPenerbangan = new javax.swing.JLabel();
        txtAsal = new javax.swing.JComboBox();
        txtKeberangkatan = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("ID Penerbangan");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(33, 36, 90, 16);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Nama Penerbangan");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(33, 75, 112, 16);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Asal");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(33, 114, 25, 16);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Keberangkatan");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(33, 153, 87, 16);

        txtBiaya.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jPanel1.add(txtBiaya);
        txtBiaya.setBounds(611, 151, 201, 21);

        txtNamaPenerbangan.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jPanel1.add(txtNamaPenerbangan);
        txtNamaPenerbangan.setBounds(184, 73, 201, 21);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setText("Tanggal Keberangkatan");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(434, 36, 135, 16);

        txtTanggalKeberangkatan.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jPanel1.add(txtTanggalKeberangkatan);
        txtTanggalKeberangkatan.setBounds(611, 35, 201, 20);

        txtJamKedatangan.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jPanel1.add(txtJamKedatangan);
        txtJamKedatangan.setBounds(611, 112, 201, 21);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setText("Jam Kedatangan");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(434, 114, 96, 16);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setText("Jam Keberangkatan");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(434, 75, 115, 16);

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
        jButton2.setBounds(588, 210, 103, 23);

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
        jButton3.setBounds(709, 210, 103, 23);

        txtJamKeberangkatan.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jPanel1.add(txtJamKeberangkatan);
        txtJamKeberangkatan.setBounds(611, 73, 201, 21);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Biaya Penerbangan");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(434, 153, 110, 16);

        txtIDPenerbangan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtIDPenerbangan.setForeground(new java.awt.Color(153, 51, 0));
        txtIDPenerbangan.setText("txtIDPenerbangan");
        jPanel1.add(txtIDPenerbangan);
        txtIDPenerbangan.setBounds(184, 35, 201, 16);

        txtAsal.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtAsal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jakarta", "Bali", "Surabaya", "Malaysia", "Korea Selatan", "USA", "Turki", "Thailand" }));
        jPanel1.add(txtAsal);
        txtAsal.setBounds(184, 112, 201, 21);

        txtKeberangkatan.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtKeberangkatan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jakarta", "Bali", "Surabaya", "Malaysia", "Korea Selatan", "USA", "Turki", "Thailand" }));
        jPanel1.add(txtKeberangkatan);
        txtKeberangkatan.setBounds(184, 151, 201, 21);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rafika\\Downloads\\WhatsApp Image 2021-12-12 at 1.46.22 PM.jpeg")); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(-20, -30, 920, 340);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 24, 860, 270));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rafika\\Downloads\\WhatsApp Image 2021-12-12 at 1.46.22 PM.jpeg")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // method menambah data penerbangan
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String idPenerbangan = txtIDPenerbangan.getText();
        String namaPenerbangan = txtNamaPenerbangan.getText();
        String asal = txtAsal.getSelectedItem().toString().trim();
        String keberangkatan = txtKeberangkatan.getSelectedItem().toString().trim();
        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
        String tanggalKeberangkatan = da.format(txtTanggalKeberangkatan.getDate());
        String jamKeberangkatan = txtJamKeberangkatan.getText();
        String jamKedatangan = txtJamKedatangan.getText();
        String biaya = txtBiaya.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/aurumdb", "root", "");
            pst = con.prepareStatement("insert into penerbangan(idPenerbangan, namaPenerbangan, asal, keberangkatan, tanggalKeberangkatan, jamKeberangkatan, jamKedatangan, biaya)values(?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, idPenerbangan);
            pst.setString(2, namaPenerbangan);
            pst.setString(3, asal);
            pst.setString(4, keberangkatan);
            pst.setString(5, tanggalKeberangkatan);
            pst.setString(6, jamKeberangkatan);
            pst.setString(7, jamKedatangan);
            pst.setString(8, biaya);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Penerbangan Berhasil ditambahkan dan Sudah Tersimpan.");
            txtNamaPenerbangan.setText("");
            txtTanggalKeberangkatan.setDate(null);
            txtJamKeberangkatan.setText("");
            txtJamKedatangan.setText("");
            txtBiaya.setText("");
            txtNamaPenerbangan.requestFocus();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TambahPenerbangan.class.getName()).log(Level.SEVERE, null, ex);
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
            ResultSet rs = s.executeQuery("select MAX(idPenerbangan) from penerbangan");
            rs.next();
            rs.getString("MAX(idPenerbangan)");
            if(rs.getString("MAX(idPenerbangan)") == null){
                txtIDPenerbangan.setText("PT001");
            } else {
                long idPenerbangan = Long.parseLong(rs.getString("MAX(idPenerbangan)").substring(2,rs.getString("MAX(idPenerbangan)").length()));
                idPenerbangan++;
                txtIDPenerbangan.setText("PT" + String.format("%03d", idPenerbangan));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TambahPenerbangan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox txtAsal;
    private javax.swing.JTextField txtBiaya;
    private javax.swing.JLabel txtIDPenerbangan;
    private javax.swing.JTextField txtJamKeberangkatan;
    private javax.swing.JTextField txtJamKedatangan;
    private javax.swing.JComboBox txtKeberangkatan;
    private javax.swing.JTextField txtNamaPenerbangan;
    private com.toedter.calendar.JDateChooser txtTanggalKeberangkatan;
    // End of variables declaration//GEN-END:variables
}
