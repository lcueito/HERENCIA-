/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadElectro;

import entidadElectro.Electrodomestico;

/**
 *
 * @author Usuario
 */
public  final class Lavadora extends Electrodomestico{
    protected  int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
//    Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//el atributo propio de la lavadora.

public void crearLavadora(){
    super.crearElectrodomestico();
    System.out.println(" ingrese la capacidad de carga de su lavadora ");
    this.carga= leer.nextInt();
}    
//Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//visto en la clase Electrodoméstico también deben afectar al precio.

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if (carga > 30) {
            this.precio += 500;
            
        }
    }

    @Override
    public void MostrarProducto() {
        super.MostrarProducto(); 
        System.out.println(" carga" + carga );
    }
    

}
