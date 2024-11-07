/***
 * Calcular el precio final de un producto con un descuento del 10% si el precio 
 * original es mayor de $100; de lo contrario, no hay descuento.
 * @author Javier Solano
 */
import java.util.Scanner;
public class Ejercicio4_DescuentoCompras {
    public static void main(String[] args) {
       Scanner tcl = new Scanner(System.in);
       int preciooriginal;
        System.out.println("Ingrese el precio original: ");
        preciooriginal = tcl.nextInt();
        double preciofinal;
        if (preciooriginal > 100){
            preciofinal = preciooriginal -(preciooriginal * 0.10);
    } else {
            preciofinal = preciooriginal;
        }
        System.out.println("EL PRECIO FINAL DEL PRODUCTO ES: $ " + preciofinal);        
        }
        
    }

