/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ejer_2_nuevo;

import entidadElectro.Electrodomestico;
import entidadElectro.Lavadora;
import entidadElectro.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Herencia_ejer_2_nuevo {

    /**
     Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
     * @param args
     */
    public static void main(String[] args) {
        int suma =0;
       ArrayList<Electrodomestico> electro = new ArrayList();
        Lavadora lav = new Lavadora();
        System.out.println(" crando primer producto");
        lav.crearLavadora();
        lav.precioFinal();
        electro.add(lav);
       
          Lavadora lav1= new Lavadora();
          System.out.println(" creando segundo producto");
          lav1.crearLavadora();
          lav1.precioFinal();
          electro.add(lav1);
      // System.out.println(" el precio de la lavadora es " +  lav.getPrecio());
        Televisor tv = new Televisor();       
        System.out.println(" crando primer televisor ");
        tv.crearTelevisor();
        tv.precioFinal();
        electro.add(tv);
         Televisor tv1 = new Televisor();     
         System.out.println("crando segundo tv ");
        tv1.crearTelevisor();
        tv1.precioFinal();
        electro.add(tv1);
        
        
        System.out.println("******************************************************************");
        
        
        for (Electrodomestico aux : electro) {
            System.out.println("*********************************************");
            aux.MostrarProducto();
          
            System.out.println("*********************************************");
            suma += aux.getPrecio();
            
        }
     
        System.out.println(" la suma de todos sus productos es :" + suma );
       
    }
    
}
