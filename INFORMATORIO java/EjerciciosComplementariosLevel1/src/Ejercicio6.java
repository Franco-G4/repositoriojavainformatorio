import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        //solicitud de datos
        Scanner dato = new Scanner(System.in);
        System.out.println("ingrese el primer numero.");
        int numero = dato.nextInt();
        Scanner dato2 = new Scanner(System.in);
        System.out.println("ingrese el segundo numero.");
        
        
        int numero2 = dato2.nextInt();
        int prod = 1;
        //
        for (int i = 1; i <= numero2; i++) {
            prod = prod * numero;
        }
        System.out.println("el resultado es: " + prod);
        dato.close();
        dato2.close();
    }
}
