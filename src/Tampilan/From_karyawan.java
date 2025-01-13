
package Tampilan;

import com.stripbandunk.jwidget.JDynamicTable;
import com.stripbandunk.jwidget.model.DynamicTableModel;
import entity.karyawan;
import Service.karyawan_service;
import java.util.List;
import Service.karyawan_service;
import javax.swing.JOptionPane;
import Tampilan.Menu_utama;
import Tampilan.Ubah_karyawan;

public class From_karyawan extends javax.swing.JFrame {

    private DynamicTableModel<karyawan> tablemodel;
    private JDynamicTable jDynamictable;
        
private void reload(){
    tablemodel.clear();
    karyawan_service service =new karyawan_service();
    List<karyawan>list =service.Tampil();
    for(karyawan pel : list){
        tablemodel.add(pel);
    }
}
    public From_karyawan() {
        initComponents();
         tablemodel = new DynamicTableModel<>(karyawan.class);
        jDynamictable= new JDynamicTable(tablemodel);
        jScrollPane1.setViewportView(jDynamictable);
    reload();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ubah = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Kembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Tx_kode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Tx_nama = new javax.swing.JTextField();
        Tx_alamat = new javax.swing.JTextField();
        Tx_no = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 0));

        Ubah.setBackground(new java.awt.Color(0, 102, 102));
        Ubah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Ubah.setForeground(new java.awt.Color(255, 255, 255));
        Ubah.setText("UBAH");
        Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahActionPerformed(evt);
            }
        });

        Hapus.setBackground(new java.awt.Color(0, 102, 102));
        Hapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Hapus.setForeground(new java.awt.Color(255, 255, 255));
        Hapus.setText("HAPUS");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });

        Kembali.setBackground(new java.awt.Color(255, 0, 0));
        Kembali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Kembali.setForeground(new java.awt.Color(255, 255, 255));
        Kembali.setText("X");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Kode Karyawan");

        Tx_kode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tx_kode.setForeground(new java.awt.Color(0, 102, 102));

        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Nama Karyawan");

        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Alamat");

        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("No_telp");

        Tx_nama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tx_nama.setForeground(new java.awt.Color(0, 102, 102));

        Tx_alamat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tx_alamat.setForeground(new java.awt.Color(0, 102, 102));

        Tx_no.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tx_no.setForeground(new java.awt.Color(0, 102, 102));

        tambah.setBackground(new java.awt.Color(0, 102, 102));
        tambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tambah.setForeground(new java.awt.Color(255, 255, 255));
        tambah.setText("TAMBAH");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("FROM KARYAWAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tambah)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Tx_no, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Tx_alamat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                        .addComponent(Tx_nama, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(123, 123, 123))
                                        .addComponent(Tx_kode, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel5))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Ubah)
                                .addGap(18, 18, 18)
                                .addComponent(Hapus))))
                    .addComponent(Kembali))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Kembali))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ubah)
                            .addComponent(Hapus)
                            .addComponent(tambah)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tx_kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tx_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tx_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tx_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
karyawan pel = new karyawan();

pel.setKode_karyawan(Tx_kode.getText());
pel.setnama_karyawan(Tx_nama.getText());
pel.setAlamat(Tx_alamat.getText());
pel.setNo_telp(Tx_no.getText());

karyawan_service kar = new karyawan_service();
kar.insertproduk(pel);
reload();
Tx_kode.setText("");
Tx_nama.setText("");
Tx_alamat.setText("");
Tx_no.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_tambahActionPerformed

    private void UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahActionPerformed
if (jDynamictable.getSelectedRow() != -1) {
    // Ambil indeks baris yang dipilih
    int rowIndex = jDynamictable.getSelectedRow();
    
    // Ambil data dari model berdasarkan indeks baris
    karyawan karya = tablemodel.get(rowIndex); // pastikan tablemodel adalah list atau array yang mendukung get(index)
    
    // Buka dialog untuk mengubah data
    Ubah_karyawan updat = new Ubah_karyawan(this, true);
    updat.Update_karyawan(karya); // kirim objek 'makan' untuk diubah
    reload(); // fungsi untuk memuat ulang data
} else {
    JOptionPane.showMessageDialog(this, "Silahkan pilih data yang ingin dirubah");
}
        // TODO add your handling code here:
    }//GEN-LAST:event_UbahActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
     if(jDynamictable.getSelectedRow()!=-1){
    if(JOptionPane.showConfirmDialog(this, "Anda Yaking Akan Menghapus Data?","Hapus barang",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
        int index = jDynamictable.convertColumnIndexToModel(jDynamictable.getSelectedRow());
        karyawan pel = tablemodel.get(index);
        System.out.println(pel.getId_karyawan());
       karyawan_service service = new karyawan_service();
        service.delete_paket(pel.getId_karyawan());
    }
}else{
    JOptionPane.showMessageDialog(this, "Sillahkan pilih data yang akan dihapus terlebih dahulu");
}
reload();
        // TODO add your handling code here:
    }//GEN-LAST:event_HapusActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
Menu_utama utama = new Menu_utama();
utama.setVisible(true);
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_KembaliActionPerformed

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
            java.util.logging.Logger.getLogger(From_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(From_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(From_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(From_karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new From_karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Kembali;
    private javax.swing.JTextField Tx_alamat;
    private javax.swing.JTextField Tx_kode;
    private javax.swing.JTextField Tx_nama;
    private javax.swing.JTextField Tx_no;
    private javax.swing.JButton Ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton tambah;
    // End of variables declaration//GEN-END:variables
}
