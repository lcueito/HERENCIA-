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
public class AlojamientoExtraHoteleros  extends Alojamiento{
    
    protected boolean privado;
    protected int superficie;

    public AlojamientoExtraHoteleros() {
    }

    public AlojamientoExtraHoteleros(boolean privado, int superficie, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.superficie = superficie;
    }
    
}
