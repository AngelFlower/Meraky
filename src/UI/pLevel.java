/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Niveles.level1;
import Niveles.level2;
import Niveles.level3;
import Niveles.level4;
import Niveles.pDetermination;
import static UI.main.paneMain;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;


/**
 *
 * @author Angel Flores
 */
public class pLevel extends javax.swing.JPanel {
    int x,y;
    boolean mo;
    /**
     * Creates new form pLevel
     */
    public pLevel() {
        initComponents();
        setFocusable(true);
        int x= goku.getBounds().x;
        int y= goku.getBounds().y;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        fondoL1 = new fondos.FondoL();
        goku = new Personajes.Goku();
        pCenter = new javax.swing.JPanel();
        pLevel1 = new javax.swing.JPanel();
        btnLevel1 = new javax.swing.JButton();
        pLevel2 = new javax.swing.JPanel();
        btnLevel2 = new javax.swing.JButton();
        pLevel3 = new javax.swing.JPanel();
        btnLevel3 = new javax.swing.JButton();
        pLevel4 = new javax.swing.JPanel();
        btnLevel4 = new javax.swing.JButton();
        pTop = new javax.swing.JPanel();
        pTGrid = new javax.swing.JPanel();
        pHome = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        pTitle = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        pE = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pDown = new javax.swing.JPanel();
        pLeft = new javax.swing.JPanel();
        pRight = new javax.swing.JPanel();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        setLayout(new java.awt.GridLayout(1, 0));

        fondoL1.setOpaque(false);
        fondoL1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout gokuLayout = new javax.swing.GroupLayout(goku);
        goku.setLayout(gokuLayout);
        gokuLayout.setHorizontalGroup(
            gokuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        gokuLayout.setVerticalGroup(
            gokuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        fondoL1.add(goku, java.awt.BorderLayout.CENTER);

        pCenter.setOpaque(false);
        pCenter.setLayout(new java.awt.GridLayout(1, 4));

        pLevel1.setOpaque(false);
        pLevel1.setLayout(new java.awt.GridBagLayout());

        btnLevel1.setText("Level 1");
        btnLevel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLevel1ActionPerformed(evt);
            }
        });
        pLevel1.add(btnLevel1, new java.awt.GridBagConstraints());

        pCenter.add(pLevel1);

        pLevel2.setOpaque(false);
        pLevel2.setLayout(new java.awt.GridBagLayout());

