/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import koneksi.koneksiDB;

/**
 *
 * @author USER
 */
public class regMenu extends javax.swing.JFrame {

    /**
     * Creates new form regMenu
     */
    public regMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tbHome = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        isiEmail = new javax.swing.JTextField();
        isiPassword = new javax.swing.JPasswordField();
        isiUsername = new javax.swing.JTextField();
        tbRegister = new javax.swing.JButton();
        tbHapus = new javax.swing.JButton();
        pilihPembeli = new javax.swing.JRadioButton();
        pilihPegawai = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 450));
        setMinimumSize(new java.awt.Dimension(800, 450));

        jPanel2.setMaximumSize(new java.awt.Dimension(800, 450));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 450));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 450));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(61, 61, 61));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(241, 242, 246));
        jLabel6.setText("Reigster Form");

        tbHome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbHome.setForeground(new java.awt.Color(102, 255, 255));
        tbHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8_home_page_64.png"))); // NOI18N
        tbHome.setText("HOME");
        tbHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 327, Short.MAX_VALUE)
                .addComponent(tbHome, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbHome))
                .addGap(40, 40, 40))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 70));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 140, 50));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 130, 60));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E-Mail");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 110, 50));

        isiEmail.setBackground(new java.awt.Color(241, 242, 246));
        isiEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(isiEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 230, 50));

        isiPassword.setBackground(new java.awt.Color(241, 242, 246));
        isiPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(isiPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 230, 50));

        isiUsername.setBackground(new java.awt.Color(241, 242, 246));
        isiUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(isiUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 230, 50));

        tbRegister.setBackground(new java.awt.Color(255, 63, 52));
        tbRegister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbRegister.setForeground(new java.awt.Color(255, 255, 255));
        tbRegister.setText("Register");
        tbRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(tbRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 130, 50));

        tbHapus.setBackground(new java.awt.Color(255, 63, 52));
        tbHapus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tbHapus.setForeground(new java.awt.Color(255, 255, 255));
        tbHapus.setText("Reset");
        tbHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbHapusActionPerformed(evt);
            }
        });
        jPanel2.add(tbHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 130, 50));

        pilihPembeli.setBackground(new java.awt.Color(15, 188, 249));
        buttonGroup2.add(pilihPembeli);
        pilihPembeli.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pilihPembeli.setForeground(new java.awt.Color(255, 255, 255));
        pilihPembeli.setText("Pembeli");
        pilihPembeli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(pilihPembeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 100, 50));

        pilihPegawai.setBackground(new java.awt.Color(15, 188, 249));
        buttonGroup2.add(pilihPegawai);
        pilihPegawai.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pilihPegawai.setForeground(new java.awt.Color(255, 255, 255));
        pilihPegawai.setText("Pegawai");
        pilihPegawai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(pilihPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 110, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/gtrans1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 740, 210));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/glatarbelakang2.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 450));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 450));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 450));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHomeMouseClicked
        // TODO add your handling code here:
        this.hide();
        mLogin login = new mLogin();
        login.setVisible(true);
    }//GEN-LAST:event_tbHomeMouseClicked

    private void hapuslayar(){
        isiUsername.setText("");
        isiPassword.setText("");
        isiEmail.setText("");
    }
    private void tbRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbRegisterActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Notifikasi");
        if(isiUsername.getText().equals("")){
            JOptionPane.showMessageDialog(frame, "Harap masukkan username!");
            isiUsername.requestFocus();
        }else if(isiPassword.getText().equals("")){
            JOptionPane.showMessageDialog(frame, "Password tidak boleh kosong");
        }else if(pilihPegawai.isSelected()){
            
            try{
                String sql = "INSERT INTO pegawai VALUES ('" + isiUsername.getText()+"','" + String.valueOf(isiPassword.getPassword()) + "','" + String.valueOf(isiEmail.getText()) + "')"; 
                java.sql.Connection conn = (Connection)koneksi.koneksiDB.myDB();
                java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(frame, "Berhasil Memasukan Data!");
                new mLogin().show();
                this.dispose();
            }catch(HeadlessException | SQLException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }else if(pilihPembeli.isSelected()){
            try{
                String sql ="INSERT INTO pembeli VALUES ('" + isiUsername.getText()+"','" + String.valueOf(isiPassword.getPassword()) + "','" + String.valueOf(isiEmail.getText()) + "')";
                java.sql.Connection conn = (Connection)koneksi.koneksiDB.myDB();
                java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(frame, "Berhasil Memasukan Data!");
                new mLogin().show();
                this.dispose();
            }catch(HeadlessException | SQLException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(frame, "Pilih salah satu!");
        }
    }//GEN-LAST:event_tbRegisterActionPerformed

    private void tbHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHapusActionPerformed
        // TODO add your handling code here:
        hapuslayar();
    }//GEN-LAST:event_tbHapusActionPerformed

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
            java.util.logging.Logger.getLogger(regMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new regMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField isiEmail;
    private javax.swing.JPasswordField isiPassword;
    private javax.swing.JTextField isiUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton pilihPegawai;
    private javax.swing.JRadioButton pilihPembeli;
    private javax.swing.JButton tbHapus;
    private javax.swing.JLabel tbHome;
    private javax.swing.JButton tbRegister;
    // End of variables declaration//GEN-END:variables
}
