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
public class Rectangulo implements calculosFormas {
    protected double base;
    protected double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    

    @Override
    public double area() {
        double area= base * altura;
        return area;
    }

    @Override
    public double perimetro() {
       double perimetro= ( base +altura)* 2;
       return perimetro;
    }
    
    
}
