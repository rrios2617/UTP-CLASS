
package Semana3;
/*
CALCULA EL VALOR DE 3 PRODUCTOS CON DECIMAL Y LUEGO INDICA AL USUARIO SI QUIERE REDONDEAR
PARA DONAR LA DIFERENCIA O NO DONAR, SE USA MATH Y CONDIFICIONALES.
*/
import java.util.Scanner;


public class Condicionales_IF_ELSE {
    public static void main(String[] args) {
        float p1,p2,p3,total, diferencia;
        int redondeo;
        String opcion;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Ingrese el valor del producto 1: ");
        p1 = input.nextFloat();
        System.out.print("Ingrese el valor del producto 2: ");
        p2 = input.nextFloat();
        System.out.print("Ingrese el valor del producto 3: ");
        p3 = input.nextFloat();
        
        total = p1+p2+p3;
        
        System.out.println("La suma de los productos es: "+total);
        
        
        System.out.print("Desea redondear y donar la diferencia(Si/No): ");
        opcion = input.next();
        if (opcion.equalsIgnoreCase("Si")){ // LO QUE HACE EL EQUALSIGNORE CASE ES QUE IGNORA SI SE INTRODUCE MAYUSCULA O MINUSCULA
            redondeo = (int) Math.ceil(total);
            System.out.println("Redondeado los productos es: "+redondeo);
            diferencia = redondeo - total;
            System.out.println("Usted dono: "+diferencia);
            System.out.println("Gracias por donar <3");
        }
        else if (opcion.equalsIgnoreCase("No")){ // LO QUE HACE EL EQUALSIGNORE CASE ES QUE IGNORA SI SE INTRODUCE MAYUSCULA O MINUSCULA
            System.out.println("Seria un total de: "+total);
            System.out.println("Gracias por no donar </3");
        }
        else{
            System.out.println("Vuelve a introducir una opcion correcta: ");
        }
    }
    
}
