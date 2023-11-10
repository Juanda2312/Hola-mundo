/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author juand
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner n1 = new Scanner(System.in);
        System.out.println("Escriba un numero");

        double a = n1.nextDouble();
        if (a > 0) {

            Scanner n2 = new Scanner(System.in);
            System.out.println("Escriba Otro numero");

            double b = n2.nextDouble();
            if (b > 0) {

                double suma = a + b;
                double resta = a - b;
                double mult = a * b;
                double divi = a / b;

                System.out.println("\n La suma de tus numeros es: " + suma);
                System.out.println("\n La resta de tus numeros es: " + resta);
                System.out.println("\n La multiplicacion de tus numeros es: " + mult);
                System.out.println("\n La division de tus numeros es: " + divi);

            } else {
                System.out.println("Tu numero debe ser mayor que 1");
            }
        } else {
            System.out.println("Tu numero debe ser mayor que 1");

        }

    }

}
