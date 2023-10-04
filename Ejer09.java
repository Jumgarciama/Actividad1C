import java.io.PrintStream;
import java.util.Scanner;

public class Ejer09 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {
        float distancia;
        float velocidad;
        float tiempo;

        screen.println("Ingrese la distancia a recorrer en metros:");
        distancia= keyboard.nextFloat();
        screen.println("Ingrese el tiempo en segundos que se quiere demorar:");
        tiempo= keyboard.nextFloat();
        velocidad= distancia/tiempo;
        screen.println("La velocidad necesaria para realizar esa distancia en ese tiempo es de: "+velocidad+ "  m/s");

    }
}
