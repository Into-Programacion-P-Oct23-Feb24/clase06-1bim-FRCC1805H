/*

ANA DIAZ con edad 19, es estudiante de UTPL 

luis vera con edad 10, es estudiante 
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese el nombre del estudiante");
        String nombre = entrada.nextLine();
        nombre = nombre.toLowerCase();
        System.out.println("Ingrese el apellido del estudiante");
        String apellido = entrada.nextLine();
        apellido = apellido.toLowerCase();
        System.out.println("Ingrese la universidad del estudiante");
        String universidad = entrada.nextLine();
        universidad = universidad.toLowerCase();
        System.out.println("Ingrese su la edad");
        int edad = entrada.nextInt();

        // nombre = "atacames"
        char valor = nombre.charAt(0); // obtener el primer caracter de una
        // cadena
        //  L   o   j   a
        //  0   1   2   3
        switch (valor) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.printf("Estudiante %s %s con edad de %d "
                        + "es estudiante de %S",
                        nombre.toLowerCase(),
                        apellido.toLowerCase(),
                        edad, universidad.toLowerCase());
                break;

            default:
                System.out.printf("Estudiante %s %s con edad de %sd "
                        + "es estudiante de %s",
                        nombre.toUpperCase(),
                        apellido.toUpperCase(),
                        edad, universidad.toUpperCase());
                break;

        }

    }
}
