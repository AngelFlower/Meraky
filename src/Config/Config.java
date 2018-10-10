/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.io.FileInputStream;
//import java.util.*;
import java.util.Properties;
 
public class Config
{
   Properties prop;
   public Config()
   {
   prop = new Properties();
    try {
        prop.load(new FileInputStream("config/config.cfg"));
        System.out.println("loaded");
    }catch(Exception eta){
        eta.printStackTrace();
    }
   }
 
   public String getProperty(String key){
    String value = this.prop.getProperty(key);
    return value;
   }
}