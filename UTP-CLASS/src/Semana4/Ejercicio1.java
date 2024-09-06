
package Semana4;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        int opcion;
        Scanner input = new Scanner (System.in);
        System.out.print("Ingrese numero [1-5]: ");
        opcion = input.nextInt();
        switch (opcion){
            case 1: 
                System.out.println("Uno");
                break;
            case 2: 
                System.out.println("Dos");
                break;
            case 3: 
                System.out.println("Tres");
                break;
            case 4: 
                System.out.println("Cuatro");
                break;
            case 5: 
                System.out.println("Cinco");
                break;
            default:
                System.out.println("Número no vlido");
                break;
        }
        
                
    }
    
}
