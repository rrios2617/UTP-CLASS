
package Semana2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        double n1;
        int opcion;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Elige el tipo de redondeo:");
        System.out.println("1. Redondeo hacia arriba");
        System.out.println("2. Redondeo hacia abajo");
        System.out.print("Escoga la opcion: ");
        opcion = input.nextInt();
        
        if (opcion==1){
            System.out.print("Ingrese un numero en decimal: ");
            n1 = input.nextDouble();
            n1 = Math.ceil(n1);
            System.out.println("El numero redondeando hacia arriba: "+n1);
        }
        else if (opcion==2){
            System.out.print("Ingrese un numero en decimal: ");
            n1 = input.nextDouble();
            n1 = Math.floor(n1);
            System.out.println("El numero redondeando hacia abajo: "+n1);
        }
        else{
            System.out.println("Eligiste una opcion incorrecta");
        }   
    }
    
}
