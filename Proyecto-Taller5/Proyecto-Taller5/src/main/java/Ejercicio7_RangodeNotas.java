/***
 * Asignar una letra (A, B, C, D) a una calificación en función de su rango 
 * (A para 90-100, B para 80-89, etc.).
 * @author Hans
 */
import java.util.Scanner;
public class Ejercicio7_RangodeNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int calificacion;
        System.out.println("Introduce tu calificacion (0 a 100):");
        calificacion = teclado.nextInt();
        char letra;
        
        if (calificacion >= 90 && calificacion <= 100) {
            letra = 'A';
        } else if (calificacion >= 80 && calificacion < 90) {
            letra = 'B';
        } else if (calificacion >= 70 && calificacion < 80) {
            letra = 'C';
        } else if (calificacion <= 69 && calificacion >= 0) {
            letra = 'D';
        } else {
            System.out.println("Calificación invalida, debe estar entre 0 y 100.");
            return;
        }
      
        System.out.println("La letra correspondiente para  calificacion " + calificacion + " es: " + letra);
    }
}

            
        
      
       
    

