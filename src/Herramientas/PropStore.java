/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

/**
 *
 * @author Angel Flores
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
 
public class PropStore {   
    public static String windo,sound;
    public PropStore(){
        windo="true";
        sound="true";
        PropStore.main(null);
        if(!this.checkConfigFile()){
            this.firstStore();
        };
    }
    public static void main( String[] args ){
        
    }
    public  boolean checkConfigFile(){
        File tmpDir = new File("UserData/config.cfg");
        boolean exists = tmpDir.exists();
        return exists;
    }
    public static void firstStore(){
     Properties prop = new Properties();
    	try {
        File tmpDir = new File("UserData/");
        if(!tmpDir.exists()){
            new File("UserData/").mkdirs();
        }
     //set the properties value
     prop.setProperty("fullscreen", windo);
     prop.setProperty("sound", sound);
     //save properties to project root folder
     prop.store(new FileOutputStream("UserData/config.cfg"), null);
    	} catch (IOException ex) {
     ex.printStackTrace();
        }
       }
}