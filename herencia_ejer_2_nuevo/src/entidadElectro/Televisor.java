/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadElectro;

import entidadElectro.Electrodomestico;
import java.util.Scanner;

/**
 *
 *Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados
 */
public final class Televisor  extends Electrodomestico{
    Scanner leer = new Scanner(System.in);
    protected int pulgadas;
    protected boolean TDT;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean TDT, double precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
//    Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//los atributos del televisor
    public void crearTelevisor(){
        
        super.crearElectrodomestico();
        System.out.println(" ingrese las pulgadas de su tv ");
        this.pulgadas= leer.nextInt();
        System.out.println(" ingrese si su tv tiene sintonizador TDT ( SI / NO ) "); 
       String resp = leer.next();
        if (resp.equalsIgnoreCase("si")) {
            this.TDT=true;
        }else{
            this.TDT= false;
        }
    }
//    Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if (pulgadas > 40) {
             this.precio = this.precio * 1.3 ; 
        }
        
        if (TDT) {
            this.precio+= 500;
        }
    }

    @Override
    public void MostrarProducto() {
        super.MostrarProducto(); 
         System.out.println("  las pulgadas son " + this.pulgadas);
         System.out.println(" posee SINTONIZADOR TDT "  + TDT);
    }
    
    
    
}
