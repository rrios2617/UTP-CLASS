
package Semana3;


public class Dados {
    public static void main(String[] args) {
        int dado1,dado2,dado3;
        dado1 = (int)(Math.random()*6)+1;
        
        dado2 = (int)(Math.random()*6)+1;
        
        dado3 = (int)(Math.random()*6)+1;
    
        System.out.println("Dado1 = "+dado1+" \nDado2 = "+dado2+" \nDado3 = "+dado3);
        if (dado1 ==6 && dado2 ==6 && dado3 ==6){
            System.out.println("Excelente");
        }
        else if ((dado1 ==6 && dado2 ==6)||(dado1 ==6 && dado3 ==6)||(dado2 ==6 && dado3 ==6)){
            System.out.println("Muy Bien");
        }
        else if (dado1 ==6 || dado2 ==6 || dado3 ==6){
            System.out.println("Regular");
        }
        else
            System.out.println("Pesimo");
    }
    
}
