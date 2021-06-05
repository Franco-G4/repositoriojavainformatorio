import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
    Scanner nomap = new Scanner(System.in);
    System.out.println("Ingrese su nombre y apellido.");
    String nombreap =  nomap.nextLine(); 

    Scanner edad = new Scanner(System.in);
    System.out.println("Ingrese su edad.");
    String anosed =  edad.nextLine(); 

    Scanner direccion = new Scanner(System.in);
    System.out.println("Ingrese su direccion.");
    String dir =  direccion.nextLine(); 

    Scanner ciudad = new Scanner(System.in);
    System.out.println("Ingrese la ciudad donde vive.");
    String ciudadvive =  ciudad.nextLine(); 

        System.out.println(ciudadvive + "-" + dir + "-" + anosed + "-" + nombreap);
    nomap.close();
    edad.close();
    direccion.close();
    ciudad.close();
    }
    
}
