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
public class Velero  extends Barco{
    protected int numMastiles;

    public Velero() {
    }

    public Velero(int numMastiles, String matricula, double eslora, int aniofabricacion) {
        super(matricula, eslora, aniofabricacion);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public double valorModludo() {
        return super.valorModludo() + numMastiles; 
    }
    
    
    
}
