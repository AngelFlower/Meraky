/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Niveles;

import static GUI.main.paneMain;
import GUI.menuGame;
import GUI.pLevel;
import com.sun.glass.events.KeyEvent;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Hector
 *
 * @author angel
 */
public class level2 extends javax.swing.JPanel {

    public ImageIcon imgs[];
    public JButton btns[];
    public String msgs[];
    public int ran;
    public int err;
    public String res[];
    int con;
    /**
     * Creates new form level2
     */
    private URL url = getClass().getResource("/img/568.jpg");
    Image image = new ImageIcon(url).getImage();

    public void paint(Graphics g) {
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }

    public level2() {
        initComponents();
        con = 0;
        imgs = new ImageIcon[6];
        btns = new JButton[27];
        msgs = new String[20];
        //imagenes del joven ahorcado xD.
        imgs[0] = new ImageIcon(getClass().getResource("/img/h0.png"));
        imgs[1] = new ImageIcon(getClass().getResource("/img/h1.png"));
        imgs[2] = new ImageIcon(getClass().getResource("/img/h2.png"));
        imgs[3] = new ImageIcon(getClass().getResource("/img/h3.png"));
        imgs[4] = new ImageIcon(getClass().getResource("/img/h4.png"));
        imgs[5] = new ImageIcon(getClass().getResource("/img/h5.jpg"));

        //botones para las letras
        btns[1] = jButton2;
        btns[2] = jButton3;
        btns[3] = jButton4;
        btns[4] = jButton5;
        btns[5] = jButton6;
        btns[6] = jButton7;
        btns[7] = jButton8;
        btns[8] = jButton9;
        btns[9] = jButton10;
        btns[10] = jButton11;
        btns[11] = jButton12;
        btns[12] = jButton13;
        btns[13] = jButton14;
        btns[14] = jButton15;
        btns[15] = jButton16;
        btns[16] = jButton17;
        btns[17] = jButton18;
        btns[18] = jButton19;
        btns[19] = jButton20;
        btns[20] = jButton21;
        btns[21] = jButton22;
        btns[22] = jButton23;
        btns[23] = jButton24;
        btns[24] = jButton25;
        btns[25] = jButton26;
        btns[26] = jButton27;

        //
        //palabras por advinar, para agregar una nueva palabra sera necesario declararla al inicio
        msgs[0] = "BROTHER".toUpperCase();
        msgs[1] = "FATHER".toUpperCase();
        msgs[2] = "MOTHER".toUpperCase();
        msgs[3] = "SISTER".toUpperCase();
        msgs[4] = "UNCLE".toUpperCase();
        msgs[5] = "COUSIN".toUpperCase();
        msgs[6] = "KITCHEN".toUpperCase();
        msgs[7] = "ROOM".toUpperCase();
        msgs[8] = "BATHROOM".toUpperCase();
        msgs[9] = "BLACK".toUpperCase();
        msgs[10] = "BLUE".toUpperCase();
        msgs[11] = "RED".toUpperCase();
        msgs[12] = "GREEN".toUpperCase();
        msgs[13] = "BLACK".toUpperCase();
        msgs[14] = "WHITE".toUpperCase();
        msgs[15] = "GRANDMOTHER".toUpperCase();
        msgs[16] = "GRANDFATHER".toUpperCase();
        msgs[17] = "BEDROOM".toUpperCase();
        msgs[18] = "PINK".toUpperCase();
        msgs[19] = "ORANGE".toUpperCase();

        //se asigna un evento a cada letra para comprobar que exista en la palabra a adivinar
        for (int i = 1; i < 27; i++) {
            btns[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    checarLetra(e);
                }
            });
        }
        iniciar();
    }

    public void iniciar() {
        //ERRORES EN 0

        err = 0;
        jButton1.setIcon(imgs[0]);
        jTextPane1.setText("");
        //para activar las letras del tablero
        for (int i = 1; i < 27; i++) {
            btns[i].setEnabled(true);
        }
        //para generar una palabra aleatoriamente xD
        ran = (int) 0 + (int) (Math.random() * ((msgs.length - 1) + 1));
        //SEPARA EL MENSAJE POR PALABRAS
        String pal[] = msgs[ran].split(" ");
        res = new String[msgs[ran].length() + 1];
        int j = 0;
        // seran los guiones que van debajo de las letras como una separacion_
        for (String pal1 : pal) {
            for (int i = 0; i < pal1.length(); i++) {
                jTextPane1.setText(jTextPane1.getText() + "_ ");
                res[j++] = "_";
            }
            jTextPane1.setText(jTextPane1.getText() + "\n");
            res[j++] = " ";
        }
    }

    //al presionar una letra, esta se buscara si pertenece a la palabra, de lo contrario la marcara como error 
    public void checarLetra(ActionEvent e) {
        JButton bt = (JButton) e.getSource();
        char c[];
        //busca la letra en la palabra despues de haber sido presionada
        for (int i = 1; i < 27; i++) {
            if (bt == btns[i]) {
                //la tecla es inicializada
                c = Character.toChars(64 + i);
                //busca si la letra esta en la frase
                boolean esta = false;
                for (int j = 0; j < msgs[ran].length(); j++) {
                    if (c[0] == msgs[ran].charAt(j)) {
                        res[j] = c[0] + "";
                        esta = true;
                    }
                }
                //SI LA LETRA ESTA EN EL MENSAJE SE MUESTRA EN EL TEXTPANEL
                if (esta) {
                    jTextPane1.setText("");
                    for (String re : res) {
                        if (" ".equals(re)) {
                            jTextPane1.setText(jTextPane1.getText() + "\n");
                        } else {
                            jTextPane1.setText(jTextPane1.getText() + re + " ");
                        }
                    }
                    //hace una comprobacion de las letras restantes y faltantes, en caso de que ya no haya letras sera ganador :Df

                    boolean gano = true;
                    for (String re : res) {
                        if (re.equals("_")) {
                            gano = false;
                            break;
                        }
                    }
                    //al ser correcta se muestra un mensaje y se reinicia el juego
                    if (gano) {
                        con++;
                        numPalabra.setText(con + "/3");
                        if (con == 3) {
                            //Msg.setText("CONGRATULATIONS YOU RAISE THE LEVEL");
                            nextLVL3 level = new nextLVL3();
                            level.setLocation(0, 0);
                            paneMain.removeAll();
                            paneMain.add(level, GridLayout.class);
                            paneMain.revalidate();
                            paneMain.repaint();
                        } else {
                            iniciar();
                        }

                        return;
                    }

                    //SI LA LETRA NO ESTA EN EL MENSAGE, SE INCREMENTA EL ERROR Y SE CAMBIA LA IMAGEN
                } else {
                    jButton1.setIcon(imgs[++err]);
                    //SI SE LLEGA A LOS 5 ERRORES ENTONCES SE PIERDE EL JUEGO Y SE MANDA EL MENSAGE DE:
                    if (err == 5) {
                        /*aviso.setVisible(true);
                        Msg.setText("YOU LOST TRY AGAIN THE WORD IS \n" + msgs[ran]);
                        all.setVisible(false);*/
                        iniciar();

                        return;
                    }
                }
                //esta es la linea que desactiva las letras despues de ser usadas :3
                bt.setEnabled(false);
                break;
            }
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        all = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        numPalabra = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        all.setOpaque(false);
        all.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/h0.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        all.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 258, 260));

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(250, 250, 250));
        jTextPane1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jTextPane1);

        all.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 341, 75));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton2.setText("A");
        all.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton3.setText("B");
        all.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton4.setText("C");
        all.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton5.setText("D");
        all.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, -1));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton6.setText("E");
        all.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton7.setText("F");
        all.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, -1, -1));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton8.setText("G");
        all.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton9.setText("H");
        all.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, -1, -1));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton10.setText("I");
        all.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton11.setText("J");
        all.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, -1, -1));

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton12.setText("K");
        all.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, -1, -1));

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton13.setText("L");
        all.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton14.setText("M");
        all.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, -1, -1));

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton15.setText("N");
        all.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, -1, -1));

        jButton16.setBackground(new java.awt.Color(255, 255, 255));
        jButton16.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton16.setText("O");
        all.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        jButton17.setBackground(new java.awt.Color(255, 255, 255));
        jButton17.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton17.setText("P");
        all.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, -1, -1));

        jButton18.setBackground(new java.awt.Color(255, 255, 255));
        jButton18.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton18.setText("Q");
        jButton18.setToolTipText("");
        all.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, -1));

        jButton19.setBackground(new java.awt.Color(255, 255, 255));
        jButton19.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton19.setText("R");
        all.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        jButton20.setBackground(new java.awt.Color(255, 255, 255));
        jButton20.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton20.setText("S");
        all.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, -1, -1));

        jButton21.setBackground(new java.awt.Color(255, 255, 255));
        jButton21.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton21.setText("T");
        all.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, -1));

        jButton22.setBackground(new java.awt.Color(255, 255, 255));
        jButton22.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton22.setText("U");
        all.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        jButton23.setBackground(new java.awt.Color(255, 255, 255));
        jButton23.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton23.setText("V");
        all.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));

        jButton24.setBackground(new java.awt.Color(255, 255, 255));
        jButton24.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton24.setText("W");
        all.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, -1, -1));

        jButton25.setBackground(new java.awt.Color(255, 255, 255));
        jButton25.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton25.setText("X");
        all.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        jButton26.setBackground(new java.awt.Color(255, 255, 255));
        jButton26.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton26.setText("Y");
        all.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, -1, -1));

        jButton27.setBackground(new java.awt.Color(255, 255, 255));
        jButton27.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton27.setText("Z");
        all.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, -1));

        jButton28.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/otherWord.png"))); // NOI18N
        jButton28.setBorderPainted(false);
        jButton28.setContentAreaFilled(false);
        jButton28.setFocusable(false);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        all.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 265, 250, 80));

        jLabel3.setText(" ");
        all.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 86, -1, -1));

        jLabel1.setForeground(new java.awt.Color(247, 247, 247));
        jLabel1.setText("HANGED   ");
        all.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        numPalabra.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        numPalabra.setForeground(new java.awt.Color(250, 250, 250));
        numPalabra.setText("0/3");
        all.add(numPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        jLabel4.setForeground(new java.awt.Color(247, 247, 247));
        jLabel4.setText(" THE PARTS OF THE HOUSE, COLORS, AND FAMILY MEMBERS.");
        all.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.ipady = 260;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 0);
        jPanel1.add(all, gridBagConstraints);

        jPanel2.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel3.setOpaque(false);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/flecha-hacia-la-izquierda.png"))); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setFocusPainted(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 925, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBack)
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 975, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, java.awt.BorderLayout.PAGE_END);

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        menuGame level = new menuGame();
        level.setLocation(0, 0);
        paneMain.removeAll();
        paneMain.add(level, GridLayout.class);
        paneMain.revalidate();
        paneMain.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        iniciar();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel all;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel numPalabra;
    // End of variables declaration//GEN-END:variables
}
