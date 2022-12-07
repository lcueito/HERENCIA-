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
public class Barco {
    protected String matricula;
    protected double eslora;
    protected int aniofabricacion;

    public Barco() {
    }

    public Barco(String matricula, double eslora, int aniofabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.aniofabricacion = aniofabricacion;
    }
    
    public  double valorModludo(){
        
        
    return this.eslora*10;
        
    }
    
    
    
}
