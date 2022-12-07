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
public class Hoteles  extends Alojamiento{
    protected  int cantHabitaciones;
    protected int numCamas;
    protected int cantidadPisos;
    protected double precioHabitacion;
   protected String gym;

    public Hoteles() {
    }

    public Hoteles(int cantHabitaciones, int numCamas, int cantidadPisos, double precioHabitacion, String gym, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitacion = 50;
        this.gym = gym;
    }
    
    public double precio(){
        
        return 0;
        
    }
    
    public double capacidadHotel(){
        
        return this.numCamas;
    }
    
    public double AgregadoPorResto(){
        return 0;
    }
    public double valorPorGym(){
        
        return 0;
    }
    
    public double valorPorLimosina(){
        return 0;
    }
}
