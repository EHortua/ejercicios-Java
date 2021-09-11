package clases.ada.clase11;

import java.util.Scanner;

/*
 * Una empresa importadora desea determinar cuantos dólares puede adquirir con equis
 * cantidad de dinero mexicano, realice diagrama de flujo y pseudocodigo.
 * */
public class Clase11 {
    public static void main(String[] args) {
        System.out.println("***** Ejercicio 2 *****");
        Scanner lector = new Scanner(System.in);
        double dolarEnArgentina, cantPesosArgentinos, totalDolares;
        System.out.print("Introduzca el precio del dolar hoy: ");
        dolarEnArgentina = lector.nextDouble();
        System.out.print("Introduzca la cantidad de pesos ARS que desea cambiar: ");
        cantPesosArgentinos = lector.nextDouble();
        totalDolares = cantPesosArgentinos / dolarEnArgentina;
        System.out.println("La cantidad de dólares a recibir es de: " + totalDolares + " USD");
    }
}
