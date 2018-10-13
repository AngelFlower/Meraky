/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Config.Config;
import Config.PropStore;
import static UI.Main.paneMain;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.GridLayout;
import javax.swing.SwingUtilities;

/**
 *
 * @author Angel Flores
 */
public class pSettings extends javax.swing.JPanel {
    boolean window;
    /**
     * Creates new form pSettings
     */
    public pSettings() {
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

        setLayout(new java.awt.GridLayout());

        pAll_Settings.setLayout(new java.awt.BorderLayout());

        Title.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        Title.setText("Settings");

        javax.swing.GroupLayout pTopLayout = new javax.swing.GroupLayout(pTop);
        pTop.setLayout(pTopLayout);
        pTopLayout.setHorizontalGroup(
            pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
            .addGroup(pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pTopLayout.createSequentialGroup()
                    .addGap(0, 88, Short.MAX_VALUE)
                    .addComponent(Title)
                    .addGap(0, 89, Short.MAX_VALUE)))
        );
        pTopLayout.setVerticalGroup(
            pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(pTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pTopLayout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addComponent(Title)
                    .addGap(0, 7, Short.MAX_VALUE)))
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
            .addGap(0, 169, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        pCenter.add(jPanel3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        pCenter.add(jPanel5);

        pAll_Settings.add(pCenter, java.awt.BorderLayout.CENTER);

        pDown.setLayout(new java.awt.GridLayout(1, 4));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
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
            .addGap(0, 92, Short.MAX_VALUE)
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
            .addGap(0, 150, Short.MAX_VALUE)
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
            .addGap(0, 150, Short.MAX_VALUE)
        );

        pAll_Settings.add(pLeft, java.awt.BorderLayout.LINE_START);

        add(pAll_Settings);
    }// </editor-fold>//GEN-END:initComponents

    private void wPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wPreviousActionPerformed
        etiWindow.setText("FullScreen");
        PropStore.windo="true";
        PropStore.firstStore();
        window=true;        // TODO add your handling code here:
    }//GEN-LAST:event_wPreviousActionPerformed

    private void wNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wNextActionPerformed
        etiWindow.setText("Window");
        window=false;
        PropStore.windo="false";
        PropStore.firstStore();// TODO add your handling code here:
    }//GEN-LAST:event_wNextActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        //Main m = new Main();
        //m.dispose();
        //m.setVisible(true);
        pStart start = new pStart();
        start.setLocation(0, 0);
        paneMain.removeAll();
        paneMain.add(start,GridLayout.class);
        paneMain.revalidate();
        paneMain.repaint();
                // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void bntOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntOKActionPerformed
        //Main m = new Main();
        //this.dispose();
        //m.setVisible(true);
        Main frame = (Main) SwingUtilities.getWindowAncestor(this);
        frame.dispose();
        //frame.setVisible(true);
        pStart start = new pStart();
        start.setLocation(0, 0);
        paneMain.removeAll();
        paneMain.add(start,GridLayout.class);
        paneMain.revalidate();
        paneMain.repaint();
        //vStart abrir = new vStart();
        //abrir.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_bntOKActionPerformed
    public void Dis(){
        Config cfg = new Config();
        boolean fullscreen = Boolean.parseBoolean(cfg.getProperty("fullscreen"));
        System.out.println(fullscreen);
        if(fullscreen){
            window=true;
            System.out.println("w ="+window);
        }
        else{
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
