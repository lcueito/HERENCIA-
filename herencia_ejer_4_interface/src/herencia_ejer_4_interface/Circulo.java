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
public class Circulo implements calculosFormas  {
    protected double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        double area= PI * radio* radio;
        return area;
    }

    @Override
    public double perimetro() {
       double perimetro = PI * ( radio + radio);
        return perimetro;
    }
    
    
}
