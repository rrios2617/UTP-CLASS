
package Semana4;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        int opcion;
        Scanner input = new Scanner (System.in);
        System.out.print("Ingrese numero [1-6]: ");
        opcion = input.nextInt();
        switch (opcion){
            case 1: 
                System.out.println("One");
                break;
            case 2: 
                System.out.println("Two");
                break;
            case 3: 
                System.out.println("Three");
                break;
            case 4: 
                System.out.println("Four");
                break;
            case 5: 
                System.out.println("Five");
                break;
            case 6: 
                System.out.println("Six");
                break;
            default:
                System.out.println("Número no vlido");
                break;
        }
        
                
    }
    
}
