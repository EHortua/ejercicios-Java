package clases.ada.Clase17;

import java.util.Scanner;

/*
Realice un algoritmo para determinar el sueldo semanal de un trabajador con base en
las horas trabajadas y el pago por hora, considerando que después de las 40 horas cada
hora se considera como excedente y se paga el doble.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        float sueldoSemanal;
        final byte JORNADA_LABORAL_SEMANAL = 40;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de horas trabajadas: ");
        float horasTrabajadas = sc.nextFloat();
        System.out.println("Introduzca el valor de la hora: ");
        float valorHora = sc.nextFloat();
        float horasExcedente;

        if(horasTrabajadas>JORNADA_LABORAL_SEMANAL){
            horasExcedente = horasTrabajadas-JORNADA_LABORAL_SEMANAL;
            sueldoSemanal = (valorHora*JORNADA_LABORAL_SEMANAL)+(horasExcedente*valorHora*2);
        } else{
            sueldoSemanal = valorHora*horasTrabajadas;
        }
        System.out.println("El sueldo semanal es: "+sueldoSemanal);


    }
}
