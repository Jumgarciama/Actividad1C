import java.io.PrintStream;
import java.util.Scanner;

public class Ejer02 {

    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args){

        long cel;
        int prefijo;

        screen.println("Ingrese el numero de celular:");
        cel = keyboard.nextLong();
        prefijo = Math.toIntExact(cel/10000000);
        screen.println("El prefijo es: "+ prefijo);

    }
}
