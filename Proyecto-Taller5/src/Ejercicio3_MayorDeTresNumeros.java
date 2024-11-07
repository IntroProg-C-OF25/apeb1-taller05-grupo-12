/***
 * Dados tres números, determinar cuál es el mayor. Si son iguales, mostrar un mensaje.
 * @author Javier Solano
 */
import java.util.Scanner;
public class Ejercicio3_MayorDeTresNumeros {
    public static void main(String[] args) {
        int a, b, c;
        Scanner tcl = new Scanner(System.in);
        System.out.println("DAME EL PRIMER NUMERO: ");
        a = tcl.nextInt();
        System.out.println("DAME EL SEGUNDO NUMERO: ");
        b = tcl.nextInt();
        System.out.println("DAME EL TERCER NUMERO: ");
        c = tcl.nextInt();
        if (a>b && a>c)
            
        System.out.println("EL MAYOR ES: " +  a);
        else if (b>a && b>c)
            System.out.println("EL MAYOR ES: " + b );
        else if (c>a && c>b)
            System.out.println("EL MAYOR ES: " + c);
        else if (a==b && a==c)
            System.out.println("LOS NUMEROS SON IGUALES");
           
    }

    
            
    
}
    
    

