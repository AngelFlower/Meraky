/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Niveles;

import Herramientas.Sound;
import GUI.main;
import static GUI.main.musica;
import static GUI.main.paneMain;
import GUI.pLevel;
import java.awt.Color;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.applet.AudioClip;
import java.awt.GridLayout;

/**
 
 * @author Erick
 */
public class level4 extends javax.swing.JPanel {
    public static Sound music = new Sound("/Sonidos/listening.wav");
public String Lyric[];
public int Attemps;
public int entradas_if;
public int save_number;
public  String Input1,
       Input2, Input3, Input4, Input5, Input6, Input7, Input8, Input9, Input10,
               Input11, Input12, Input13, Input141, Input15, Input16, Input17,Input18, Input19 ;
    /**
     * Creates new form level4
     */
    public level4() {
        initComponents();
      // eventos_del_Raton Click = new eventos_del_Raton();
       //   this.Avanzar.addMouseListener(Click); 
        Mostrar_cancion();
            this.Output_Attemps.setText("Intentos restantes 4");
      Attemps = 4;
       entradas_if = 0;
       save_number = 0;
        
    }
    
  public void Mostrar_cancion(){
     
        Lyric = new String [16];
        Lyric = new String []//cancion erronea
            {
            "1 take away my eyes ",
            "2 Take away my ears",
            "3 take it al away from me",//primer error Take it all away from me
            "4 take  away  mine arms", // segundo error Take away my arms
            "5 take away my knees", 
            "6 you can't blame it all on me",// tercer error You can blame it all on me
            "7 Take away my hurt",// tercer error Take away my heart
            "8 Take away my sound",// vuarto error  take away my soul
            "9 Take it all away from me",
            "10 Take way my dreams",
            "11 Take away my gouls",// quinto error Take away my goals
            "12 You can't blame it all on me",// sexto error You can blame it all on me
            "13 I'm a mess and I would always be",// septimo error I'm a mess and I will always be
            "14 Do you want to stick around and seen me drown?", //octavo error Do you want to stick around and see me drown?
            "15 Fuck, I'm about to lose it all",
            "16 I'm a drunk and I will always seen",// noveno error I'm a drunk and I will always be
            "17 Beggin baby take my hand before I fail back down", // decimo error Beggin baby take my hand before I fall back down
            "18 Fuck, I'm about to lose it all",//
            "19 Oh baby, won't you come back from my?"};//onceavo error Oh baby, won't you come back for me?
        
        DefaultListModel d = new DefaultListModel();
         for (int i = 0; i < Lyric.length;i++){
             
          this.Outpu_Lyric.append(Lyric[i]);
            this.Outpu_Lyric.append(System.getProperty("line.separator")); 
          
            //this.Outpu_Lyric.append(System.getProperty("line.separator"));
         }
               
             
        
      
      
  }
  
