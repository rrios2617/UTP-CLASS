
package Semana8;
/*
SUMA LOS 50 PRIMEROS NUMEROS PARES
*/
public class Ejercicio_3_for {
    public static void main(String[] args) {
        int suma = 0;
        
        for (int i = 2; i <= 100; i += 2) {
            suma += i;
        }
        
        System.out.println("La suma de los primeros 50 numeros pares es: " + suma);
        
    }

    
}
