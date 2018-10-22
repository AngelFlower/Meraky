/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Niveles;

import static UI.main.paneMain;
import UI.pLevel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
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
    /**
     * Creates new form level2
     */
    public level2() {
        initComponents();
        aviso.setVisible(false);
        all.setVisible(true);
        btnNext.setVisible(false);
        imgs = new ImageIcon[6];
        btns = new JButton[27];
        msgs = new String[20];

        //imagenes del joven ahorcado lol
        imgs[0] = new ImageIcon(getClass().getResource("/img/im1.jpg"));
        imgs[1] = new ImageIcon(getClass().getResource("/img/im2.jpg"));
        imgs[2] = new ImageIcon(getClass().getResource("/img/im3.jpg"));
        imgs[3] = new ImageIcon(getClass().getResource("/img/im4.jpg"));
        imgs[4] = new ImageIcon(getClass().getResource("/img/im5.jpg"));
        imgs[5] = new ImageIcon(getClass().getResource("/img/im6.jpg"));

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
        aviso.setOpaque(false);
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
                    //hace una comprobacion de las letras restantes y faltantes, en caso de que ya no haya letras sera ganador :D
                    boolean gano = true;
                    for (String re : res) {
                        if (re.equals("_")) {
                            gano = false;
                            break;
                        }
                    }
                    //al ser correcta se muestra un mensaje y se reinicia el juego
                    if (gano) {
                        Msg.setText("CONGRATULATIONS YOU RAISE THE LEVEL");
                        aviso.setVisible(true);
                        btnNext.setVisible(true);
                        all.setVisible(false);
                    }
                    //SI LA LETRA NO ESTA EN EL MENSAGE, SE INCREMENTA EL ERROR Y SE CAMBIA LA IMAGEN
                } else {
                    jButton1.setIcon(imgs[++err]);
                    //SI SE LLEGA A LOS 5 ERRORES ENTONCES SE PIERDE EL JUEGO Y SE MANDA EL MENSAGE DE:
                    if (err == 5) {
                        aviso.setVisible(true);
                        Msg.setText("YOU LOST TRY AGAIN THE WORD IS \n" + msgs[ran]);
                        all.setVisible(false);
                        //iniciar();
                        //return;
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        aviso = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        Msg = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        p22 = new javax.swing.JPanel();
        btnexit = new javax.swing.JButton();
        p24 = new javax.swing.JPanel();
        btnNext = new javax.swing.JButton();
        p23 = new javax.swing.JPanel();
        btnTry = new javax.swing.JButton();
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton29 = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 255, 255));
        setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setForeground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aviso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        aviso.setEnabled(false);
        aviso.setOpaque(false);
        aviso.setLayout(new java.awt.GridLayout(2, 1));

        p1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 46));

        Msg.setText("Hola");
        p1.add(Msg);

        aviso.add(p1);

        p2.setLayout(new java.awt.GridLayout(1, 3));

        p22.setLayout(new java.awt.GridBagLayout());

        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        p22.add(btnexit, new java.awt.GridBagConstraints());

        p2.add(p22);

        p24.setLayout(new java.awt.GridBagLayout());

        btnNext.setText("NEXT LEVEL");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        p24.add(btnNext, new java.awt.GridBagConstraints());

        p2.add(p24);

        p23.setLayout(new java.awt.GridBagLayout());

        btnTry.setText("TRY AGAIN ");
        btnTry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTryActionPerformed(evt);
            }
        });
        p23.add(btnTry, new java.awt.GridBagConstraints());

        p2.add(p23);

        aviso.add(p2);

        jPanel1.add(aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 390, 200));

        all.setOpaque(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/im1.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jTextPane1);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton2.setText("A");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton3.setText("B");

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton4.setText("C");

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton5.setText("D");

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton6.setText("E");

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton7.setText("F");

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton8.setText("G");

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton9.setText("H");

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton10.setText("I");

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton11.setText("J");

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton12.setText("K");

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton13.setText("L");

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton14.setText("M");

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton15.setText("N");

        jButton16.setBackground(new java.awt.Color(255, 255, 255));
        jButton16.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton16.setText("O");

        jButton17.setBackground(new java.awt.Color(255, 255, 255));
        jButton17.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton17.setText("P");

        jButton18.setBackground(new java.awt.Color(255, 255, 255));
        jButton18.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton18.setText("Q");

        jButton19.setBackground(new java.awt.Color(255, 255, 255));
        jButton19.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton19.setText("R");

        jButton20.setBackground(new java.awt.Color(255, 255, 255));
        jButton20.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton20.setText("S");

        jButton21.setBackground(new java.awt.Color(255, 255, 255));
        jButton21.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton21.setText("T");

        jButton22.setBackground(new java.awt.Color(255, 255, 255));
        jButton22.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton22.setText("U");

        jButton23.setBackground(new java.awt.Color(255, 255, 255));
        jButton23.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton23.setText("V");

        jButton24.setBackground(new java.awt.Color(255, 255, 255));
        jButton24.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton24.setText("W");

        jButton25.setBackground(new java.awt.Color(255, 255, 255));
        jButton25.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton25.setText("X");

        jButton26.setBackground(new java.awt.Color(255, 255, 255));
        jButton26.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton26.setText("Y");

        jButton27.setBackground(new java.awt.Color(255, 255, 255));
        jButton27.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton27.setText("Z");

        jButton28.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jButton28.setText("RESTAR");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jLabel3.setText(" ");

        jTextField1.setText(" THE PARTS OF THE HOUSE, COLORS, AND FAMILY MEMBERS.");

        jTextField2.setText("PLAY OF HANGED.");

        jButton29.setText("Atras");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout allLayout = new javax.swing.GroupLayout(all);
        all.setLayout(allLayout);
        allLayout.setHorizontalGroup(
            allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(allLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(allLayout.createSequentialGroup()
                            .addComponent(jButton29)
                            .addGap(64, 64, 64)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(allLayout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(allLayout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(allLayout.createSequentialGroup()
                                    .addGap(73, 73, 73)
                                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(100, 100, 100)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(jLabel3))
                        .addGroup(allLayout.createSequentialGroup()
                            .addGap(294, 294, 294)
                            .addComponent(jButton2)
                            .addGap(6, 6, 6)
                            .addComponent(jButton3)
                            .addGap(6, 6, 6)
                            .addComponent(jButton4)
                            .addGap(31, 31, 31)
                            .addComponent(jButton5)
                            .addGap(6, 6, 6)
                            .addComponent(jButton6)
                            .addGap(6, 6, 6)
                            .addComponent(jButton7)
                            .addGap(6, 6, 6)
                            .addComponent(jButton8))
                        .addGroup(allLayout.createSequentialGroup()
                            .addGap(294, 294, 294)
                            .addComponent(jButton9)
                            .addGap(6, 6, 6)
                            .addComponent(jButton10)
                            .addGap(6, 6, 6)
                            .addComponent(jButton11)
                            .addGap(31, 31, 31)
                            .addComponent(jButton12)
                            .addGap(6, 6, 6)
                            .addComponent(jButton13)
                            .addGap(6, 6, 6)
                            .addComponent(jButton14)
                            .addGap(6, 6, 6)
                            .addComponent(jButton15))
                        .addGroup(allLayout.createSequentialGroup()
                            .addGap(294, 294, 294)
                            .addComponent(jButton16)
                            .addGap(6, 6, 6)
                            .addComponent(jButton17)
                            .addGap(6, 6, 6)
                            .addComponent(jButton18)
                            .addGap(12, 12, 12)
                            .addComponent(jButton19)
                            .addGap(6, 6, 6)
                            .addComponent(jButton20)
                            .addGap(6, 6, 6)
                            .addComponent(jButton21)
                            .addGap(6, 6, 6)
                            .addComponent(jButton22))
                        .addGroup(allLayout.createSequentialGroup()
                            .addGap(340, 340, 340)
                            .addComponent(jButton23)
                            .addGap(6, 6, 6)
                            .addComponent(jButton24)
                            .addGap(12, 12, 12)
                            .addComponent(jButton25)
                            .addGap(6, 6, 6)
                            .addComponent(jButton26)
                            .addGap(6, 6, 6)
                            .addComponent(jButton27)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        allLayout.setVerticalGroup(
            allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(allLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton29)
                        .addGroup(allLayout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(allLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGap(6, 6, 6)
                    .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton4)
                        .addComponent(jButton5)
                        .addComponent(jButton6)
                        .addComponent(jButton7)
                        .addComponent(jButton8))
                    .addGap(8, 8, 8)
                    .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton9)
                        .addComponent(jButton10)
                        .addComponent(jButton11)
                        .addComponent(jButton12)
                        .addComponent(jButton13)
                        .addComponent(jButton14)
                        .addComponent(jButton15))
                    .addGap(7, 7, 7)
                    .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton16)
                        .addComponent(jButton17)
                        .addComponent(jButton18)
                        .addComponent(jButton19)
                        .addComponent(jButton20)
                        .addComponent(jButton21)
                        .addComponent(jButton22))
                    .addGap(6, 6, 6)
                    .addGroup(allLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton23)
                        .addComponent(jButton24)
                        .addComponent(jButton25)
                        .addComponent(jButton26)
                        .addComponent(jButton27))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(all, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 790, 540));

        jPanel2.add(jPanel1, new java.awt.GridBagConstraints());

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        iniciar();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        pLevel level = new pLevel();
        level.setLocation(0, 0);
        paneMain.removeAll();
        paneMain.add(level,GridLayout.class);
        paneMain.revalidate();
        paneMain.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        pLevel level = new pLevel();
        level.setLocation(0, 0);
        paneMain.removeAll();
        paneMain.add(level,GridLayout.class);
        paneMain.revalidate();
        paneMain.repaint();// TODO add your handling code here:
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnTryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTryActionPerformed
        iniciar();
        all.setVisible(true);
        aviso.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btnTryActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        level3 level = new level3();
        level.setLocation(0, 0);
        paneMain.removeAll();
        paneMain.add(level,GridLayout.class);
        paneMain.revalidate();
        paneMain.repaint();
    }//GEN-LAST:event_btnNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Msg;
    private javax.swing.JPanel all;
    private javax.swing.JPanel aviso;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnTry;
    private javax.swing.JButton btnexit;
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
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p22;
    private javax.swing.JPanel p23;
    private javax.swing.JPanel p24;
    // End of variables declaration//GEN-END:variables
}
