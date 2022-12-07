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
public  final class Televisor extends Electrodomestico {
    protected int pulgadas;
    protected boolean tdt ;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean tdt, String color, char consumoEnergetico, int peso) {
        super(color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }
    
    public  static Televisor creartelevisor(){
        boolean t= false;
        Scanner leer = new Scanner(System.in);
        Electrodomestico tv1 = cargarElectrodomestico();
        System.out.println("ingrese de cuantas pulgadas es su televisor ");
       int  pulgadas1 = leer.nextInt();
        System.out.println(" indique si su TV cuenta con TDT  ( SI / NO ) ");
        String resp = leer.next().toLowerCase();
        
        if (resp.equalsIgnoreCase("SI")) {
             t = true;
        }
         return new Televisor(pulgadas1, t , tv1.getColor(), tv1.getConsumoEnergetico(), tv1.getPeso());
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if (pulgadas > 40 ) {
            setPrecio(getPrecio() * 1.3 );
        }
        if (tdt) {
            setPrecio(getPrecio() + 500 );
        }
    }
    
    
    
}
