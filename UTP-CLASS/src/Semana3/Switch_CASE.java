package Semana3;

import java.util.Scanner;

public class Switch_CASE {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("1. Ayuda");
        System.out.println("2. Configuracion");
        System.out.println("3. otros:");
        System.out.println("Necesitas ayuda?(Si/No)");
        System.out.print("Ingrese una opcion:");
        String opcion = input.nextLine();
        opcion = opcion.toLowerCase();
        switch (opcion) {
            case "si":
                System.out.println("Ahora te ayudamos");
                break;
            case "no":
                System.out.println("Okay :/ ");
                break;
            case "1":
                System.out.println("Ingresaste a la opcion de ayuda");
                break;
            case "2":
                System.out.println("Ingresaste a la opcion de configuracion");
                break;
            case "3":
                System.out.println("Ingresaste a la opcion de otros");
                break;
                
            default:
                System.out.println("Ingresa una opcion correcta");
                break;
        }

    }

}
