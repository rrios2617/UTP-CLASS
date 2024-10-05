/*
CREA UNA SUMA DE * POR CADA LINEA DE 9
*/
package Semana8;

public class Ejercicio_1_for {
    public static void main(String[] args) {
        int repeticiones = 9;
        
        for (int n =1; n<=repeticiones; n++){
            for (int i = 0; i<n; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
    
}
