/***
 * Clasificar a una persona en una categoría de edad (niño, adolescente, adulto) 
 * en función de su edad.
 * @author Hans
 */
import java.util.Scanner;
public class Ejercicio6_CategoríadeEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("Introduce tu edad:");
        edad = teclado.nextInt();
        
        if (edad < 1) {
            System.out.println("Edad inválida.");
        } else if (edad <= 12) {
            System.out.println("Eres un niño.");
        } else if (edad <= 17) {
            System.out.println("Eres un adolescente.");
        } else {
            System.out.println("Eres un adulto.");
        }
    }
}

    
    
