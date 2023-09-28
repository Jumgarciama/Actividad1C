import java.io.PrintStream;
import java.util.Scanner;

public class Ejer04 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args) {
        int plata;
        int mil;
        int quinientos;
        int doscientos;
        int cien;
        int cincuenta;
        int uno;

        screen.println("Ingrese la cantidad de dinero que quiere dividir:");
        plata = keyboard.nextInt();
        mil=plata/1000;
        plata = plata % 1000;
        quinientos = plata / 500;
        plata = plata % 500;
        doscientos = plata / 200;
        plata = plata % 200;
        cien = plata / 100;
        plata = plata % 100;
        cincuenta = plata /50;
        plata = plata % 50;
        uno = plata;
        screen.println("La cantidad ingresada de divide en: "+ mil +" monedas de mil,"+quinientos+" monedas de quinientos, "+doscientos+" monedas de doscientos, "+cien+" monedas de cien, "+ cincuenta + " monedas de cincuenta, "+ uno + " monedas de uno.");

    }
}