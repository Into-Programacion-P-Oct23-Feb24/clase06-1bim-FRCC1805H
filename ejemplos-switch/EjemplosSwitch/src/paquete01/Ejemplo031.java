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
       
        
        System.out.println("Ingrese el nombre del estudiante ");
        String nombre1 = entrada.nextLine();
        System.out.println("Ingrese el apellido del estudiante ");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese su edad ");
        String edad = entrada.nextLine();
        System.out.println("Ingrese su univercidad ");
        String univercidad = entrada.nextLine();
        
        
        
        System.out.println("Ingrese el nombre de una ciudad del Ecuador");
        String nombre = entrada.nextLine();
        // nombre = "atacames"
        char valor = nombre.charAt(0); // obtener el primer caracter de una
                                       // cadena
        //  L   o   j   a
        //  0   1   2   3
        switch(valor){
            case 'a':
            case'e':
            case'i': 
            case'o':
            case'u':
                System.out.printf("Ingrese el nombre del estudiante %s de %s\n", 
                        valor, nombre.toLowerCase());
                break;
            
            case 'e':
            case 'E':
                System.out.printf("Ingrese el apellido %s de %s\n", 
                        valor, nombre.toLowerCase());
                break;    
             
            case 'i':
            case 'I':
                System.out.printf("Nombre con inicial %s de %s\n", 
                        valor, nombre.toLowerCase());
                break;    
            
            case 'o':
            case 'O':
                System.out.printf("Nombre con inicial %s de %s\n", 
                        valor, nombre.toLowerCase());
                break;     
            
            case 'u':
            case 'U':
                System.out.printf("Nombre con inicial %s de %s\n", 
                        valor, nombre.toLowerCase());
                break;    
            
            default:
                System.out.println("opción incorrecta; ninguna de las "
                        + "anteriores");
                break;
                
        }
        
    }
}