  public void Validacion(){
     
       
      
      
        if(Input1.equalsIgnoreCase("")){
           
            this.input1.setVisible(false);
        entradas_if++;}
        
        if(Input2.equalsIgnoreCase("")){
            this.input2.setVisible(false);
        entradas_if++;}
        if(Input3.equalsIgnoreCase("al")){
            this.input3.setVisible(false);
        entradas_if++;}
        if(Input4.equalsIgnoreCase("mine")){
            this.input4.setVisible(false);
        entradas_if++;}
        if(Input5.equalsIgnoreCase("")){
            this.input5.setVisible(false);
        entradas_if++;}
        if(Input6.equalsIgnoreCase("can't")){
            this.input6.setVisible(false);
         entradas_if++;}
        if(Input7.equalsIgnoreCase("hurt")){
            this.input7.setVisible(false);
        entradas_if++;}
         if(Input8.equalsIgnoreCase("sound")){
            this.input8.setVisible(false);
         entradas_if++;}
          if(Input9.equalsIgnoreCase("")){
            this.input9.setVisible(false);
          entradas_if++;}
           if(Input10.equalsIgnoreCase("")){
            this.input10.setVisible(false);
           entradas_if++;}
            if(Input11.equalsIgnoreCase("gouls")){
            this.inpu11.setVisible(false);
            entradas_if++;}
             if(Input12.equalsIgnoreCase("can't")){
            this.input12.setVisible(false);
             entradas_if++;}
              if(Input13.equalsIgnoreCase("would")){
            this.input13.setVisible(false);
              entradas_if++;}
               if(Input141.equalsIgnoreCase("seen")){
            this.Input14.setVisible(false);
               entradas_if++;}
                if(Input15.equalsIgnoreCase("")){
            this.input15.setVisible(false);
                entradas_if++;}
                 if(Input16.equalsIgnoreCase("seen")){
            this.input16.setVisible(false);
                 entradas_if++;}
                  if(Input17.equalsIgnoreCase("fail")){
            this.input17.setVisible(false);
                  entradas_if++;}
                   if(Input18.equalsIgnoreCase("")){
            this.input18.setVisible(false);
                   entradas_if++;}
                   Input19.trim();
                    if(Input19.equalsIgnoreCase("my")){
            this.input19.setVisible(false);
        entradas_if++;}
                    
     save_number= entradas_if ;
      entradas_if = 0;
                   
  }
  public void SetNOvisible(){
    
          
            this.input1.setVisible(false);

            this.input2.setVisible(false);
       
            this.input3.setVisible(false);
                 this.input4.setVisible(false);
       
            this.input5.setVisible(false);
        
            this.input6.setVisible(false);
        
            this.input7.setVisible(false);
      
            this.input8.setVisible(false);
      
            this.input9.setVisible(false);
        
            this.input10.setVisible(false);
        
            this.inpu11.setVisible(false);
        
            this.input12.setVisible(false);
            
            this.input13.setVisible(false);
             
            this.Input14.setVisible(false);
            
            this.input15.setVisible(false);
              
            this.input16.setVisible(false);
             
            this.input17.setVisible(false);
                 
            this.input18.setVisible(false);
                
            
            this.input19.setVisible(false);
             this.rep_sonido.setVisible(false);
             this.validador.setVisible(false);
      
  }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        rep_sonido = new javax.swing.JButton();
        input1 = new javax.swing.JTextField();
        input2 = new javax.swing.JTextField();
        input3 = new javax.swing.JTextField();
        input4 = new javax.swing.JTextField();
        input5 = new javax.swing.JTextField();
        input6 = new javax.swing.JTextField();
        input7 = new javax.swing.JTextField();
        input8 = new javax.swing.JTextField();
        input9 = new javax.swing.JTextField();
        input10 = new javax.swing.JTextField();
        inpu11 = new javax.swing.JTextField();
        input12 = new javax.swing.JTextField();
        input13 = new javax.swing.JTextField();
        Input14 = new javax.swing.JTextField();
        input15 = new javax.swing.JTextField();
        input16 = new javax.swing.JTextField();
        input17 = new javax.swing.JTextField();
        input18 = new javax.swing.JTextField();
        input19 = new javax.swing.JTextField();
        validador = new javax.swing.JButton();
        Output_Attemps = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Outpu_Lyric = new javax.swing.JTextArea();
        rep_sonido1 = new javax.swing.JButton();
        playBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        setLayout(new java.awt.GridLayout(1, 0));

