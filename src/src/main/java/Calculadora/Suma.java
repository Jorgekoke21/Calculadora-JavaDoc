package Calculadora;

import java.util.Scanner;


/**
 * @author Jorge Pacheco Pavon
 * @github Jorgekoke21
 * @version 1.0
 */


public class Suma {

    /**
     * Almacenar los valores de la summa
     * @param acumulado Guarda el resultado acummulado
     */

    private double acumulado = 0;


    /**
     * Sumar dos números reales.
     * @param a Primer número real.
     * @param b Segundo número real.
     * @return Resultado de la suma de los números con decimales
     */

    public static double sumarReales(double a, double b) {
        return a + b;
    }


    /**
     * Sumar dos números enteros.
     * @param a Primer número entero.
     * @param b Segundo número entero.
     * @return La suma de los dos números enteros.
     */

    public static int sumarEnteros(int a, int b) {
        return a + b;
    }


    /**
     * Suma tres números reales.
     * @param a Primer número real.
     * @param b Segundo número real.
     * @param c Tercer número real.
     * @return La suma de los tres números
     */

    public static double sumarTres(double a, double b, double c) {

        return a + b + c;
    }


    /**
     * Suma con el valor acumulado de thisAcumulado
     * @param a Número real a sumar al acumulado.
     * @return Resultado de la suma acumulada.
     */

    public double sumarAcumulado(double a) {
        this.acumulado += a;
        return this.acumulado;
    }





    /**
     * ¿Qué ocurre cuando alguno de los parámetros de entrada es cero?
     *
     * @param a Primer número
     * @param b Segundo número
     * @return La suma de los dos números reales
     * @throws IllegalArgumentException Si alguno de los numeros es cero
     * Se lanza mensaje de que los parametros no pueden ser cero
     */

    public double sumar(double a, double b) {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("Los parámetros no pueden ser cero.");
        }
        return a + b;
    }


    /**
     * No se pueden inctroducir numeros negativos
     *
     * @param a Primer número entero.
     * @param b Segundo número entero.
     * @return La suma de los dos números enteros.
     * @throws IllegalArgumentException Si alguno de los numeros es negativo
     * Se lanza mensaje de que no se pueden sumar números negativos.
     */

    public int sumar(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Los parámetros no pueden ser negativos.");
        }
        return a + b;
    }


    /**
     * @description el menú de opciones para la clase Suma.
     */


    public static void menu() {
        System.out.println("=== Menú de la clase Suma ===");
        System.out.println("1. Sumar dos números reales");
        System.out.println("2. Sumar dos números enteros");
        System.out.println("3. Sumar tres números reales");
        System.out.println("4. Sumar al valor acumulado");
        System.out.println("5. Salir");
    }

    /**
     * Ejecuta el menú de opciones para realizar diferentes operaciones de suma.
     * Permite al usuario seleccionar y realizar diversas operaciones de suma.
     *  Utilizamos los diferentes metodos creamos arriba  {@link #sumarReales(double, double)
     */


    public void ejecutarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            menu(); // Mostrar el menú
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el primer número real: ");
                    double a1 = sc.nextDouble();
                    System.out.print("Ingresa el segundo número real: ");
                    double b1 = sc.nextDouble();
                    System.out.println("Resultado: " + sumarReales(a1, b1));
                    break;

                case 2:
                    System.out.print("Ingresa el primer número entero: ");
                    int a2 = sc.nextInt();
                    System.out.print("Ingresa el segundo número entero: ");
                    int b2 = sc.nextInt();
                    System.out.println("Resultado: " + sumarEnteros(a2, b2));
                    break;

                case 3:
                    System.out.print("Ingresa el primer número real: ");
                    double a3 = sc.nextDouble();
                    System.out.print("Ingresa el segundo número real: ");
                    double b3 = sc.nextDouble();
                    System.out.print("Ingresa el tercer número real: ");
                    double c3 = sc.nextDouble();
                    System.out.println("Resultado: " + sumarTres(a3, b3, c3));
                    break;

                case 4:
                    System.out.print("Ingresa un número real para sumar al acumulado: ");
                    double num = sc.nextDouble();
                    System.out.println("Nuevo valor acumulado: " + sumarAcumulado(num));
                    break;

                case 5:
                    System.out.println("Saliendo del menú...");
                    break;


                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 5);
    }


}