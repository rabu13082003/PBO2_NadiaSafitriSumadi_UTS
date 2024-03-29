/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;
import Database.Koneksi;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class address extends javax.swing.JFrame {
    Koneksi myObject;
    
    public DefaultTableModel modelTabelBooking;

    /**
     * Creates new form Booking
     */
    public address() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        myObject = new Koneksi();
        modelTabelBooking = new DefaultTableModel();
        tabelBooking.setModel(modelTabelBooking);
        modelTabelBooking.addColumn("id");
        modelTabelBooking.addColumn("nama");
        modelTabelBooking.addColumn("jenis_kelamin");
        modelTabelBooking.addColumn("no_telepon");
        modelTabelBooking.addColumn("alamat");
        modelTabelBooking.addColumn("email");
        tampilDataBooking();
        
    }
    
    public void tampilDataBooking(){
        try {
            modelTabelBooking.getDataVector().removeAllElements();
            modelTabelBooking.fireTableDataChanged();
        
            PreparedStatement query = myObject.Konek.prepareStatement("SELECT * FROM alamat");
            ResultSet data = query.executeQuery();
            while (data.next()) {
            Object[] baris = new Object[6];
            baris[0] = data.getString("id");
            baris[1] = data.getString("nama");
            baris[2] = data.getString("jenis_kelamin");
            baris[3] = data.getString("no_telepon");
            baris[4] = data.getString("alamat");
            baris[5] = data.getString("email");
            
            modelTabelBooking.addRow(baris);
            
            }
            query.close();
            data.close();
            } catch (Exception e){
            }
        
    
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBooking = new javax.swing.JTextField();
        txtPackage = new javax.swing.JTextField();
        txtCustomer = new javax.swing.JTextField();
        txtBooking_Status = new javax.swing.JTextField();
        txtTotal_Price = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBooking = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtBooking1 = new javax.swing.JTextField();
        Bubah = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nama");

        jLabel2.setText("Jenis Kelamin");

        jLabel3.setText("No Telepon");

        jLabel4.setText("Alamat");

        jLabel5.setText("Email");

        txtBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookingActionPerformed(evt);
            }
        });

        txtPackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPackageActionPerformed(evt);
            }
        });

        jButton1.setText("Simpan ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabelBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tabelBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBookingMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBooking);

        jLabel6.setText("ID");

        txtBooking1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBooking1ActionPerformed(evt);
            }
        });

        Bubah.setText("ubah");
        Bubah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BubahMouseClicked(evt);
            }
        });
        Bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BubahActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(Bubah)
                                .addGap(41, 41, 41)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addComponent(txtBooking1)
                            .addComponent(txtBooking)
                            .addComponent(txtPackage)
                            .addComponent(txtCustomer)
                            .addComponent(txtBooking_Status)
                            .addComponent(txtTotal_Price))
                        .addGap(0, 333, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtBooking1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtPackage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtBooking_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotal_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Bubah)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookingActionPerformed

    private void txtPackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPackageActionPerformed
        // TODO add your handling
    }//GEN-LAST:event_txtPackageActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            
            if (txtBooking1.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "ID belum di isi");
                txtBooking1.requestFocus();
            }else if (txtBooking.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "NAMA belum di isi");
                txtBooking.requestFocus();
            }else if (txtPackage.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "JENIS KELAMIN belum di isi");
                txtPackage.requestFocus();
            }else if (txtCustomer.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "NO TELPON belum di isi");
                txtCustomer.requestFocus();
            }else if (txtBooking_Status.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "ALAMAT belum di isi");
                txtBooking_Status.requestFocus();
            }else if (txtTotal_Price.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "EMAIL belum di isi");
                txtTotal_Price.requestFocus();
            }else{
                String sql = "insert into alamat value ('"+txtBooking1.getText()+"','"+txtBooking.getText()+"','"+txtPackage.getText()+"','"+txtCustomer.getText()+"','"+txtBooking_Status.getText()+"','"+txtTotal_Price.getText()+"')";
                myObject.Konek.createStatement().execute(sql);
                tampilDataBooking();
                JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBookingMouseClicked
        // TODO add your handling code here:
        int baris = tabelBooking.getSelectedRow();
        String id = tabelBooking.getValueAt(baris, 0).toString();
        String nama = tabelBooking.getValueAt(baris, 1).toString();
        String jenis_kelamin = tabelBooking.getValueAt(baris, 2).toString();
        String no_telepon= tabelBooking.getValueAt(baris, 3).toString();
        String alamat = tabelBooking.getValueAt(baris, 4).toString();
        String email = tabelBooking.getValueAt(baris, 5).toString();
        txtBooking1.setText(id);
        txtBooking.setText(nama);
        txtPackage.setText(jenis_kelamin);
        txtCustomer.setText(no_telepon);
        txtBooking_Status.setText(alamat);
         txtTotal_Price.setText(email);
    }//GEN-LAST:event_tabelBookingMouseClicked

    private void txtBooking1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBooking1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBooking1ActionPerformed

    private void BubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BubahActionPerformed
        
    }//GEN-LAST:event_BubahActionPerformed

    private void BubahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BubahMouseClicked
     try {
    if (txtBooking1.getText().isEmpty() || txtBooking.getText().isEmpty() ||
        txtPackage.getText().isEmpty() || txtCustomer.getText().isEmpty() ||
        txtBooking_Status.getText().isEmpty() || txtTotal_Price.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Silahkan Pilih Data Terlebih Dahulu");
    } else {
        String sql = "UPDATE alamat SET nama=?, jenis_kelamin=?, no_telepon=?, alamat=?, email=? WHERE id=?";
        PreparedStatement ubah = myObject.Konek.prepareStatement(sql);
        
        ubah.setString(1, txtBooking.getText());
        ubah.setString(2, txtPackage.getText());
        ubah.setString(3, txtCustomer.getText());
        ubah.setString(4, txtBooking_Status.getText());
        ubah.setString(5, txtTotal_Price.getText());
        ubah.setString(6, txtBooking1.getText()); // Urutan ini seharusnya sesuai dengan urutan di query SQL
        ubah.executeUpdate();
        
        JOptionPane.showMessageDialog(this, "Data Berhasil Diubah!");
        tampilDataBooking();
            }
        } catch (Exception e) {
             e.printStackTrace(); // Tambahkan ini untuk melihat error pada konsol
                 JOptionPane.showMessageDialog(this, "Terjadi Kesalahan: " + e.getMessage());
}

    }//GEN-LAST:event_BubahMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try {
            if (
                (txtBooking1.getText().isEmpty()) &&
                    (txtBooking.getText().isEmpty()) &&
                    (txtPackage.getText().isEmpty()) &&
                    (txtCustomer.getText().isEmpty()) &&
                    (txtBooking_Status.getText().isEmpty()) &&
                    (txtTotal_Price.getText().isEmpty()) 
                ){
                JOptionPane.showMessageDialog(this, "Silahkan Pilih Data Terlebih Dahulu");
            }else
            {
                String sql = "DELETE FROM alamat WHERE id=?";
                PreparedStatement hapus = myObject.Konek.prepareStatement(sql);
                hapus.setString(1, txtBooking1.getText());
                hapus.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus!");
                tampilDataBooking();
            }
        } catch (Exception e){
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        txtBooking1.setText("");
        txtBooking.setText("");
        txtPackage.setText("");
        txtCustomer.setText("");
        txtBooking_Status.setText("");
        txtTotal_Price.setText("");
    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(address.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(address.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(address.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(address.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new address().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bubah;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelBooking;
    private javax.swing.JTextField txtBooking;
    private javax.swing.JTextField txtBooking1;
    private javax.swing.JTextField txtBooking_Status;
    private javax.swing.JTextField txtCustomer;
    private javax.swing.JTextField txtPackage;
    private javax.swing.JTextField txtTotal_Price;
    // End of variables declaration//GEN-END:variables
}
