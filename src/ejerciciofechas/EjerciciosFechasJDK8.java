/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author chavo
 */
public class EjerciciosFechasJDK8 {
    public static void main (String [] args){
        LocalDateTime hoy= LocalDateTime.now();
        String fecha,semana,mes,año,dia,horas;
        Locale fEsp=new Locale( "es", "ES","Traditional_WIN");
        String aux="Hoy es";
        String aux1="dia";
        String aux2="de";
        String aux3="del año";
        String aux4="y son las";
         //“Hoy es Viernes, día 15 de Enero del año 2016 y son las 13:30”.//
         DateTimeFormatter formateadorSemana = DateTimeFormatter.ofPattern(" EEEE ");
         DateTimeFormatter formateadorDia = DateTimeFormatter.ofPattern(" dd ");
         DateTimeFormatter formateadorMes = DateTimeFormatter.ofPattern(" MMMM ");
         DateTimeFormatter formateadorAño = DateTimeFormatter.ofPattern(" yyyy ");
         DateTimeFormatter formateadorHoras = DateTimeFormatter.ofPattern(" H:m", fEsp);
         semana=formateadorSemana.format(hoy);
         dia=formateadorDia.format(hoy);
         mes=formateadorMes.format(hoy);
         año=formateadorAño.format(hoy);
         horas=formateadorHoras.format(hoy);
         System.out.println(horas);
         System.out.println(aux+semana+aux1+dia+aux2+mes+aux3+año+aux4+horas);
         //15-01-16 
         DateTimeFormatter formateador1 = DateTimeFormatter.ofPattern("dd-MM-yy");
         fecha = formateador1.format(hoy);
         System.out.println(fecha);
         //c. 2016.01.15 13:30:15:55
         DateTimeFormatter formateador2 = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss:A");
         fecha = formateador2.format(hoy);
         System.out.println(fecha);
         //viernes, Ene 15, '16
         DateTimeFormatter formateador3 = DateTimeFormatter.ofPattern("EEEE, MMM dd, ''yy");
         fecha = formateador3.format(hoy);
         System.out.println(fecha);
         //1:30 PM
         DateTimeFormatter formateador4 = DateTimeFormatter.ofPattern("H:mm");
         fecha = formateador4.format(hoy);
         System.out.println(fecha);
         //2016.enero.15 13:30
         DateTimeFormatter formateador5 = DateTimeFormatter.ofPattern("yyyy.MMMM.dd H:mm");
         fecha = formateador5.format(hoy);
         System.out.println(fecha);

    }
}
