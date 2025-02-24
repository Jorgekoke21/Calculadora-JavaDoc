package Calculadora;

import java.util.Scanner;

/**

 * @author Jorge Pacheco Pavon
 * @github Jorgekoke21
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char opcion;

        do {
            System.out.println("Que quieres hacer?");
            System.out.println("Operaciones de tipo Suma (S)");
            System.out.println("Salir (X)");
            System.out.println("Elige una opcion: ");
            opcion = sc.next().charAt(0);
            switch (opcion) {
                case 'S':
                case 's':
                    Suma suma = new Suma();
                    suma.ejecutarMenu();
                    break;

                case 'X':
                case 'x':
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 'X' && opcion != 'x');

        sc.close();
    }


}