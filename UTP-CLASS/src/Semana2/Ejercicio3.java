/*
SE REALIZA EL REDONDEO HACIA ARRIBA Y ABAJO SEGUN UNA DECIMAL INTRODUCIDO POR EL 
USUARIO, TAMBIEN SE USA CONDICIONALES.
*/
package Semana2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        double n1;
        int opcion,resultado;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Elige el tipo de redondeo:");
        System.out.println("1. Redondeo hacia arriba");
        System.out.println("2. Redondeo hacia abajo");
        System.out.print("Escoga la opcion: ");
        opcion = input.nextInt();
        
        if (opcion==1){
            System.out.print("Ingrese un numero en decimal: ");
            n1 = input.nextDouble();
            resultado = (int) Math.ceil(n1);
            System.out.println("El numero redondeando hacia arriba: "+resultado);
        }
        else if (opcion==2){
            System.out.print("Ingrese un numero en decimal: ");
            n1 = input.nextDouble();
            resultado = (int) Math.floor(n1);
            System.out.println("El numero redondeando hacia abajo: "+resultado);
        }
        else{
            System.out.println("Eligiste una opcion incorrecta");
        }   
    }
    
}