        btnLevel2.setText("Level 2");
        btnLevel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLevel2ActionPerformed(evt);
            }
        });
        pLevel2.add(btnLevel2, new java.awt.GridBagConstraints());

        pCenter.add(pLevel2);

        pLevel3.setOpaque(false);
        pLevel3.setLayout(new java.awt.GridBagLayout());

        btnLevel3.setText("Level 3");
        btnLevel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLevel3ActionPerformed(evt);
            }
        });
        pLevel3.add(btnLevel3, new java.awt.GridBagConstraints());

        pCenter.add(pLevel3);

        pLevel4.setOpaque(false);
        pLevel4.setLayout(new java.awt.GridBagLayout());

        btnLevel4.setText("Level 4");
        btnLevel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLevel4ActionPerformed(evt);
            }
        });
        pLevel4.add(btnLevel4, new java.awt.GridBagConstraints());

        pCenter.add(pLevel4);

        fondoL1.add(pCenter, java.awt.BorderLayout.CENTER);

        pTop.setOpaque(false);
        pTop.setLayout(new java.awt.GridLayout(1, 0));

        pTGrid.setOpaque(false);
        pTGrid.setLayout(new java.awt.GridLayout(1, 3));

        pHome.setOpaque(false);
        pHome.setLayout(new java.awt.GridBagLayout());

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        pHome.add(btnHome, new java.awt.GridBagConstraints());

        pTGrid.add(pHome);

        pTitle.setOpaque(false);
        pTitle.setLayout(new java.awt.GridBagLayout());

        Title.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        Title.setText("Levels");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(42, 29, 42, 30);
        pTitle.add(Title, gridBagConstraints);

        pTGrid.add(pTitle);

        pE.setOpaque(false);
        pE.setLayout(new java.awt.GridBagLayout());

        jButton1.setText("Extra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pE.add(jButton1, new java.awt.GridBagConstraints());

        pTGrid.add(pE);

        pTop.add(pTGrid);

        fondoL1.add(pTop, java.awt.BorderLayout.PAGE_START);

        pDown.setOpaque(false);

        javax.swing.GroupLayout pDownLayout = new javax.swing.GroupLayout(pDown);
        pDown.setLayout(pDownLayout);
        pDownLayout.setHorizontalGroup(
            pDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1188, Short.MAX_VALUE)
        );
        pDownLayout.setVerticalGroup(
            pDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        fondoL1.add(pDown, java.awt.BorderLayout.PAGE_END);

        pLeft.setOpaque(false);

        javax.swing.GroupLayout pLeftLayout = new javax.swing.GroupLayout(pLeft);
        pLeft.setLayout(pLeftLayout);
        pLeftLayout.setHorizontalGroup(
            pLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pLeftLayout.setVerticalGroup(
            pLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );

        fondoL1.add(pLeft, java.awt.BorderLayout.LINE_END);

        pRight.setOpaque(false);

        javax.swing.GroupLayout pRightLayout = new javax.swing.GroupLayout(pRight);
        pRight.setLayout(pRightLayout);
        pRightLayout.setHorizontalGroup(
            pRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pRightLayout.setVerticalGroup(
            pRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );

        fondoL1.add(pRight, java.awt.BorderLayout.LINE_START);

        add(fondoL1);
    }// </editor-fold>//GEN-END:initComponents
    public void coor(){
        System.out.println("x: "+x+" y "+y);
    }
    public void colision(){
        int x2 =btnLevel2.getX() ,y2 = btnLevel2.getY();
        //System.out.println("x y "+btnLevel2.getX()+btnLevel2.getY());
        if(x>=x2-5 && x<=x2+5){
            System.out.println("X Colision");
            
        }
        if(y>=y2-5 && y<=y2+5){
            System.out.println("Y Colision");
        }
    }
    public void borders(){
        if(x <= -76){
            x = this.getWidth()+30;
            goku.setLocation(x, y);
        }
        else if(x>this.getWidth()+50){
            x = -60;
            goku.setLocation(x, y);
        }
        else if(y <= -60){
            y = this.getHeight();
            goku.setLocation(x, y);
        }
        else if(y >= this.getHeight()+20){
            y = -60;
            goku.setLocation(x, y);
        }
    }
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
       borders();
        System.out.println("Btn xy "+btnLevel2.getX()+"  "+btnLevel2.getY());
        System.out.println("Goku xy"+goku.getX()+"  "+goku.getY());
       //coor();
        switch(evt.getKeyCode()){
            case KeyEvent.VK_W:
                y-=10;
                goku.setBounds(x, y, 100, 100);
                break;
            case KeyEvent.VK_S:
                y+=10;
                goku.setBounds(x, y, 100, 100);
                break;
            case KeyEvent.VK_D:
                x+=10;
                goku.setBounds(x, y, 100, 100);
                break;
            case KeyEvent.VK_A:
                x-=10;
                goku.setBounds(x, y, 100, 100);
                break;
                
        }
        //colision();// TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        requestFocusInWindow();          
    }//GEN-LAST:event_formMouseClicked

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        pStart start = new pStart();
        start.setLocation(0, 0);
        paneMain.removeAll();
        paneMain.add(start,GridLayout.class);
        paneMain.revalidate();
        paneMain.repaint();     // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnLevel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLevel2ActionPerformed
        level2 start=new level2(); 
        start.setLocation(0, 0);
        paneMain.removeAll();
        paneMain.add(start,GridLayout.class);
        paneMain.revalidate();
        paneMain.repaint();    // TODO add your handling code here:
    }//GEN-LAST:event_btnLevel2ActionPerformed

    private void btnLevel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLevel3ActionPerformed
       level3 start=new level3();
        start.setLocation(0, 0);
        paneMain.removeAll();
        paneMain.add(start,GridLayout.class);
        paneMain.revalidate();
        paneMain.repaint();   // TODO add your handling code here:
    }//GEN-LAST:event_btnLevel3ActionPerformed

    private void btnLevel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLevel1ActionPerformed
        level1 start=new level1();
        start.setLocation(0, 0);
        paneMain.removeAll();
        paneMain.add(start,GridLayout.class);
        paneMain.revalidate();
        paneMain.repaint();  // TODO add your handling code here:
    }//GEN-LAST:event_btnLevel1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     pDetermination start=new pDetermination();
        start.setLocation(0, 0);
        paneMain.removeAll();
        paneMain.add(start,GridLayout.class);
        paneMain.revalidate();
        paneMain.repaint();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLevel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLevel4ActionPerformed
        // TODO add your handling code here:
        level4 start = new level4();
        start.setLocation(0, 0);
        paneMain.removeAll();
         paneMain.add(start,GridLayout.class);
        paneMain.revalidate();
        paneMain.repaint(); 
    }//GEN-LAST:event_btnLevel4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLevel1;
    private javax.swing.JButton btnLevel2;
    private javax.swing.JButton btnLevel3;
    private javax.swing.JButton btnLevel4;
    private fondos.FondoL fondoL1;
    private Personajes.Goku goku;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel pCenter;
    private javax.swing.JPanel pDown;
    private javax.swing.JPanel pE;
    private javax.swing.JPanel pHome;
    private javax.swing.JPanel pLeft;
    private javax.swing.JPanel pLevel1;
    private javax.swing.JPanel pLevel2;
    private javax.swing.JPanel pLevel3;
    private javax.swing.JPanel pLevel4;
    private javax.swing.JPanel pRight;
    private javax.swing.JPanel pTGrid;
    private javax.swing.JPanel pTitle;
    private javax.swing.JPanel pTop;
    // End of variables declaration//GEN-END:variables
}
