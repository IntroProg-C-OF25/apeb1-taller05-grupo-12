
/***
 * Comprobar si un año ingresado es bisiesto o no. 
 * Si es bisiesto, muestra un mensaje especial.
 * @author Hans
 */
import java.util.Scanner;
public class Ejercicio5_AñoBisiesto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int bisiesto;
        System.out.println("Introduce un año:");
        bisiesto = teclado.nextInt();
        if ((bisiesto % 4 == 0 && bisiesto % 100 != 0) || (bisiesto % 400 == 0)) {
            System.out.println("El año " + bisiesto + " es bisiesto");
        } else {
            System.out.println("El año " + bisiesto + " no es bisiesto");
        }
    }
}

