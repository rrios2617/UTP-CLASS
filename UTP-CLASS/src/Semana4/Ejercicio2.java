
package Semana4;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        int opcion;
        Scanner input = new Scanner (System.in);
        System.out.print("Ingrese numero [1-10]: ");
        opcion = input.nextInt();
        switch (opcion){
            case 1: 
                System.out.println("I");
                break;
            case 2: 
                System.out.println("II");
                break;
            case 3: 
                System.out.println("III");
                break;
            case 4: 
                System.out.println("IV");
                break;
            case 5: 
                System.out.println("V");
                break;
            case 6: 
                System.out.println("VI");
                break;
            case 7: 
                System.out.println("VII");
                break;
            case 8: 
                System.out.println("VIII");
                break;
            case 9: 
                System.out.println("IX");
                break;
            case 10: 
                System.out.println("X");
                break;
            default:
                System.out.println("Número no vlido");
                break;
        }
        
                
    }
    
}
