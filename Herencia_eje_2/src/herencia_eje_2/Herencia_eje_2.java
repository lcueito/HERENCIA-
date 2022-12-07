/*
 
 */
package herencia_eje_2;

/**
 *
 * @author Usuario
 */
public class Herencia_eje_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //  Electrodomestico  e =  new Electrodomestico();
       Electrodomestico  lav1  = Lavadora.cargarLavadora();
       
         lav1.precioFinal();
         
         System.out.println(" el precio de la lavadora es " +  lav1.getPrecio());
        System.out.println(lav1.toString());        
    }
    
    public static void cargar(){
        System.out.println(" ingrese que producto desea cargar ");
        System.out.println("1 - lavadora");
        System.out.println(" 2 -  televisor");
    }
}
