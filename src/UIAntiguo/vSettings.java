/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIAntiguo;

import UIAntiguo.vStart;
import Herramientas.Config;
import Herramientas.PropStore;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.Properties;

/**
 *
 * @author Angel Flores
 */
public class vSettings extends javax.swing.JFrame {
    boolean window;
    /**
     * Creates new form vSettings
     */
    public vSettings() {
        Dis();
        initComponents();
        win();
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pAll_Settings = new javax.swing.JPanel();
        pTop = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        pCenter = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        wPrevious = new javax.swing.JButton();
        etiWindow = new javax.swing.JLabel();
        wNext = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        pDown = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        pCancel = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        pOK = new javax.swing.JPanel();
        bntOK = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        pRight = new javax.swing.JPanel();
        pLeft = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        pAll_Settings.setLayout(new java.awt.BorderLayout());

        Title.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        Title.setText("Settings");

        javax.swing.GroupLayout pTopLayout = new javax.swing.GroupLayout(pTop);
        pTop.setLayout(pTopLayout);
        pTopLayout.setHorizontalGroup(
            pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pTopLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Title)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pTopLayout.setVerticalGroup(
            pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pTopLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Title)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pAll_Settings.add(pTop, java.awt.BorderLayout.PAGE_START);

        pCenter.setLayout(new java.awt.GridLayout(3, 1));

        jPanel2.setLayout(new java.awt.GridBagLayout());

        wPrevious.setText("<");
        wPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wPreviousActionPerformed(evt);
            }
        });
        jPanel2.add(wPrevious, new java.awt.GridBagConstraints());

        etiWindow.setText("jLabel1");
        etiWindow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(etiWindow, new java.awt.GridBagConstraints());

        wNext.setText(">");
        wNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wNextActionPerformed(evt);
            }
        });
        jPanel2.add(wNext, new java.awt.GridBagConstraints());

        pCenter.add(jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        pCenter.add(jPanel3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        pCenter.add(jPanel5);

        pAll_Settings.add(pCenter, java.awt.BorderLayout.CENTER);

        pDown.setLayout(new java.awt.GridLayout(1, 4));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pDown.add(jPanel1);

        pCancel.setLayout(new java.awt.GridBagLayout());

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        pCancel.add(btnCancel, new java.awt.GridBagConstraints());

        pDown.add(pCancel);

        pOK.setLayout(new java.awt.GridBagLayout());

        bntOK.setText("Accept");
        bntOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntOKActionPerformed(evt);
            }
        });
        pOK.add(bntOK, new java.awt.GridBagConstraints());

        pDown.add(pOK);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pDown.add(jPanel4);

        pAll_Settings.add(pDown, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout pRightLayout = new javax.swing.GroupLayout(pRight);
        pRight.setLayout(pRightLayout);
        pRightLayout.setHorizontalGroup(
            pRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pRightLayout.setVerticalGroup(
            pRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        pAll_Settings.add(pRight, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout pLeftLayout = new javax.swing.GroupLayout(pLeft);
        pLeft.setLayout(pLeftLayout);
        pLeftLayout.setHorizontalGroup(
            pLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pLeftLayout.setVerticalGroup(
            pLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        pAll_Settings.add(pLeft, java.awt.BorderLayout.LINE_START);

        getContentPane().add(pAll_Settings);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        vStart abrir = new vStart();
        abrir.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void wNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wNextActionPerformed
        etiWindow.setText("Window");
        window=false;
        PropStore.windo="false";
        PropStore.firstStore();      // TODO add your handling code here:
    }//GEN-LAST:event_wNextActionPerformed

    private void wPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wPreviousActionPerformed
        etiWindow.setText("FullScreen");
        PropStore.windo="true";
        PropStore.firstStore();
        window=true;        // TODO add your handling code here:
    }//GEN-LAST:event_wPreviousActionPerformed

    private void bntOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntOKActionPerformed
        this.setVisible(false);
        this.dispose();
        vStart abrir = new vStart();
        abrir.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_bntOKActionPerformed
    public void Dis(){
        Config cfg = new Config();
        boolean fullscreen = Boolean.parseBoolean(cfg.getProperty("fullscreen"));
        System.out.println(fullscreen);
        if(fullscreen){
            this.setExtendedState(MAXIMIZED_BOTH);
            this.setUndecorated(rootPaneCheckingEnabled);
            System.out.println("1");
            window=true;
            System.out.println("w ="+window);
        }
        else{
            this.setPreferredSize(new Dimension(800, 600));
            window=false;
            System.out.println("w ="+window);
        }
    }
    public void win(){
        if(window==true){
            etiWindow.setText("FullScreen");
        }
        else if(window==false){
            etiWindow.setText("Window");
        }
    }
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
            java.util.logging.Logger.getLogger(vSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vSettings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton bntOK;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel etiWindow;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel pAll_Settings;
    private javax.swing.JPanel pCancel;
    private javax.swing.JPanel pCenter;
    private javax.swing.JPanel pDown;
    private javax.swing.JPanel pLeft;
    private javax.swing.JPanel pOK;
    private javax.swing.JPanel pRight;
    private javax.swing.JPanel pTop;
    private javax.swing.JButton wNext;
    private javax.swing.JButton wPrevious;
    // End of variables declaration//GEN-END:variables
}
