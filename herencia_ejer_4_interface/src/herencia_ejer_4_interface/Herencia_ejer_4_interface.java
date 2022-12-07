/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_ejer_4_interface;

/**
 *
 * @author Usuario
 */
public class Herencia_ejer_4_interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Circulo c = new Circulo(10);
        System.out.println(" el area del circulo es "+ c.area());
        System.out.println(" el perimetro del circulo es " + c.perimetro());
        
        System.out.println("**************************************************");
        Rectangulo r = new Rectangulo(5, 5);
        System.out.println(" el area del rectangulo es " + r.area());
        System.out.println("el perimetro del rectangulo es " +  r.perimetro());
    }
    
}
