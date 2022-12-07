/*
 *Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
 */
package entidadElectro;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Electrodomestico {
    protected double precio;
    protected String color;
    protected char consumo;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
//    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.

    private void ComprobarConsumo( char letra){
        if (letra== 'a' || letra == 'b' || letra=='c' || letra=='d' || letra=='e' || letra=='f' ) {
            this.consumo=letra;
        }else{
            this.consumo='f';
        }
        
    }
//    Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
//usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
//blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
//minúsculas. Este método se invocará al crear el objeto y no será visible.
    
    /**
     * COMPRUEBA QUE EL COLOR INGRESADO POR USUARIO SE CORRECTO 
     * @param color 
     */
    private void comprobarColor(String color ){
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo")|| color.equalsIgnoreCase("azul")|| color.equalsIgnoreCase("gris")) {
            
            this.color= color;
        }else{
            this.color="blanco";
        }
    }
    
//    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.
    Scanner leer = new Scanner(System.in);
    public void crearElectrodomestico(){
        System.out.println(" vamos a empezar su carga ");
        System.out.println(" ingrese el color del elctrodomestico ");
        String color = leer.nextLine();
        System.out.println(" ingrese  el consumo energetico en minusculas ( A,B,C,D,E,F )");
        char letra = leer.next().charAt(0);
        System.out.println("por favor ingrese el peso del producto");
        this.peso= leer.nextInt();
        this.precio=1000d;
        comprobarColor(color);
        ComprobarConsumo( letra);
        
    }
    
//    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
//precio. Esta es la lista de precios:
    
    public void precioFinal(){
        switch(consumo){
            case 'a':
                this.precio+= 1000;
            break;
            case 'b':
                this.precio+= 800;
            break;
            case 'c':
                this.precio+= 600;
            break;
            case 'd':
                this.precio+= 500;
            break;
            case 'e':
                this.precio+= 300;
            break;
            case 'f':
                this.precio+= 100;
            break;
        }
        
        if (peso > 1 && peso < 20) {
            this.precio += 100;
        }else if (peso >= 20 && peso < 50){
            this.precio+= 500;
        }else if (peso >=50 && peso < 80){
           this.precio+=800;
        }else if(peso >= 80){
            this.precio+= 1000;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
    
    
    
    public void MostrarProducto(){
        System.out.println(" ______ mostrando datos   " + "\n" +
                                         " precio " + precio  +"\n"+
                                            " color "  +  color  + "\n" +
                                              " consumo "+ consumo + " \n"+
                                                  " peso " + peso     )   ;
       
    }
    
}
