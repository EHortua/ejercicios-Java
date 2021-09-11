package clases.ada.Clase17;

import java.util.Scanner;

public class EstructuraControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca cuál es la edad mínima para votar en su país: ");
        byte edad = sc.nextByte();
        System.out.println("Introduzca cuál es la edad del votante: ");
        byte edadVotante = sc.nextByte();
        if (edadVotante >= edad ) {
            System.out.println("usted puede votar");
        } else {
            System.out.println("Usted no puede ni opinar");
        }
    }
}
