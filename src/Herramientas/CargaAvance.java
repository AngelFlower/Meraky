/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

/**
 *
 * @author angel
 */
import java.io.FileInputStream;
import java.io.Serializable;
import java.util.Properties;
 
public class CargaAvance {
        Properties prop;
   public CargaAvance(){
   GuardaAvance avance = new GuardaAvance();
   prop = new Properties();
    try {
        prop.load(new FileInputStream("UserData/advance.dat"));
        System.out.println("Advance loaded");
    }catch(Exception eta){
        eta.printStackTrace();
    }
   }
 
   public String getProperty(String key){
    String value = this.prop.getProperty(key);
    return value;
   }
}