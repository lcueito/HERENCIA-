package entida;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import entida.Animal;

/**
 *
 * @author Usuario
 */
public class Perro extends Animal {
    
    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("su perro " +  nombre + " se alimenta de " +  alimento);
    }
    
    
}
