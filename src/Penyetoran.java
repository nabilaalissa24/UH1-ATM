
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nabila AAP
 */
public class Penyetoran extends javax.swing.JFrame {
    int saldo;
     String str, str1; 
    int t,s,tab=50000;
    /**
     * Creates new form Penyetoran
     */
    public Penyetoran() {
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

        t200 = new javax.swing.JButton();
        t1000 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        t200.setBackground(new java.awt.Color(204, 204, 204));
        t200.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        t200.setText("<");
        t200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t200ActionPerformed(evt);
            }
        });
        getContentPane().add(t200);
        t200.setBounds(30, 360, 90, 60);

        t1000.setBackground(new java.awt.Color(204, 204, 204));
        t1000.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        t1000.setText(">");
        getContentPane().add(t1000);
        t1000.setBounds(650, 360, 90, 60);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MASUKKAN JUMLAH TUNAI");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 30, 370, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("200.000");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 380, 140, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("1.000.000");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(350, 380, 130, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(140, 0, 490, 480);

        setSize(new java.awt.Dimension(786, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t200ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t200ActionPerformed

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
            java.util.logging.Logger.getLogger(Penyetoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Penyetoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Penyetoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Penyetoran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penyetoran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton t1000;
    private javax.swing.JButton t200;
    // End of variables declaration//GEN-END:variables


}
