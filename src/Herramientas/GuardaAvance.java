/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Properties;

/**
 *
 * @author angel
 */
public class GuardaAvance {
    public static String nivel;
    public GuardaAvance(){
        nivel="0";
        PropStore.main(null);
        if(!this.checkConfigFile()){
        System.out.println("Levelss");
            this.firstStore();
        };
    }
    public static void main( String[] args )
    {
        
    }
    public  boolean checkConfigFile(){
        File tmpDir = new File("UserData/advance.dat");
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
     prop.setProperty("level", nivel);
     //save properties to project root folder
     prop.store(new FileOutputStream("UserData/advance.dat"), null);
    	} catch (IOException ex) {
     ex.printStackTrace();
        }
       }
}
