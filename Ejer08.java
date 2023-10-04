import java.io.PrintStream;
import java.util.Scanner;

public class Ejer08 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {
        double ancho;
        double alto;
        double hipotenusa;
        double pulgadas;

        screen.println("Ingrese el ancho del televisor en cm:");
        ancho= keyboard.nextDouble();
        screen.println("Ingrese el alto del televisor en cm:");
        alto = keyboard.nextDouble();
        hipotenusa = Math.sqrt(Math.pow(ancho,2)+Math.pow(alto,2));
        pulgadas=hipotenusa/2.64;
        screen.println("El televisor es de: "+ pulgadas + " Pulgadas");


    }
}
