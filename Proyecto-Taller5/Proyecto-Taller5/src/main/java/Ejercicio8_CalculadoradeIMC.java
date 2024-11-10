/***
 * Calcular el índice de masa corporal (IMC) de una persona y clasificarla 
 * en función de su valor (bajo peso, peso normal, sobrepeso, etc.).
 * @author Hans
 */
import java.util.Scanner;
public class Ejercicio8_CalculadoradeIMC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura, peso, imc;
        System.out.print("Ingrese tu altura en metros:");
        altura = teclado.nextDouble();
        System.out.print("Ingrese tu peso en kilogramos: ");
        peso = teclado.nextDouble();
        imc = peso / (altura * altura);
        System.out.println("Su IMC es: " + imc);
        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        }else { 
        if (imc >= 30 && imc < 35) {
            System.out.println("Obesidad grado 1");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidad grado 2");
        } else {
            System.out.println("Obesidad grado 3");
            
        }

    }
}
        
        
        
    }

    

