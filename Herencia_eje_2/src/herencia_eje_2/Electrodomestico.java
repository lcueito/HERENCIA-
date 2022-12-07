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
public class Electrodomestico {
    protected double precio ;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico( String color, char consumoEnergetico, int peso) {
        this.precio = 1000;
        this.color = comprobarColor(color);
        this.consumoEnergetico = consumoEnergetico(consumoEnergetico);
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

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    private char consumoEnergetico( char letra){
        if (letra!='A' || letra != 'B'|| letra != 'C'|| letra != 'D' || letra != 'E' || letra != 'F') {
            return 'F';
        } else{
            return letra;
        }
        
        
    }
    
    private String comprobarColor(String color ){
        if (color!= "blanco" || color != "negro"|| color != "azul"|| color != " rojo"|| color != " gris") {
            return "blanco";
        }else {
            return color;
        }
        
       
    }
  
     public  static Electrodomestico cargarElectrodomestico(){
           Scanner leer = new Scanner(System.in);
         System.out.println(" solicitando datos  por favor ingrese el color ");
        String color1 = leer.next().toLowerCase();
         System.out.println(" por favor ingrese el consumo energetico  ( A , B , C ,D ,E,F  )  ");
        char consumo1  = leer.next().charAt(0);
         System.out.println(" ingrese el peso del producto ");
        int peso2 = leer.nextInt();
         return new Electrodomestico(color1, consumo1, peso2);
     }
     
      public void precioFinal(){
          switch( consumoEnergetico){
              case 'A':
                  this.precio += 1000d;
                  break;
              case 'B':
                  this.precio += 800d;
                  break;
              case 'C':
                 this.precio+= 600;
                  break;
                  case'D':
                      this.precio+= 500;
                              break;
                  case 'E':
                      this.precio+= 300;
                      break;
                  case 'F':
                      this.precio+= 100;
                      break;
          }
          
             if (peso >1 && peso < 20) {
             precio += 100; 
          }else if ( peso >= 20 && peso < 50 ){
               this.precio +=500;
                
      }else if ( peso >= 50 && peso < 80){
          this.precio += 800;
      }else if (peso >= 80 ){
          this.precio+= 1000;
      }
      }
      
//      public void precioPeso(){
//          if (peso >1 && peso < 20) {
//             precio += 100; 
//          }else if ( peso >= 20 && peso < 50 ){
//                precio +=500;
//                
//      }else if ( peso >= 50 && peso < 80){
//          precio += 800;
//      }else if (peso >= 80 ){
//          precio+= 1000;
//      }
//      }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
      
      
}
