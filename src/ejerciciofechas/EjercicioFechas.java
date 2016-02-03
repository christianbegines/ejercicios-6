/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofechas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
        String diasS[] = {"domingo", "lunes", "martes", "miercoles", "jueves", "viernes", "sabado"};
        String mesA[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        Date hoy = new Date();
        GregorianCalendar calenG = new GregorianCalendar();
        calenG.setTime(hoy);
        String fecha,fecha2;
        Locale fEsp=new Locale( "es", "ES","Traditional_WIN");
        
        System.out.print("\nHoy es ");
        System.out.print(diasS[calenG.get(Calendar.DAY_OF_WEEK) - 1]);
        System.out.print(", dia " + calenG.get(Calendar.DAY_OF_MONTH));
        System.out.print(" de " + mesA[calenG.get(Calendar.MONTH)]);
        System.out.print(" del año " + calenG.get(Calendar.YEAR));
        System.out.print(", y son las " + calenG.get(Calendar.HOUR_OF_DAY));
        System.out.print(":" + calenG.get(Calendar.MINUTE));
        System.out.println();
        
        //15-01-16        
        DateFormat formato= new SimpleDateFormat("dd-MM-yy");
        fecha=formato.format(hoy);        
        System.out.println(fecha);
        
        //c. 2016.01.15 13:30:15:55
        DateFormat formato1= new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        fecha=formato1.format(hoy);
        System.out.println(fecha);
        
        //viernes, Ene 15, '16
        DateFormat formato2= new SimpleDateFormat("EEEE, MMM d, ''yy");
        fecha2=formato2.format(hoy);
        System.out.println(fecha2);
        
        //1:30 PM
        DateFormat formatoHora= new SimpleDateFormat("h:mm a");
        fecha2=formatoHora.format(hoy);
        System.out.println(fecha2);
        
        //. 13:30:55:624
        DateFormat formatoHoraLarga= new SimpleDateFormat("HH:mm:ss:SS");
        fecha2=formatoHoraLarga.format(hoy);
        System.out.println(fecha2);
        
        //2016.enero.15 13:30
        DateFormat formato3= new SimpleDateFormat("yyyy.MMMMM.dd HH:mm");
        fecha2=formato3.format(hoy);
        System.out.println(fecha2);
        
        /*
        Como se puede comprovar el SimpleDateFormat es la herramienta mas util a la hora 
        de dar forma a fechas siguiendo unos patrones.
        */
       
        
    }

}
