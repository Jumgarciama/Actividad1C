import java.io.PrintStream;
import java.util.Scanner;

public class Ejer06 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int segundos;
        int minutos;
        int horas;
        int dias;

        screen.println("Ingrese el numero de segundos:");
        segundos = keyboard.nextInt();
        dias = segundos / 86400;
        segundos = segundos % 86400;
        horas = segundos /3600;
        segundos = segundos % 3600;
        minutos = segundos /60;
        segundos = segundos%60;

        screen.println("El valor ingresado equivale a:" +dias+ "dias "+horas+"horas "+minutos+"minutos "+segundos+"segundos.");
    }
}
