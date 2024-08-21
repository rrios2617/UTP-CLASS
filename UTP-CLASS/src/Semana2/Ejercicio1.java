/*
EJERCICIO PARA ELEVAR UN NÚMERO CUALQUIERA POR EL USUARIO Y ELEVADO
A UN NÚMERO CUALQUIERA POR EL USUARIO Y QUE EL RESULTADO SE REDONDEE AL NUMERO 
MAS CERCANO
*/

package Semana2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        double n1,n2,resultado;
        Scanner lectura = new Scanner(System.in);
        
        System.out.print("Ingrese el numero base: ");
        n1 = lectura.nextDouble();
        
        System.out.print("Ingrese el numero exponente: ");
        n2 = lectura.nextDouble();
        
        resultado = Math.pow(n1, n2);
        resultado = Math.round(resultado); //redondea al número mas cercano
        System.out.println("El numero "+n1+" elavado a "+n2+" seria: "+resultado);
        
        
    }
    
}
