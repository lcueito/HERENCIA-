/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_extra_3;

/**
 *
 * @author Usuario
 */
public class Hotel_4 extends Hoteles{
    protected String nombreResto;
    protected  int capacidadRessto;

    public Hotel_4() {
    }

    public Hotel_4(String nombreResto, int capacidadRessto, int cantHabitaciones, int numCamas, int cantidadPisos, double precioHabitacion, String gym, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numCamas, cantidadPisos, precioHabitacion, gym, nombre, direccion, localidad, gerente);
        this.nombreResto = nombreResto;
        this.capacidadRessto = capacidadRessto;
    }

    @Override
    public double valorPorGym() {
        double valorgym;
        if (this.gym.equalsIgnoreCase("A")) {
            valorgym = 50;
        }else{
            valorgym= 30;
        }
        return valorgym;
    }

    @Override
    public double AgregadoPorResto() {
        double valorresto= 0 ;
        if (this.capacidadRessto < 30) {
            valorresto= 10;
        }else if (this.capacidadRessto >= 30 && this.capacidadRessto <= 50){
            valorresto= 30;
        } else if ( this.capacidadRessto > 50){
            valorresto= 50;
        }
        return valorresto;
    }

    @Override
    public double capacidadHotel() {
      return this.numCamas;
    }

    @Override
    public double precio() {
          return this.precioHabitacion = 50 +(1 * capacidadHotel() ) + AgregadoPorResto() + valorPorGym();
   
    }
    
    
    
}
