
package Semana4;

import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        int opcion;
        Scanner input = new Scanner (System.in);
        System.out.print("Ingrese numero [1,2,3,4,6,12]: ");
        opcion = input.nextInt();
        switch (opcion){
            case 1: 
                System.out.println("Mensual");
                break;
            case 2: 
                System.out.println("Bimestral");
                break;
            case 3: 
                System.out.println("Trimestral");
                break;
            case 4: 
                System.out.println("Cuatrimestral");
                break;
            case 6: 
                System.out.println("Semestral");
                break;
            case 12: 
                System.out.println("Anual");
                break;
            default:
                System.out.println("Número no vlido");
                break;
        }
        
                
    }
    
}
