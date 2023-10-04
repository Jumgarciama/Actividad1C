import java.io.PrintStream;
import java.util.Scanner;

public class Ejer03 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
    float horas;
    float valhora;
    float porfuente;
    float salbruto;
    float salneto;
    float retefuente;

    screen.println("Ingrese la cantidad de horas de trabajo:");
    horas=keyboard.nextFloat();
    screen.println("Ingrese el valor de la hora de trabajo:");
    valhora=keyboard.nextFloat();
    screen.println("Ingrese el porcentaje de retencion que aplica al trabajador:");
    porfuente= keyboard.nextFloat();
    salbruto = horas * valhora;
    retefuente = (salbruto * porfuente)/100;
    salneto = salbruto - retefuente;
    screen.println("El salario bruto es: "+ salbruto + "  El salario neto es: "+ salneto+"  La retencion en la fuente del trabajador fue de:" + retefuente);
    }
}
