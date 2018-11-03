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
import java.io.Serializable;
 
public class DatosUsuario implements Serializable {
        int nivel = 0;
        int puntos = 0;
        String nombre = "";
       
        public int getNivel() {
                return nivel;
        }
        public void setNivel(int nivel) {
                this.nivel = nivel;
        }
        public int getPuntos() {
                return puntos;
        }
        public void setPuntos(int puntos) {
                this.puntos = puntos;
        }
        public String getNombre() {
                return nombre;
        }
        public void setNombre(String nombre) {
                this.nombre = nombre;
        }
       
        //es buena idea poner siempre un método toString() para
        //mostrar todos los datos del objeto.
       
        public String toString(){
                return "Nombre: " + nombre + "\nPuntos: " + puntos + "\nNivel: " + nivel;
        }
       
}