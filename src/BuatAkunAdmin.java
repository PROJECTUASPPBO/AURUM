
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BuatAkunAdmin extends javax.swing.JInternalFrame {

    // atribut
    Connection con;
    PreparedStatement pst;
    
    // constructor
    public BuatAkunAdmin() {
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
        txtNamaAwal = new javax.swing.JTextField();
        txtNamaPengguna = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtNamaAkhir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIDAdmin = new javax.swing.JLabel();
        txtKataSandi = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("ID Admin");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(32, 28, 50, 16);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Nama Awal");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(32, 67, 64, 16);

        txtNamaAwal.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jPanel1.add(txtNamaAwal);
        txtNamaAwal.setBounds(174, 65, 201, 21);

        txtNamaPengguna.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jPanel1.add(txtNamaPengguna);
        txtNamaPengguna.setBounds(174, 143, 201, 21);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setText("Nama Pengguna");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(32, 145, 93, 16);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setText("Nama Akhir");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(32, 106, 66, 16);

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
        jButton2.setBounds(151, 230, 103, 23);

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
        jButton3.setBounds(272, 230, 103, 23);

        txtNamaAkhir.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jPanel1.add(txtNamaAkhir);
        txtNamaAkhir.setBounds(174, 104, 201, 21);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Kata Sandi");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(32, 184, 61, 16);

        txtIDAdmin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtIDAdmin.setForeground(new java.awt.Color(153, 51, 0));
        txtIDAdmin.setText("txtIDAdmin");
        jPanel1.add(txtIDAdmin);
        txtIDAdmin.setBounds(174, 27, 201, 16);
        jPanel1.add(txtKataSandi);
        txtKataSandi.setBounds(174, 183, 201, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rafika\\Downloads\\WhatsApp Image 2021-12-12 at 1.46.22 PM.jpeg")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-20, -20, 440, 320);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 21, 420, 290));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rafika\\Downloads\\WhatsApp Image 2021-12-12 at 1.46.22 PM.jpeg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // method menambah data admin
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String idAdmin = txtIDAdmin.getText();
        String namaAwal = txtNamaAwal.getText();
        String namaAkhir = txtNamaAkhir.getText();
        String namaPengguna = txtNamaPengguna.getText();
        String kataSandi = txtKataSandi.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/aurumdb", "root", "");
            pst = con.prepareStatement("insert into admin(idAdmin, namaAwal, namaAkhir, namaPengguna, kataSandi)values(?, ?, ?, ?, ?)");
            pst.setString(1, idAdmin);
            pst.setString(2, namaAwal);
            pst.setString(3, namaAkhir);
            pst.setString(4, namaPengguna);
            pst.setString(5, kataSandi);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Admin Berhasil ditambahkan dan Sudah Tersimpan.");
            txtNamaAwal.setText("");
            txtNamaAkhir.setText("");
            txtNamaPengguna.setText("");
            txtKataSandi.setText("");
            txtNamaAwal.requestFocus();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BuatAkunAdmin.class.getName()).log(Level.SEVERE, null, ex);
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
            ResultSet rs = s.executeQuery("select MAX(idAdmin) from admin");
            rs.next();
            rs.getString("MAX(idAdmin)");
            if(rs.getString("MAX(idAdmin)") == null){
                txtIDAdmin.setText("UA001");
            } else {
                long idAdmin = Long.parseLong(rs.getString("MAX(idAdmin)").substring(2,rs.getString("MAX(idAdmin)").length()));
                idAdmin++;
                txtIDAdmin.setText("AU" + String.format("%03d", idAdmin));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BuatAkunAdmin.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtIDAdmin;
    private javax.swing.JPasswordField txtKataSandi;
    private javax.swing.JTextField txtNamaAkhir;
    private javax.swing.JTextField txtNamaAwal;
    private javax.swing.JTextField txtNamaPengguna;
    // End of variables declaration//GEN-END:variables
}
