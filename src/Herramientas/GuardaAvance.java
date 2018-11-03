/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author angel
 */
public class GuardaAvance {
    //puedes cambiar el nombre del archivo y la extensión a la que
        //quieras...
        private static final String FILENAME = "UserData.dat";
       
        public static void main(String[] args) {
               System.out.println("12345");
                GuardaAvance t = new GuardaAvance();
                //almacenamos los datos del usuario en el objeto que hemos
                //creado para tal efecto:
                DatosUsuario datos = new DatosUsuario();
                datos.setNombre("Player01");           
                datos.setNivel(2);
                datos.setPuntos(1230);
               
                //serializamos (guardamos) los datos en un fichero de texto (FILENAME)
                try {
                        t.saveData(datos);
                } catch (IOException e) {
                        //si se produce un error...
                        e.printStackTrace();
                }
               
                //y para leerlos nuevamente es tan sencillo como esto:
                DatosUsuario readData = null;
                try {
                        readData = t.readData();
                } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();
                }
                if(readData != null)
                        System.out.println(readData.toString());
        }
       
        public void saveData(DatosUsuario data) throws IOException{
               
                //Creamos el archivo (si existía anteriormente se borrará y creará de nuevo)
                FileOutputStream fs = new FileOutputStream(FILENAME);
                //Esta clase tiene el método writeObject() que necesitamos
        ObjectOutputStream os = new ObjectOutputStream(fs);
        //El método writeObject() serializa el objeto y lo escribe en el archivo
        os.writeObject(data);
        //cerramos el stream
        os.close();            
        }
       
        public DatosUsuario readData() throws IOException, ClassNotFoundException {
                DatosUsuario data;
                FileInputStream fis = new FileInputStream(FILENAME);
        ObjectInputStream ois = new ObjectInputStream(fis);
        data = (DatosUsuario) ois.readObject();//El método readObject() recupera el objeto
        ois.close();
                return data;
        }
}
