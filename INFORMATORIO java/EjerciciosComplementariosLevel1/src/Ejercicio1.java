import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String [] args){
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("ingrese su nombre.");
        String nombre = lectura.nextLine();

        System.out.println("Hola " + nombre );

        lectura.close(); //daba error en fuga de recursos. . . scaner lectura
    }
    
}
