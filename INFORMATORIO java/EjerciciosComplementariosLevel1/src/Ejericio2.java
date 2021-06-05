import java.util.Scanner;

public class Ejericio2 {
    public static void main(String[] args) {
    Scanner num1 = new Scanner(System.in);
    Scanner num2 = new Scanner(System.in);

    System.out.println("ingrese el primer numero : ");
    int numero1 = num1.nextInt();
    System.out.println("ingrese el segundo numero : ");
    int numero2 = num2.nextInt();
    
    System.out.println("la suma de " + numero1 + " + " + numero2 + " es :" );
    System.out.println(numero1+numero2);
    System.out.println("y");

    System.out.println("la resta de " + numero1 + " - " + numero2 + " es :" );
    System.out.println(numero1-numero2);
    System.out.println("y");

    System.out.println("la multiplicacion de " + numero1 + " * " + numero2 + " es :" );
    System.out.println(numero1*numero2);
    System.out.println("y");

    System.out.println("la division de " + numero1 + " / " + numero2 + " es :" );
    System.out.println(numero1/numero2);
    System.out.println("y");

    System.out.println("el módulo " + numero1 + " y " + numero2 + " es :" );
    System.out.println(numero1%numero2);

    num1.close();
    num2.close();
    }    
}
