/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Niveles;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author uriel
 */
public class Lost_the_game_icon {
    ImageIcon  pic = new ImageIcon(new ImageIcon(getClass().getResource("/img/Lost.png")).getImage());
    
    public void CargarImagen(Graphics g){
  g.drawImage(pic.getImage(),91,173,500,250,null);
  
    }
    public static void main(String[] args) {
        
    }
}