        rep_sonido.setText("Play Song");
        rep_sonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep_sonidoActionPerformed(evt);
            }
        });

        input1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        input2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        input3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        input3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input3ActionPerformed(evt);
            }
        });

        input4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        input5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        input5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input5ActionPerformed(evt);
            }
        });

        input6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        input7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        input8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        input9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        input10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        inpu11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        input12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        input13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Input14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        input15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        input16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        input17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        input18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        input19.setText(" ");
        input19.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        validador.setText("Validar");
        validador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validadorActionPerformed(evt);
            }
        });

        Output_Attemps.setEditable(false);

        Outpu_Lyric.setEditable(false);
        Outpu_Lyric.setColumns(20);
        Outpu_Lyric.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Outpu_Lyric.setRows(5);
        jScrollPane1.setViewportView(Outpu_Lyric);

        rep_sonido1.setText("Stop");
        rep_sonido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rep_sonido1ActionPerformed(evt);
            }
        });

        playBack.setText("Atras");
        playBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Listen carefuly the song and write in each box the wrong word. Only there's one wrong word for each box");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playBack, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(input1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inpu11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input12, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Input14, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input15, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input16, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input17, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input18, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(input19, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(48, 48, 48)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Output_Attemps, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(rep_sonido)
                            .addGap(6, 6, 6)
                            .addComponent(rep_sonido1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(validador)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playBack)
                    .addComponent(jLabel1))
                .addGap(0, 536, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 29, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(input1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(input2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(input3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(input4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(input5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(input6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(input7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(input8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(input9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(input10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(inpu11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(input12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(input13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(Input14, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(input15, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(input16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(input17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(input18, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(input19, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(Output_Attemps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rep_sonido)
                                .addComponent(rep_sonido1))
                            .addGap(118, 118, 118)
                            .addComponent(validador)))
                    .addGap(0, 29, Short.MAX_VALUE)))
        );

        add(jPanel1);

        getAccessibleContext().setAccessibleName("Panel4");
    }// </editor-fold>//GEN-END:initComponents

    private void rep_sonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep_sonidoActionPerformed
        // TODO add your handling code here:
        musica.stop();
        music.reproducir();
 /*AudioClip Son;
        Son = java.applet.Applet.newAudioClip(getClass().getResource("/java/son_list_cut.mp3"));
        Son.play();
   */    
    }//GEN-LAST:event_rep_sonidoActionPerformed

    private void validadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validadorActionPerformed
        // TODO add your handling code here:
        
        Input1 = (this.input1.getText());
      Input2 = this.input2.getText();
      Input3 = this.input3.getText();
      Input4 = this.input4.getText();
      Input5 = this.input5.getText();
      Input6 = this.input6.getText();
       Input7 = (this.input7.getText());
      Input8 = this.input8.getText();
      Input9 = this.input9.getText();
      Input10 = this.input10.getText();
      Input11 = this.inpu11.getText();
      Input12 = this.input12.getText();
       Input13 = this.input13.getText();
      Input141 = this.Input14.getText();
      Input15 = this.input15.getText();
       Input16 = this.input16.getText();
      Input17 = this.input17.getText();
      Input18 = this.input18.getText();
      Input19 = this.input19.getText();
          Validacion();
          
        boolean Image_val = true;
        Lost_the_game_icon  insertar = new Lost_the_game_icon();
         Attemps--;
        this.Output_Attemps.setText("Intentos restantes: "+Attemps);
          
            
        if(save_number == 19){
            JOptionPane.showMessageDialog(null,"Has ganado \n Numero de intentos: "+Attemps);
        }
        
        
       if(Attemps < 1){
       
       this.Outpu_Lyric.setVisible(false);
         
         Image_val = false;
         
         
         SetNOvisible();
         JOptionPane.showMessageDialog(null,"Has perdido");
        
          
       }
      /* if (Image_val == false){
           
         insertar.CargarImagen(this.getGraphics());
         this.validador.setVisible(false);
       }*/
       
    }//GEN-LAST:event_validadorActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        
        if(evt.getButton() == MouseEvent.BUTTON1){
            
            System.out.println("x "+evt.getX());
            System.out.println("y "+evt.getY());
            
        }
    }//GEN-LAST:event_formMousePressed

    private void input3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input3ActionPerformed

    private void input5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input5ActionPerformed

    private void rep_sonido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rep_sonido1ActionPerformed
        music.stop();
        musica.repetir();// TODO add your handling code here:
    }//GEN-LAST:event_rep_sonido1ActionPerformed

    private void playBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBackActionPerformed
        pLevel level = new pLevel();
        level.setLocation(0, 0);
        paneMain.removeAll();
        paneMain.add(level,GridLayout.class);
        paneMain.revalidate();
        paneMain.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_playBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Input14;
    private javax.swing.JTextArea Outpu_Lyric;
    private javax.swing.JTextField Output_Attemps;
    private javax.swing.JTextField inpu11;
    private javax.swing.JTextField input1;
    private javax.swing.JTextField input10;
    private javax.swing.JTextField input12;
    private javax.swing.JTextField input13;
    private javax.swing.JTextField input15;
    private javax.swing.JTextField input16;
    private javax.swing.JTextField input17;
    private javax.swing.JTextField input18;
    private javax.swing.JTextField input19;
    private javax.swing.JTextField input2;
    private javax.swing.JTextField input3;
    private javax.swing.JTextField input4;
    private javax.swing.JTextField input5;
    private javax.swing.JTextField input6;
    private javax.swing.JTextField input7;
    private javax.swing.JTextField input8;
    private javax.swing.JTextField input9;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton playBack;
    private javax.swing.JButton rep_sonido;
    private javax.swing.JButton rep_sonido1;
    private javax.swing.JButton validador;
    // End of variables declaration//GEN-END:variables
}
