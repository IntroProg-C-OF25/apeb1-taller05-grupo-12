/***
 * Determinar si una persona es elegible para votar en función de su edad (mayor o igual a 18 años).
 * @author Javier Solano
 */
import java.util.Scanner;
public class Ejercicio1_EdadVotar {
    public static void main(String[] args) {
        int edad;
        Scanner tcl = new Scanner(System.in);
        System.out.println("DAME EDAD: ");
        edad = tcl.nextInt();
        if (edad >= 18)
            System.out.println("SI PUEDE VOTAR");
        else
            System.out.println("NO PUEDE VOTAR");       
    }
    
}
/***
 * run:
 */
