/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.ejer_extra_1;

/**
 *
 * @author Usuario
 */
public class BarcoMotor extends Barco{
     protected int CV;

    public BarcoMotor() {
    }

    public BarcoMotor(int CV, String matricula, double eslora, int aniofabricacion) {
        super(matricula, eslora, aniofabricacion);
        this.CV = CV;
    }

    public int getCV() {
        return CV;
    }

    public void setCV(int CV) {
        this.CV = CV;
    }

    @Override
    public double valorModludo() {
        return super.valorModludo()+ CV; 
    }
     
}
