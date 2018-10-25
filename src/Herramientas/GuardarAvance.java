/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
/**
 *
 * @author angel
 */
public class GuardarAvance {
    public static String lv;
    public GuardarAvance(){
        lv="1";
        GuardarAvance.main(null);
        if(!this.checkConfigFile()){
        System.out.println("dfgdfh");
            this.PrimerUso();
        };
    }
    public static void main( String[] args )
    {
        
    }
    public  boolean checkConfigFile(){
        File tmpDir = new File("data/avance.dat");
        boolean exists = tmpDir.exists();
        return exists;
    }
    public static void PrimerUso(){
     Properties prop = new Properties();
    	try {
        File tmpDir = new File("data/");
        if(!tmpDir.exists()){
            new File("data/").mkdirs();
        }
     //set the properties value
     prop.setProperty("Level", lv);
     //save properties to project root folder
     prop.store(new FileOutputStream("data/avance.dat"), null);
    	} catch (IOException ex) {
     ex.printStackTrace();
        }
       }
}

