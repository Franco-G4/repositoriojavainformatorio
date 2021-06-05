import java.util.Scanner;



public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner palabra = new Scanner(System.in);
        System.out.println("ingrese una palabra.");
        String pal = palabra.nextLine().toLowerCase();

        //int contadorVocales = 0;
        char letraArray[] = pal.toCharArray();
        char letra = letraArray[0];
        int contadorLetraRepetida = 0;

    
        for(int j =0;j<letraArray.length;j++){
            int contador = 0;//Antes de recorrer el array pongo el contador en 0
            for(int k=0;k<letraArray.length;k++){
                if(letraArray[j] == letraArray[k]) //Letra encontrada
                    contador++;
            }
            if(contadorLetraRepetida < contador) { //Si la letra actual superó a la que había antes
                contadorLetraRepetida = contador; //Actualiza el contador de repeticiones con el número máximo
                letra = letraArray[j]; //Actualiza la letra
            }
        }

        System.out.println("La letra '" + letra + "' se repite "+ contadorLetraRepetida + " veces.");
        palabra.close();
    }
}