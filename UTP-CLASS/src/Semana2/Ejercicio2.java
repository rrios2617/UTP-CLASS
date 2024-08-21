/*
EJERCICIO DONDE SE MUESTRA 2 DADOS QUE SU VALOR ES RANDOM DE 1 AL 6
Y LUEGO SE SUMA EL VALOR DE AMBOS DADOS
*/
package Semana2;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        short dado1,dado2,resultado;
        String jugador;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese el nombre del jugador: ");
        jugador = lectura.next();
        dado1 = (short)((Math.random() * (7-1))+1);
        dado2 = (short)((Math.random() * (7-1))+1);
        resultado = (short) (dado1 + dado2);
        System.out.println("El Jugador "+jugador+" \nSaco en el dado1: "+dado1+" \nY en el dado2: "+dado2+" \nLa suma de los dados es:: "+resultado);
        
        
        
        
    }
    
}
