/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofechas;
import java.util.*;
/**
 *
 * @author daw1
 */
public class EjercicioFechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //“Hoy es Viernes, día 15 de Enero del año 2016 y son las 13:30”.//
        String diasS[]={"domingo","lunes","martes","miercoles","jueves","viernes","sabado"};
        String mesA[]={"enero","febrero","marzo", "abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        Date hoy = new Date();                       
        GregorianCalendar calendario= new GregorianCalendar();
        calendario.setTime(hoy);
    }
    
}
