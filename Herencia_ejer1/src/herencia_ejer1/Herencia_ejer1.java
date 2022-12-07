/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ejer1;

import entida.Perro;
import entida.Animal;
import entida.Caballo;
import entida.Gato;

/**
 *
 * @author Usuario
 */
public class Herencia_ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
   Animal perro1= new Perro("chaci", "huesitos ", 2, " callejero");
   perro1.alimentarse();
   Animal perro2 = new Perro(" toby", " purina ", 3, "ovejero ");
   perro2.alimentarse();
   Animal gato1 = new Gato("roro"," atun" , 6, " persia");             
   gato1.alimentarse();
   
   Animal caballo1 = new Caballo("tornado","pasto" , 2, " el caballo del zorro ");
   caballo1.alimentarse();
    }
    
}
