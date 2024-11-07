/***
 * Dados tres números, determinar cuál es el mayor. Si son iguales, mostrar un mensaje.
 * @author Javier Solano
 */
import java.util.Scanner;
public class Ejercicio3_MayorDeTresNumeros {
    public static void main(String[] args) {
        int a, b, c;
        Scanner tcl = new Scanner(System.in);
        System.out.println("DAME TRES NUMEROS: ");
        a = tcl.nextInt();
        b = tcl.nextInt();
        c = tcl.nextInt();
        System.out.println("EL MAYOR ES: " + (( a > b > c ) ? a : b : c));
        /*mayor = (a>b>c) ? a : b : c ;
        System.out.println("EL MAYOR ES: " + mayor); */
       
       
        
    }

    
            
    
}
    }
    
}
