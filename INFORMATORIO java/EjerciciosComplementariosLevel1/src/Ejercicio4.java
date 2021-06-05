import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String [] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("ingrese un numero.");
        int numero = dato.nextInt();

        // int n = 1;
        // for (int i = 1; i <= numero; i++){
        
            System.out.println(fac(numero));
        // }
        dato.close();
        
        }
        public static int fac(int n) {
            int num = 1;
            for (int i = 1; i <= n; i++) {
                num *= i;
            }
            return num;
    }
}
