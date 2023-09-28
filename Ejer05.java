import java.io.PrintStream;
import java.util.Scanner;

public class Ejer05 {

    public static PrintStream screen = System.out;
    public static Scanner keyboard= new Scanner(System.in);

    public static void main(String[] args) {
        float pesos;
        float valdll;
        float valeur;
        float dolar;
        float euro;

        screen.println("Ingrese la cantidad de pesos a convertir:");
        pesos = keyboard.nextFloat();
        screen.println("Ingrese la tasa de cambio para el dolar:");
        valdll = keyboard.nextFloat();
        screen.println("ingrese la tasa de cambio del euro:");
        valeur = keyboard.nextFloat();

        dolar=pesos/valdll;
        euro=pesos/valeur;

        screen.println("El valor en dolares es: "+ dolar+ "El valor en euros es: "+ euro);

    }
}
