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
public class Hotel_5 extends Hotel_4 {
    protected  int cantidadSalones;
    protected int cantSuite;
    protected int cantLimosinas;

    public Hotel_5() {
    }

    public Hotel_5(int cantidadSalones, int cantSuite, int cantLimosinas, String nombreResto, int capacidadRessto, int cantHabitaciones, int numCamas, int cantidadPisos, double precioHabitacion, String gym, String nombre, String direccion, String localidad, String gerente) {
        super(nombreResto, capacidadRessto, cantHabitaciones, numCamas, cantidadPisos, precioHabitacion, gym, nombre, direccion, localidad, gerente);
        this.cantidadSalones = cantidadSalones;
        this.cantSuite = cantSuite;
        this.cantLimosinas = cantLimosinas;
    }
    
    
        }
