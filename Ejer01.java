import java.io.PrintStream;
import java.util.Scanner;

public class Ejer01 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void  main(String[] args){

        int num;
        int resultado;

        screen.println("Ingrese el numero que quiere consultar:");
        num = keyboard.nextInt();
        resultado = num % 2;
        screen.println("El residuo de la division por 2 es: "+resultado);
    }

}
