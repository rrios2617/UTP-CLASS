package boleta;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Boleta {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/YYYY");
        SimpleDateFormat sdf2= new SimpleDateFormat("HH:mm:ss"); 
        Date fecha = new Date();   
        
        String cliente,producto, producto2;
        int cantidad, cantidad2;
        double precio,ptotal,ptotal2, precio2,mtotal;
        
        System.out.print("Nombre del cliente: ");
        cliente = lectura.nextLine();
        System.out.print("Nombre del primer producto: ");
        producto = lectura.nextLine();
        System.out.print("Cantidad?: ");
        cantidad = lectura.nextInt();
        System.out.print("Precio?: ");
        precio = lectura.nextDouble();
        ptotal = precio * cantidad;
        
        lectura.nextLine();
        
        
        System.out.print("Nombre del segundo producto: ");
        producto2 = lectura.nextLine();
        System.out.print("Cantidad?: ");
        cantidad2 = lectura.nextInt();
        System.out.print("Precio?: ");
        precio2 = lectura.nextDouble();
        ptotal2 = precio2 * cantidad2;
        mtotal = ptotal + ptotal2;
        
        if (cliente.equalsIgnoreCase("Ana") || cliente.equalsIgnoreCase("Juan")){
            mtotal *=0.95;    
        }
        if (producto.toUpperCase().contains("GAMER") || producto2.toUpperCase().contains("GAMER")){
            mtotal *= 0.98;
        }
        
        
        System.out.println("##################################");
        System.out.println("          TIENDA ABC         ");
        System.out.println("##################################");
        System.out.println("ID: 000000252145");
        System.out.println("            COMPRAS");
        System.out.println("      AV. SAENZ PENIA 376");
        System.out.println("            CHICLAYO");
        System.out.println("      LOTE: B     TERM: 5268");
        System.out.println("##################################");
        System.out.println("Fecha:"+sdf.format(fecha)+"  Hora: "+sdf2.format(fecha));
        System.out.println("    VEND: JUAN         CLI:"+cliente);
        System.out.println("##################################");
        System.out.println("Uni: "+cantidad+"      "+producto+"      (S./"+ptotal+")");
        System.out.println("Uni: "+cantidad2+"      "+producto2+"      (S./"+ptotal2+")");
        System.out.println("PAGO TOTAL: S/. "+mtotal);
        System.out.println("#################################");
        System.out.println("          VUELVA PRONTO!");
        System.out.println("#################################");
    }
    
}