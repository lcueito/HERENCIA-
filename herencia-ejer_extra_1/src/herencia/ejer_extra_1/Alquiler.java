/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.ejer_extra_1;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Alquiler {
    
    private String nombre;
    private int DNI;
    private Date fechaAlquler;
    private Date fechaDevolucion;
   private int posAmarre;
   private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, int DNI, Date fechaAlquler, Date fechaDevolucion, int posAmarre, Barco barco) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaAlquler = fechaAlquler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public Date getFechaAlquler() {
        return fechaAlquler;
    }

    public void setFechaAlquler(Date fechaAlquler) {
        this.fechaAlquler = fechaAlquler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    public int alquler(){
        
       int diferencia = fechaDevolucion.getDay() - fechaAlquler.getDay();
       return (int) (diferencia * barco.valorModludo());
    }
 
}
