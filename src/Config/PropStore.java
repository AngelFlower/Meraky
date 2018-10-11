/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

/**
 *
 * @author Angel Flores
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
 
public class PropStore 
{
    public PropStore(){
        PropStore.main(null);
        if(!this.checkConfigFile()){
            this.firstStore();
        };
    }
    public static void main( String[] args )
    {
        
    }
    public  boolean checkConfigFile(){
        File tmpDir = new File("config/config.cfg");
        boolean exists = tmpDir.exists();
        return exists;
    }
    public void firstStore(){
     Properties prop = new Properties();
    	try {
     //set the properties value
     prop.setProperty("fullscreen", "true");
     prop.setProperty("wHeight", "600");
     prop.setProperty("wWidth", "800");
 
     //save properties to project root folder
     prop.store(new FileOutputStream("config/config.cfg"), null);
    	} catch (IOException ex) {
     ex.printStackTrace();
        }
       }
}