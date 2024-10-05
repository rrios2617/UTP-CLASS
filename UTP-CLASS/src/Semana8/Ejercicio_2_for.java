package Semana8;
/*
MUESTRA LA CANTIDAD DE DIGITOS QUE TIENE UN NUMERO INGRESADO
*/
import java.util.Scanner;

public class Ejercicio_2_for {

    public static void main(String[] args) {
        int contador = 0;
        int numero = 0;
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese un numero a evaluar");
        numero = dato.nextInt();
        while (numero > 0) {
            numero = Math.floorDiv(numero, 10);
            contador = contador + 1;
            System.out.println("El numero tiene " + contador + " digitos");
        }
    }
}
