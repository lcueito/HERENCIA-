/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_eje_2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Lavadora  extends Electrodomestico{
    protected int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, String color, char consumoEnergetico, int peso) {
        super(color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
      
    public  static Lavadora cargarLavadora(){
        Scanner leer = new Scanner(System.in);
    Electrodomestico el1 =  cargarElectrodomestico();
        System.out.println(" ingrese la capacida de carga en ");
         int carga1= leer.nextInt();
        return new Lavadora(carga1,el1.getColor() ,el1.getConsumoEnergetico(), el1.getPeso());
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if (carga >= 30) {
            setPrecio(getPrecio()+ 500);
        }
    }


    
    
}
