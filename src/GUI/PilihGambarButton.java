/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;

/**
 *
 * @author LENOVO
 */
public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButton() {
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

        buttonpanel = new javax.swing.JPanel();
        pantaibtn = new javax.swing.JButton();
        gunungbtn = new javax.swing.JButton();
        tamanbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        imagepanel = new javax.swing.JPanel();
        pantai = new javax.swing.JLabel();
        gunung = new javax.swing.JLabel();
        taman = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonpanel.setBackground(new java.awt.Color(51, 255, 255));

        pantaibtn.setText("pantai");
        pantaibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantaibtnActionPerformed(evt);
            }
        });
        buttonpanel.add(pantaibtn);

        gunungbtn.setText("gunung");
        gunungbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gunungbtnActionPerformed(evt);
            }
        });
        buttonpanel.add(gunungbtn);

        tamanbtn.setText("taman");
        tamanbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanbtnActionPerformed(evt);
            }
        });
        buttonpanel.add(tamanbtn);

        exitbtn.setText("exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        buttonpanel.add(exitbtn);

        getContentPane().add(buttonpanel, java.awt.BorderLayout.PAGE_START);

        imagepanel.setLayout(new java.awt.CardLayout());

        pantai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pantai.jpg"))); // NOI18N
        imagepanel.add(pantai, "0");

        gunung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/gunung.jpg"))); // NOI18N
        imagepanel.add(gunung, "1");

        taman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/taman.jpg"))); // NOI18N
        imagepanel.add(taman, "2");

        getContentPane().add(imagepanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void pantaibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantaibtnActionPerformed
        // TODO add your handling code here:
        CardLayout c1 =(CardLayout) (imagepanel.getLayout());
        c1.show(imagepanel,"0");
    }//GEN-LAST:event_pantaibtnActionPerformed

    private void gunungbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gunungbtnActionPerformed
        // TODO add your handling code here:
        CardLayout c1 =(CardLayout) (imagepanel.getLayout());
        c1.show(imagepanel,"1");
    }//GEN-LAST:event_gunungbtnActionPerformed

    private void tamanbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanbtnActionPerformed
        // TODO add your handling code here:
        CardLayout c1 =(CardLayout) (imagepanel.getLayout());
        c1.show(imagepanel,"2");
    }//GEN-LAST:event_tamanbtnActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonpanel;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel gunung;
    private javax.swing.JButton gunungbtn;
    private javax.swing.JPanel imagepanel;
    private javax.swing.JLabel pantai;
    private javax.swing.JButton pantaibtn;
    private javax.swing.JLabel taman;
    private javax.swing.JButton tamanbtn;
    // End of variables declaration//GEN-END:variables
}
