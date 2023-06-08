/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ejercicioextra1;

import java.util.Scanner;

public class EjercicioExtra1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa los minutos: ");
        int minutos = entrada.nextInt();
        
        int dias = minutos / 1440; // como input nos piden minutos entonces en un dia hay 1440 minutos
        int horas = (minutos % 1440) / 60; 
             
        System.out.println("Es equivalente a: "+dias+" dia/s"+", "+" con "+horas+" horas.");        
    }    
}
