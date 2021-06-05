import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String [] args) {
        Scanner dato = new Scanner(System.in);
        
        System.out.println("ingrese un numero.");
        int numero = dato.nextInt();
        for (int i = 1; i <= numero; i++){
            System.out.println("contando");
            System.out.println(i);
        }
        dato.close();
    }
}
