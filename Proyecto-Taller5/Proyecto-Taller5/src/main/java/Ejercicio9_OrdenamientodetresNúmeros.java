/***
 * Dados tres números, ordenarlos en orden ascendente.
 * @author Hans
 */
import java.util.Scanner;
public class Ejercicio9_OrdenamientodetresNúmeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Ingrese el primer numero: ");
        num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        num3 = teclado.nextInt();
        
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp; 

        }
        
        System.out.println("Los números ordenados de forma ascendente son: " + num1 + ", " + num2 + ", " + num3);

        
        
    }
    
}

