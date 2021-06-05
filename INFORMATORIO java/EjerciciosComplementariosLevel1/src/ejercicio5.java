import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        
        //solicitud de datos
        Scanner dato = new Scanner(System.in);
        System.out.println("ingrese el primer numero.");
        int numero = dato.nextInt();
        Scanner dato2 = new Scanner(System.in);
        System.out.println("ingrese el segundo numero.");
        
        
        int numero2 = dato2.nextInt();
        int prod = 0;
        //
        for (int i = 1; i <= numero; i++) {
            prod = prod + numero2;
        }
        System.out.println("el resultado es: " + prod);
        dato.close();
        dato2.close();
    }
}
