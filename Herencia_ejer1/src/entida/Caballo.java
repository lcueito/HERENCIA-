/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entida;

import entida.Animal;

/**
 *
 * @author Usuario
 */
public class Caballo extends Animal {
    
    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println(" su caballos " + nombre + " se alimenta de " +  alimento );
    }
    
    
}
