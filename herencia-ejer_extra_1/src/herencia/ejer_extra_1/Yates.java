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
public class Yates extends Barco  {
    protected int CV;
    protected int camarotes;

    public Yates() {
    }

    public Yates(int CV, int camarotes, String matricula, double eslora, int aniofabricacion) {
        super(matricula, eslora, aniofabricacion);
        this.CV = CV;
        this.camarotes = camarotes;
    }

    public int getCV() {
        return CV;
    }

    public void setCV(int CV) {
        this.CV = CV;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public double valorModludo() {
        return super.valorModludo() + CV + camarotes; 
    }
    
    
    
}
