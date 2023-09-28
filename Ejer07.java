import java.io.PrintStream;
import java.util.Scanner;

public class Ejer07 {
    public static PrintStream screen= System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        double ancho;
        double alto;
        double largo;
        double volumen;

        screen.println("Ingrese el alto del acuario en cm:");
        alto = keyboard.nextDouble();
        screen.println("ingrese el ancho del acuario en cm:");
        ancho = keyboard.nextDouble();
        screen.println("ingrese el largo del acuario en cm:");
        largo = keyboard.nextDouble();

        volumen= alto*ancho*largo;
        volumen = volumen * 0.90;

        screen.println("El volumen de agua necesario equivale a: "+volumen+" cm3");

    }
}
