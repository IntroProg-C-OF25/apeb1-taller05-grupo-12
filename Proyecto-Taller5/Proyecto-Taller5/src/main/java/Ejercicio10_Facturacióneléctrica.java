/***
 * Desarrollar una solución que permita calcular y mostrar el valor a cancelar de una planilla de luz. 
 * Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. 
 * Si el usuario tiene edad mayor a 65 años, se debe descontar el 10% para pertenecer a la tercera edad.
 * @author Hans
 */
import java.util.Scanner;
public class Ejercicio10_Facturacióneléctrica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double costoporkwh, consumokwh, costototal;
        
        System.out.print("Ingrese el costo por kilovatio/hora: ");
        costoporkwh = teclado.nextDouble();

        System.out.print("Ingrese el numero de kilovatios consumidos: ");
        consumokwh = teclado.nextDouble();

        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();

        costototal = costoporkwh * consumokwh;

        double descuento = 0;
        if (edad >= 65) {
            descuento = costototal * 0.10; 
            costototal -= descuento;
        }

        System.out.println("El valor a cancelar es: $" + costototal);
        if (descuento > 0) {
            System.out.println("Se aplico un descuento de $" + descuento + " por pertenecer a la tercera edad. ");
        }

    }
}
    
    


